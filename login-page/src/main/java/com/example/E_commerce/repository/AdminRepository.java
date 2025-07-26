package com.example.E_commerce.repository;

import com.example.E_commerce.module.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<User,Integer> {
}
