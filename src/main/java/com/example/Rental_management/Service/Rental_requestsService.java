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

    public Rental_requests insert(Rental_requests data) {
        return rental_requestsRepository.save(data);
    }

    public List<Rental_requests> insertmany(List<Rental_requests> data) {
        return rental_requestsRepository.saveAll(data);
    }

    public List<Rental_requests> fetch() {
        return rental_requestsRepository.findAll();
    }

    public Optional<Rental_requests> fetchbyid(Integer id) {
        return rental_requestsRepository.findById(id);
    }

    public Rental_requests updatebyid(Integer id, Rental_requests newdata) {

        Rental_requests olddata = rental_requestsRepository.findById(id).orElse(null);

        if (olddata != null) {
            olddata.setItem_id(newdata.getItem_id());
            olddata.setRental_start_date(newdata.getRental_start_date());
            olddata.setRental_end_date(newdata.getRental_end_date());
            olddata.setRental_status(newdata.getRental_status());

            return rental_requestsRepository.save(olddata);
        }

        return null;
    }

    public String delete(Integer id) {
        rental_requestsRepository.deleteById(id);
        return "Rental request deleted successfully";
    }
}