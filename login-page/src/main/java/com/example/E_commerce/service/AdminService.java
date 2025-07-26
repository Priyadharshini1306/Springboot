package com.example.E_commerce.service;

import com.example.E_commerce.module.User;
import com.example.E_commerce.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public List<User> getAllUsers()
    {
        return adminRepository.findAll();
    }

    public String deleteuser(int id) {
        Optional<User> existinguser = adminRepository.findById(id);
        if(existinguser.isPresent())
        {
            adminRepository.deleteById(id);
            return "deleted.";
        }
        else {
            return " id not found";
        }
    }

    public String clearAll() {
        adminRepository.deleteAll();
        return "cleared";
    }
}
