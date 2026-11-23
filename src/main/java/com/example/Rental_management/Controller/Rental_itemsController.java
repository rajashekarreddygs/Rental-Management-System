package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_items;
import com.example.Rental_management.Service.Rental_itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rental_items")
public class Rental_itemsController {
    @Autowired
    Rental_itemsService rental_itemsService;
    @PostMapping("/insert")
    public Rental_items insert(@RequestBody Rental_items rental_items) {
        return rental_itemsService.insert(rental_items);
    }

    @PostMapping("/insertmany")
    public List<Rental_items> insertmany(@RequestBody List<Rental_items> rental_items) {
        return rental_itemsService.insertmany(rental_items);
    }

    @GetMapping("/fetch")
    public List<Rental_items> fetch() {
        return rental_itemsService.fetch();
    }

    @GetMapping("/fetchbyid/{id}")
    public Optional fetchbyid(@PathVariable Integer id) {
        return rental_itemsService.fetchbyid(id);
    }



    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        rental_itemsService.delete(id);
        return "Rental item deleted successfully";
    }

}
