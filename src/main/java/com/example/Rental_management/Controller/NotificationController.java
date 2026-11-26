package com.example.Rental_management.Controller;

import com.example.Rental_management.Entity.Notification;
import com.example.Rental_management.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @PostMapping("/insert")
    public Notification insert(@RequestBody Notification notification)
    {
        return notificationService.insert(notification);
    }
    @PostMapping("/insertmany")
    public List<Notification>insertMany(@RequestBody List<Notification>notifications)
    {
        return notificationService.insertMany(notifications);
    }
    @GetMapping("/fetch")
    public List<Notification>fetch()
    {
        return notificationService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public Notification fetchByid(@PathVariable Integer id)
    {
        return notificationService.fetchByid(id);
    }
    @PutMapping("update/{id}")
    public Notification update(@PathVariable Integer id,@RequestBody Notification notification)
    {
        return notificationService.update(id,notification);
    }
    @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable Integer id)
   {
        return notificationService.delete(id);
   }
}
