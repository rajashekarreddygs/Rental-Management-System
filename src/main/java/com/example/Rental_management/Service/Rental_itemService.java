package com.example.Rental_management.Service;

import com.example.Rental_management.Repository.Rental_itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rental_itemService {
    @Autowired
    Rental_itemRepository rental_itemRepository;
}
