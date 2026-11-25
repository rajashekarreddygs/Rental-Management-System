package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_items;
import com.example.Rental_management.Service.Rental_itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rental_items")
public class Rental_itemsController {

    @Autowired
    Rental_itemsService rental_itemsService;

    @PostMapping("/insert")
    public Rental_items insert(@RequestBody Rental_items data) {
        return rental_itemsService.insert(data);
    }

    @PostMapping("/insertmany")
    public List<Rental_items> insertmany(@RequestBody List<Rental_items> data) {
        return rental_itemsService.insertmany(data);
    }

    @GetMapping("/fetch")
    public List<Rental_items> fetch() {
        return rental_itemsService.fetch();
    }

    @GetMapping("/fetchbyid/{id}")
    public Optional<Rental_items> fetchbyid(@PathVariable Integer id) {
        return rental_itemsService.fetchbyid(id);
    }

    @PutMapping("/updatebyid/{id}")
    public Rental_items updatebyid(@PathVariable Integer id, @RequestBody Rental_items data) {
        return rental_itemsService.updatebyid(id, data);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return rental_itemsService.delete(id);
    }
}