package com.example.demo.services;


import com.example.demo.models.Animal;
import com.example.demo.repositories.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepo animalRepo;
    @Transactional


    // UPDATE ANIMAL METHOD
    public void updateAnimal(Long id, String name, Integer species_id, Integer age, String breed, String sex, String location, String organisation, Integer organisation_id, boolean reserved, boolean adopted) {
        Animal animal = animalRepo.findById(id).orElseThrow(() -> new IllegalStateException("Animal with " + id + " does not exist!"));
        if (animal.getName() != null && !Objects.equals(animal.getName(), name)) {
            animal.setName(name);
        }
        if (animal.getSpecies_id() != null && !Objects.equals(animal.getSpecies_id(), species_id)) {
            animal.setSpecies_id(species_id);
        }
        if (animal.getAge() != null && !Objects.equals(animal.getAge(), age)) {
            animal.setAge(age);
        }
        if (animal.getBreed() != null && !Objects.equals(animal.getBreed(), breed)) {
            animal.setBreed(breed);
        }
        if (animal.getSex() != null && !Objects.equals(animal.getSex(), sex)) {
            animal.setSex(sex);
        }
        if (animal.getLocation() != null && !Objects.equals(animal.getLocation(), location)) {
            animal.setLocation(location);
        }
        if (animal.getOrganisation() != null && !Objects.equals(animal.getOrganisation(), organisation)) {
            animal.setOrganisation(organisation);
        }
        if (animal.getOrganisation_id() != null && !Objects.equals(animal.getOrganisation_id(), name)) {
            animal.setOrganisation_id(organisation_id);
        }
        if (!animal.isReserved()) {
            animal.setReserved(true || false);
        }
        if (!animal.isAdopted()) {
            animal.setAdopted(true || false);
        }
    }

    // DELETE ANIMAL METHOD
    public void deleteAnimal(Long id) {
        boolean exists = animalRepo.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    "Animal with id: " + id + " does not exist!");
        }
        animalRepo.deleteById(id);
    }

    
}
