package com.example.loginsecurity.model;

import jakarta.persistence.*;

//so actually the role class we are manually creating
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // fixed 'Strategy' typo
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // Default constructor (required by JPA)
    public Role() {
    }

    // Constructor with parameters
    public Role(String name) {
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Optional: toString (useful for debugging/logging)
    @Override
    public String toString() {
        return "Role{id=" + id + ", name='" + name + "'}";
    }
}
