package com.example.oneonespring.ds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

//1.Direction -Uni,Bi
//2.Ownership -not Uni,
//Bi ======>


@Entity
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String hobby;

    @OneToOne
    private Address address;

    public Customer() {

    }

    public Customer(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }
}
