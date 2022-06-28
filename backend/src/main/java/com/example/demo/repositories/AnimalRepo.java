package com.example.demo.repositories;

import com.example.demo.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AnimalRepo extends JpaRepository <Animal, Long> {

    Optional<Animal> findByBreed (String breed);

    @Query(value = "SELECT * FROM animal WHERE breed LIKE %:breed%", nativeQuery = true)
    List<Animal> findByBreedLike(@Param("breed") String breed);
}
