package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "users")
@Data // Lombok annotation for getters, setters, toString, etc.
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}
