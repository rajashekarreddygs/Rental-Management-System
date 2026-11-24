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

    public Rental_details insert(Rental_details data) {
        return rental_detailsRepository.save(data);
    }

    public List<Rental_details> insertmany(List<Rental_details> data) {
        return rental_detailsRepository.saveAll(data);
    }

    public List<Rental_details> fetch() {
        return rental_detailsRepository.findAll();
    }

    public Optional<Rental_details> fetchbyid(Integer id) {
        return rental_detailsRepository.findById(id);
    }

    public Rental_details updatebyid(Integer id, Rental_details newdata) {

        Rental_details olddata = rental_detailsRepository.findById(id).orElse(null);

        if (olddata != null) {
            olddata.setRental_requests(newdata.getRental_requests());
            olddata.setTotal_rental_amount(newdata.getTotal_rental_amount());
            olddata.setActual_pickup_date(newdata.getActual_pickup_date());
            olddata.setActual_return_date(newdata.getActual_return_date());
            olddata.setRental_status(newdata.getRental_status());

            return rental_detailsRepository.save(olddata);
        }

        return null;
    }

    public String delete(Integer id) {
        rental_detailsRepository.deleteById(id);
        return "Rental details deleted successfully";
    }
}