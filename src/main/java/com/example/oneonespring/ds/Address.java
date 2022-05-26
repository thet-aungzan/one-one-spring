package com.example.oneonespring.ds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String streetName;

    private String city;
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Address() {
    }

    public Address(String streetName, String city, String zipCode) {
        this.streetName = streetName;
        this.city = city;
        this.zipCode = zipCode;
    }
}
