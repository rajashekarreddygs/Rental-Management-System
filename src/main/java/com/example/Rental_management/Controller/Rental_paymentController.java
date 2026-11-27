package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_payments;
import com.example.Rental_management.Service.Rental_paymentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rental_payments")
public class Rental_paymentController{
    @Autowired
    Rental_paymentService rental_paymentService;
    @PostMapping("/insert")
    public Rental_payments insert(@RequestBody Rental_payments rental_payments)
    {
        return rental_paymentService.insert(rental_payments);
    }
    @PostMapping("/insertmany")
    public List<Rental_payments> insertmany(@RequestBody List<Rental_payments> rental_payments)
    {
        return rental_paymentService.insertmany(rental_payments);
    }
    @GetMapping("/fetch")
    public List<Rental_payments> fetch()
    {
        return rental_paymentService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public Rental_payments fetchbyid(@PathVariable Integer id)
    {
        return rental_paymentService.fetchbyId(id);
    }
    @PutMapping("/update/{id}")
    public Rental_payments update(@PathVariable Integer id,@RequestBody Rental_payments rental_payments)
    {
        return rental_paymentService.update(id,rental_payments);
    }
    @DeleteMapping("/delete/{id}")
    public String deletebyid(@PathVariable Integer id)
    {
        return rental_paymentService.delete(id);
    }
}


