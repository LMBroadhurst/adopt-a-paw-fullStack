package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "organisations")
public class Organisation {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
