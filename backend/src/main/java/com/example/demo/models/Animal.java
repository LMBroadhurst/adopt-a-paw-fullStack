package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer species_id;

    public Animal() {

    }
}
