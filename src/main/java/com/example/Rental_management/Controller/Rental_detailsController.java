package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_details;
import com.example.Rental_management.Service.Rental_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rental_details")
public class Rental_detailsController {

    @Autowired
    Rental_detailsService rental_detailsService;

    @PostMapping("/insert")
    public Rental_details insert(@RequestBody Rental_details data) {
        return rental_detailsService.insert(data);
    }

    @PostMapping("/insertmany")
    public List<Rental_details> insertmany(@RequestBody List<Rental_details> data) {
        return rental_detailsService.insertmany(data);
    }

    @GetMapping("/fetch")
    public List<Rental_details> fetch() {
        return rental_detailsService.fetch();
    }

    @GetMapping("/fetchbyid/{id}")
    public Optional<Rental_details> fetchbyid(@PathVariable Integer id) {
        return rental_detailsService.fetchbyid(id);
    }

    @PutMapping("/updatebyid/{id}")
    public Rental_details updatebyid(@PathVariable Integer id, @RequestBody Rental_details data) {
        return rental_detailsService.updatebyid(id, data);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return rental_detailsService.delete(id);
    }
}