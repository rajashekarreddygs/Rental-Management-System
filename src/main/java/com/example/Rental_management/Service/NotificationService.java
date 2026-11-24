package com.example.Rental_management.Service;

import com.example.Rental_management.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;
}
