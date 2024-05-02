package com.project.floodriskmanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String region;
    private String address;
    private String pinCode;
    private String mobileNo;
    private String emailId;
    private String password;
    private String cPassword;
    private boolean active;

}
