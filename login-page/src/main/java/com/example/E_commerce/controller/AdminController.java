package com.example.E_commerce.controller;

import com.example.E_commerce.module.User;
import com.example.E_commerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @GetMapping("/admin/users")
    public List<User> getAllUsers()
    {
        return adminService.getAllUsers();
    }
    @DeleteMapping("/admin/delete/{id}")
    public String deleteuser(@PathVariable("id") int id)
    {
        return adminService.deleteuser(id);
    }
    @DeleteMapping("admin/clearall")
    public String clearAll()
    {
        return adminService.clearAll();
    }
}
