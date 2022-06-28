package com.example.demo.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column
    private Integer species_id;

    private Integer age;

    private String breed;

    // make this enum
    private String gender;

    private String location;

    private String organisation;

    @Column
    private Integer organisation_id;

    private boolean reserved;

    private boolean adopted;



    // no arg constructor
    public Animal() {
    }

    // arg constructor
    public Animal (Long id, String name, Integer species_id, Integer age, String breed, String gender, String location, String organisation, Integer organisation_id, boolean reserved, boolean adopted) {
        this.id = id;
        this.name = name;
        this.species_id = species_id;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.location = location;
        this.organisation = organisation;
        this.organisation_id = organisation_id;
        this.reserved = reserved;
        this.adopted = adopted;
    }

    // getters + setters


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

    public Integer getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Integer species_id) {
        this.species_id = species_id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public Integer getOrganisation_id() {
        return organisation_id;
    }

    public void setOrganisation_id(Integer organisation_id) {
        this.organisation_id = organisation_id;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
}
