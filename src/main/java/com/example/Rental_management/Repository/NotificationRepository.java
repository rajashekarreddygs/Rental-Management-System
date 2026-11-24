package com.example.Rental_management.Repository;

import com.example.Rental_management.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification ,Integer>
{
}
