package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Security_deposit;
import com.example.Rental_management.Service.Security_depositService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Security_deposit")
public class Security_depositController {
    @Autowired
    Security_depositService security_depositService;
    @PostMapping("/insert")
    public Security_deposit insert(@RequestBody Security_deposit security_deposit)
    {
        return security_depositService.insert(security_deposit);
    }
    @PostMapping("/insertmany")
    public List<Security_deposit> insertmany(@RequestBody List<Security_deposit> security_deposits)
    {
        return security_depositService.insertmany(security_deposits);
    }
    @GetMapping("/fetch")
    public List<Security_deposit> fetch()
    {
        return security_depositService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public Security_deposit fetchbyid(@PathVariable Integer id)
    {
        return security_depositService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public Security_deposit update(@PathVariable Integer id,@RequestBody Security_deposit security_deposits)
    {
        return security_depositService.update(id,security_deposits);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return security_depositService.delete(id);
    }
}

