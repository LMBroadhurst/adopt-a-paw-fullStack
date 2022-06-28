package com.example.demo.services;

import com.example.demo.models.Application;
import com.example.demo.repositories.ApplicationRepo;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private ApplicationRepo applicationRepo;
    private AnimalService animalService;
    private CustomerService customerService;

    ApplicationService(ApplicationRepo applicationRepo){
        this.applicationRepo = applicationRepo;
    }


    public void addNewApplication(Long application_type_id, Long animal_id, Long customer_id) throws Exception{

        if (animalService.findByID(animal_id).isEmpty()){
            throw new Exception("Animal not found");
        }
        applicationRepo.addNewApplication(application_type_id, animal_id, customer_id);
    }
}
