package com.example.E_commerce.controller;

import com.example.E_commerce.module.User;
import com.example.E_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id)
    {
        return userService.getUserById(id);
    }
    @PostMapping("/register")
    public String registeruser(@RequestBody User user)
    {
        return userService.registeruser(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        return userService.login(user);
    }
    @PutMapping("/user/update")
    public String updateuser(@RequestBody User user)
    {
        return userService.updateuser(user);
    }
    @DeleteMapping("/user/delete/{id}")
    public String deleteuser(@PathVariable int id)
    {
        return userService.deleteuser(id);
    }

}
