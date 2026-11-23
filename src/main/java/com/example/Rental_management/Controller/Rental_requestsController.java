package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Rental_requests;
import com.example.Rental_management.Service.Rental_requestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rental_requests")
public class Rental_requestsController {
    @Autowired
    Rental_requestsService rental_requestsService;

    @PostMapping("/insert")
    public Rental_requests insert(@RequestBody Rental_requests rental_requests) {
        return rental_requestsService.insert(rental_requests);
    }

    @PostMapping("/insertmany")
    public List<Rental_requests> insertmany(@RequestBody List<Rental_requests> rental_requests) {
        return rental_requestsService.insertmany(rental_requests);
    }

    @GetMapping("/fetch")
    public List<Rental_requests> fetch() {
        return rental_requestsService.fetch();
    }

    @GetMapping("/fetchbyid/{id}")
    public Rental_requests fetchbyid(@PathVariable Integer id) {
        return rental_requestsService.fetchbyid(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        rental_requestsService.delete(id);
        return "Rental request deleted successfully";
    }

}
