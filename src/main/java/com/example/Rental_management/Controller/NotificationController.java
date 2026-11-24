package com.example.Rental_management.Controller;

import com.example.Rental_management.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificationController {
    @Autowired
    NotificationService notificationService;
}
