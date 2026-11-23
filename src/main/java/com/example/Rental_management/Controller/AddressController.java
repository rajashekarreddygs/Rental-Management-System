package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Address;
import com.example.Rental_management.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addresseService;

    @PostMapping("/insert")
    public Address insert(@RequestBody Address address)
    {
        return addresseService.insert(address);
    }
    @PostMapping("/insertmany")
    public List<Address>insertmany(@RequestBody List<Address>addresses)
    {
    return addresseService.insertMany(addresses);
    }
    @GetMapping("/fetch")
    public List<Address>fetch()
    {
        return addresseService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public Address fetchByid(@PathVariable Integer id)
    {
        return addresseService.fetchById(id);
    }
    @PutMapping("/update/{id}")
    public Address update(@PathVariable Integer id,@RequestBody Address address)
    {
        return addresseService.update(id,address);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return addresseService.delete(id);
    }
}
