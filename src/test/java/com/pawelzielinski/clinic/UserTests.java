package com.pawelzielinski.clinic;

import com.pawelzielinski.clinic.model.Address;
import com.pawelzielinski.clinic.model.User;
import com.pawelzielinski.clinic.model.enums.UserStatus;
import com.pawelzielinski.clinic.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootTest
@EnableAutoConfiguration
@EnableJpaRepositories("com.pawelzielinski*")
@ComponentScan({"com.pawelzielinski*"})
public class UserTests {


    @Autowired
    private UserService userService;

    @Test
    public void addNewPatientUser(){
        Address address = new Address("Lublin", "Skierki 1", "Polska", "20-601");
        User user = new User("Pawel", "Ziel", UserStatus.RECEPTIONIST, "00311304435", address);

        User userd = userService.addNewUser(user);

        Assertions.assertNotNull(userd, userd.toString());
    }

    @Test
    public void findUserByPesel(){
        String pesel = "00333333333";
        Address address = new Address("Lublin", "Skierki 1", "Polska", "20-601");
        User user = new User("Pawel", "Ziel", UserStatus.PATIENT, pesel, address);

        User userd = userService.addNewUser(user);
        User userFoundByPesel  = userService.findUserByPesel(pesel);

        Assertions.assertEquals(pesel, userFoundByPesel.getPesel());

    }

}
