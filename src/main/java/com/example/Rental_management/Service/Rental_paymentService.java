
package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Rental_payments;
import com.example.Rental_management.Repository.Rental_paymentRepository;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Rental_paymentService {
    @Autowired
    Rental_paymentRepository rental_paymentRepository;

    public Rental_payments insert(Rental_payments rental_payments) {
        return rental_paymentRepository.save(rental_payments);
    }

    public List<Rental_payments> insertmany(List<Rental_payments> rental_payments)
    {
        return rental_paymentRepository.saveAll(rental_payments);
    }
    public List<Rental_payments> fetch()
    {
        return rental_paymentRepository.findAll();
    }
    public Rental_payments fetchbyId(Integer id)
    {
        return rental_paymentRepository.findById(id).orElse(null);
    }
    public Rental_payments update(Integer id,Rental_payments rental_payments)
    {
        Rental_payments rental_payments1=rental_paymentRepository.findById(id).orElse(null);
        if (rental_payments1!=null)
        {
            rental_payments1.setPayment_amount(rental_payments.getPayment_amount());
            rental_payments1.setPayment_method(rental_payments.getPayment_method());
            rental_payments1.setPayment_status(rental_payments.getPayment_status());
            return rental_paymentRepository.save(rental_payments1);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(rental_paymentRepository.existsById(id))
        {
            rental_paymentRepository.deleteById(id);
            return "Data deleted Successfully";
        }
        return "id doesn't exists";
    }

}
