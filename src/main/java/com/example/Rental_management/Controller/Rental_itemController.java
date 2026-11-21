package com.example.Rental_management.Controller;

import com.example.Rental_management.Service.Rental_itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rental_itemController {
@Autowired
    Rental_itemService rental_itemService;

}
