package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated
    private
//    private Integer species_id;

    public Animal() {

    }
}
