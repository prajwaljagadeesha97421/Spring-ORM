package com.upgrad.movie.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name = "FIRST_NAME" , length =20 , nullable = false)
    private String firstName;
    @Column(name = "LAST_NAME" , length =20 , nullable = false)
    private String lastName;
    @Column(name = "USER_NAME" , length =20 , nullable = false , unique = true)
    private String userName;
    @Column(name = "PASSWORD" , length =20 , nullable = false)
    private String password;
    @Column(name = "DATE_OF_BIRTH" , nullable = false)
    private LocalDateTime dateOfBirth;
}
