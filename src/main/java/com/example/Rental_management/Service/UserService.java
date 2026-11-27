package com.example.Rental_management.Service;

import com.example.Rental_management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User insert(User user) {
        return userRepository.save(user);
    }

    public List<User> insertMany(List<User> users)
    {
        return userRepository.saveAll(users);
    }


    public List<User> fetch()
    {
        return userRepository.findAll();
    }

    public User fetchById(Integer id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public User update(Integer id, User user)
    {
        User user1=userRepository.findById(id).orElse(null);
                if(user1!=null)
                {
                user1.setFull_name(user.getFull_name());
                user1.setEmail(user.getEmail());
                user1.setPassword(user.getPassword());
                user1.setPhon_number(user.getPhon_number());
                user1.setTrust_score(user.getTrust_score());
                return userRepository.save(user1);
                }
                return null;
    }

    public String delete(Integer id)
    {
        if(userRepository.existsById(id))
        {
            userRepository.deleteById(id);
            return "deleted succesfully";
        }
        return null;
    }
}
