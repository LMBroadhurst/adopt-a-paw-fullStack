package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
