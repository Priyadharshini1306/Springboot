package com.example.E_commerce.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;

}
