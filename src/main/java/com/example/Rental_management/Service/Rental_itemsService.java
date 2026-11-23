package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Rental_items;
import com.example.Rental_management.Repository.Rental_itemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class Rental_itemsService {
    @Autowired
    Rental_itemsRepository rental_itemsRepository;
    public Rental_items insert(Rental_items rental_items) {
        return rental_itemsRepository.save(rental_items);
    }

    public List<Rental_items> insertmany(List<Rental_items> rental_items) {
        return rental_itemsRepository.saveAll(rental_items);
    }

    public List<Rental_items> fetch() {
        return rental_itemsRepository.findAll();
    }

    public Optional<Rental_items> fetchbyid(Integer id) {
        return rental_itemsRepository.findById(id);
    }


    public void delete(Integer id) {
        rental_itemsRepository.deleteById(id);
    }


}
