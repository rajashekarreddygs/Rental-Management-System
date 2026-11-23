package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Rental_details;
import com.example.Rental_management.Repository.Rental_detailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Rental_detailsService {
    @Autowired
    Rental_detailsRepository rental_detailsRepository;

    public Rental_details insert(Rental_details rental_details) {
        return rental_detailsRepository.save(rental_details);
    }

    public List<Rental_details> insertmany(List<Rental_details> rental_details) {
        return rental_detailsRepository.saveAll(rental_details);
    }

    public List<Rental_details> fetch() {
        return rental_detailsRepository.findAll();
    }

    public Optional<Rental_details> fetchbyid(Integer id) {
        return rental_detailsRepository.findById(id);
    }

    public void delete(Integer id) {
        rental_detailsRepository.deleteById(id);
    }
}
