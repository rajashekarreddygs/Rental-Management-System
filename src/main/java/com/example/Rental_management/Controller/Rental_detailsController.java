package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_details;
import com.example.Rental_management.Service.Rental_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rental_details")
public class Rental_detailsController {
    @Autowired
    Rental_detailsService rental_detailsService;

    @PostMapping("/insert")
    public Rental_details insert(@RequestBody Rental_details rental_details) {
        return rental_detailsService.insert(rental_details);
    }

    @PostMapping("/insertmany")
    public List<Rental_details> insertmany(@RequestBody List<Rental_details> rental_details) {
        return rental_detailsService.insertmany(rental_details);
    }

    @GetMapping("/fetch")
    public List<Rental_details> fetch() {
        return rental_detailsService.fetch();
    }

    @GetMapping("/fetchbyid/{id}")
    public Rental_details fetchbyid(@PathVariable Integer id) {
        return rental_detailsService.fetchbyid(id).orElse(null);
    }



    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        rental_detailsService.delete(id);
        return "Rental details deleted successfully";
    }
}
