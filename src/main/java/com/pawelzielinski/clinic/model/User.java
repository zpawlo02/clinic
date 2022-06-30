package com.pawelzielinski.clinic.model;

import com.pawelzielinski.clinic.model.enums.UserStatus;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private String firstName;
    private String lastName;

    private UserStatus userStatus;

    private String pesel;
    private Address address;


}
