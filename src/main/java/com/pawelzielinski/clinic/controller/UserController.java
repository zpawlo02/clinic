package com.pawelzielinski.clinic.controller;

import com.pawelzielinski.clinic.model.User;
import com.pawelzielinski.clinic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    final String api = "/user-api";

    @Autowired
    private UserService userService;

    @PostMapping(api+"/addUser")
    public User addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @GetMapping(api+"/getUsersByFirstName")
    public List<User> getUsersByFirstName(@RequestParam String firstName){
        return userService.findAllUsersByFirstName(firstName);
    }

    @GetMapping(api+"/getUserByPesel")
    public User getUserByPesel(@RequestParam String pesel){
        return userService.findUserByPesel(pesel);
    }

}
