package com.example.Rental_management.Service;

import com.example.Rental_management.Entity.Notification;
import com.example.Rental_management.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public Notification insert(Notification notification) {
        return notificationRepository.save(notification);
    }

    public List<Notification> insertMany(List<Notification> notifications) {
        return notificationRepository.saveAll(notifications);
    }

    public List<Notification> fetch() {
        return notificationRepository.findAll();
    }

    public Notification fetchByid(Integer id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public Notification update(Integer id, Notification notification) {
        Notification notification1 = notificationRepository.findById(id).orElse(null);

            if (notification1 != null) {
                notification1.setNotification_message(notification.getNotification_message());
                notification1.setCreated_at(notification.getCreated_at());
                notification1.setIs_read(notification.getIs_read());
                notification1.setNotification_type(notification.getNotification_type());
                notification1.setRental_details(notification.getRental_details());
                notification1.setUser(notification.getUser());
                return notificationRepository.save(notification1);
            }
            return null;
    }

    public String delete(Integer id)
    {
        if(notificationRepository.existsById(id))
        {
            notificationRepository.deleteById(id);
            return "deleted succesfully";
        }
        return null;
    }
}
