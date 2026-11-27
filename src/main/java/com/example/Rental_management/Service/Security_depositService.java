package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Security_deposit;
import com.example.Rental_management.Repository.Security_depositRepository;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class Security_depositService {
    @Autowired
    Security_depositRepository security_depositRepository;
    public Security_deposit insert(Security_deposit security_deposit)
    {
        return security_depositRepository.save(security_deposit);
    }
    public List<Security_deposit> insertmany(List<Security_deposit> security_deposits)
    {
        return security_depositRepository.saveAll(security_deposits);
    }
    public List<Security_deposit> fetch()
    {
        return security_depositRepository.findAll();
    }
    public Security_deposit fetchbyid(Integer id)
    {
        return security_depositRepository.findById(id).orElse(null);
    }
    public Security_deposit update(Integer id,Security_deposit security_deposit)
    {
        Security_deposit security_deposit1=security_depositRepository.findById(id).orElse(null);
        if(security_deposit1!=null)
        {
            security_deposit1.setDeposit_amount(security_deposit.getDeposit_amount());
            security_deposit1.setRefund_status(security_deposit.getRefund_status());
            return security_depositRepository.save(security_deposit1);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(security_depositRepository.existsById(id))
        {
            security_depositRepository.findById(id);
            return "Data Deleted Successfully";
        }
        return "Id Doesn't existed";
    }
}

