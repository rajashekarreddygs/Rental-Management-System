package com.example.Rental_management.Controller;

import com.example.Rental_management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

@PostMapping("/insert")
    public User insert(@RequestBody User user)
    {
       return userService.insert(user);
    }
@PostMapping("/insertmany")
    public List<User>insertmany(@RequestBody List<User>users)
    {
        return userService.insertMany(users);
    }
    @GetMapping("/fetch")
    public List<User>fetch()
    {
        return userService.fetch();
    }
    @GetMapping("/fetch/{id}")
    public User fetchById(@PathVariable Integer id)
    {
        return userService.fetchById(id);
    }
    @PutMapping("update/{id}")
    public User update(@PathVariable Integer id,@RequestBody User user)
    {
        return userService.update(id,user) ;
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return userService.delete(id);
    }
}
