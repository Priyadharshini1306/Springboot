package com.example.E_commerce.service;

import com.example.E_commerce.module.User;
import com.example.E_commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String registeruser(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser.isPresent())
        {
            return "Email already registered";
        }
        userRepository.save(user);
        return "Registed successfully";
    }

    public String login(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser.isPresent())
        {
            if(existingUser.get().getPassword().equals(user.getPassword()))
            {
                return "login successful!";
            }
            else {
                return "incorrect password.";
            }
        }
        else {
            return "the user does not exist.";
        }
    }

    public String updateuser(User user) {
        Optional<User> existingUser = userRepository.findById(user.getId());
        if(existingUser.isPresent())
        {
            userRepository.save(user);
            return "updated.";
        }
        else {
            return "the user not found.";
        }
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(new User());
    }

    public String deleteuser(int id) {
        Optional<User> existinguser = userRepository.findById(id);
        if(existinguser.isPresent())
        {
            userRepository.deleteById(id);
            return "deleted.";
        }
        else {
            return "id not found.";
        }

    }
}
