package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private int age;

    private String location;

    @Column(name = "previous_adoptions" , columnDefinition = "boolean default false")
    private Boolean previousAdoptions;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getPreviousAdoptions() {
        return previousAdoptions;
    }

    public void setPreviousAdoptions(Boolean previousAdoptions) {
        this.previousAdoptions = previousAdoptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer (){
    }
}
