package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Rental_requests;
import com.example.Rental_management.Repository.Rental_requestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Rental_requestsService {
    @Autowired
    Rental_requestsRepository rental_requestsRepository;

    public Rental_requests insert(Rental_requests rental_requests) {
        return rental_requestsRepository.save(rental_requests);
    }

    public List<Rental_requests> insertmany(List<Rental_requests> rental_requests) {
        return rental_requestsRepository.saveAll(rental_requests);
    }

    public List<Rental_requests> fetch() {
        return rental_requestsRepository.findAll();
    }

    public Optional<Rental_requests> fetchbyid(Integer id) {
        return rental_requestsRepository.findById(id);
    }

    public void delete(Integer id) {
        rental_requestsRepository.deleteById(id);
    }
}
