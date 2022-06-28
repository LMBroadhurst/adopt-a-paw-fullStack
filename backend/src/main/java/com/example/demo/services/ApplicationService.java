package com.example.demo.services;

import com.example.demo.models.Application;
import com.example.demo.repositories.ApplicationRepo;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ApplicationService {

    private ApplicationRepo applicationRepo;

    ApplicationService(ApplicationRepo applicationRepo){
        this.applicationRepo = applicationRepo;
    }


    public String addNewApplication(Long application_type_id, Long animal_id, Long customer_id){


            applicationRepo.addNewApplication(application_type_id,animal_id,customer_id);




        return "added";
    }
}
