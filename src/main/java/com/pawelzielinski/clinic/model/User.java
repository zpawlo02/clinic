package com.pawelzielinski.clinic.model;

import com.pawelzielinski.clinic.model.enums.UserStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Size(min = 1)
    private String firstName;

    @NonNull
    @Size(min = 1)
    private String lastName;

    @NonNull
    @Enumerated
    private UserStatus userStatus;

    @NonNull
    @Size(min = 11, max = 11)
    private String pesel;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    public User() {
    }
}
