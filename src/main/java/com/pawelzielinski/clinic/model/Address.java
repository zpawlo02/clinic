package com.pawelzielinski.clinic.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
@Data
@RequiredArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    @Size(min = 1)
    private String city;

    @NonNull
    @Size(min = 1)
    private String street;

    @NonNull
    @Size(min = 1)
    private String country;

    @NonNull
    @Size(min = 1)
    private String postalCode;

    public Address() {
    }
}
