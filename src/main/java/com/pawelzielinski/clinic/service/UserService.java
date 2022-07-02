package com.pawelzielinski.clinic.service;

import com.pawelzielinski.clinic.model.User;
import com.pawelzielinski.clinic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addNewUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllUsersByFirstName(String firstName){
        return userRepository.findAllByFirstName(firstName);
    }

    public User findUserByPesel(String pesel){
        return userRepository.findUserByPesel(pesel);
    }
}
