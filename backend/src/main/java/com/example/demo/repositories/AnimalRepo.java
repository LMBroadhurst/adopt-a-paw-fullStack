package com.example.demo.repositories;

import com.example.demo.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepo extends JpaRepository <Animal, Long> {

    // input query stuff here :)
}
