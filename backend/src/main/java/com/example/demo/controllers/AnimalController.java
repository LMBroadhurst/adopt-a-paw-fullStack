package com.example.demo.controllers;

import com.example.demo.models.Animal;
import com.example.demo.repositories.AnimalRepo;
import com.example.demo.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepo animalRepo;
    private AnimalService animalService;

    public AnimalController (AnimalRepo animalRepo, AnimalService animalService) {
        this.animalRepo = animalRepo;
        this.animalService = animalService;
    }


    // CREATE - POST

    // create new animal //
    @PostMapping("/animal")
    public ResponseEntity<List<Animal>> postAnimal(@RequestBody Animal animal) {
        animalRepo.save(animal);
        return new ResponseEntity<>(animalRepo.findAll(), HttpStatus.CREATED);
    }

    // READ - GET

    // get all animals //
    @GetMapping("/animal")
    public ResponseEntity<List<Animal>> getAllAnimals() {
        return new ResponseEntity<>(animalRepo.findAll(), HttpStatus.OK);
    }

    // get animal by species //

//    @GetMapping("/animal/species_id")
//    public ResponseEntity<Optional<Animal>> getAnimalBySpeciesId (@RequestParam (required = true) Integer species_id) {
//        Optional<Animal> chosen = animalRepo.findBy(species_id(species_id));
//        return ResponseEntity
//                .ok()
//                .body(chosen);
//    }

    // UPDATE - PUT
    @PutMapping("/animal/{id}")
    public void updateAnimal(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer species_id,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String breed,
            @RequestParam(required = false) String sex,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String organisation,
            @RequestParam(required = false) Integer organisation_id,
            @RequestParam(required = false) boolean reserved,
            @RequestParam(required = false) boolean adopted
    ){
        animalService.updateAnimal(id, name, species_id, age, breed, sex, location, organisation, organisation_id, reserved, adopted);
    }
}
