package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Rental_items;
import com.example.Rental_management.Repository.Rental_itemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Rental_itemsService {

    @Autowired
    Rental_itemsRepository rental_itemsRepository;

    public Rental_items insert(Rental_items data) {
        return rental_itemsRepository.save(data);
    }

    public List<Rental_items> insertmany(List<Rental_items> data) {
        return rental_itemsRepository.saveAll(data);
    }

    public List<Rental_items> fetch() {
        return rental_itemsRepository.findAll();
    }

    public Optional<Rental_items> fetchbyid(Integer id) {
        return rental_itemsRepository.findById(id);
    }

    public Rental_items updatebyid(Integer id, Rental_items newdata) {

        Rental_items olddata = rental_itemsRepository.findById(id).orElse(null);

        if (olddata != null) {
            olddata.setCategory_id(newdata.getCategory_id());
            olddata.setItem_name(newdata.getItem_name());
            olddata.setItem_description(newdata.getItem_description());
            olddata.setItem_image_url(newdata.getItem_image_url());
            olddata.setDaily_rent_price(newdata.getDaily_rent_price());
            olddata.setSecurity_deposit(newdata.getSecurity_deposit());
            olddata.setItem_condition(newdata.getItem_condition());
            olddata.setAvailability_status(newdata.getAvailability_status());

            return rental_itemsRepository.save(olddata);
        }

        return null;
    }

    public String delete(Integer id) {
        rental_itemsRepository.deleteById(id);
        return "Rental item deleted successfully";
    }
}