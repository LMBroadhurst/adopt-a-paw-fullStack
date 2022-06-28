package com.example.demo.controllers;

import com.example.demo.services.ApplicationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService){
        this.applicationService = applicationService;
    }

    @PostMapping("addNewApplication/{application_type_id}/{animal_id}/{customer_id}")
    public String addNewApplication(@PathVariable("application_type_id") Long application_type_id,
                                    @PathVariable("animal_id") Long animal_id,
                                    @PathVariable("customer_id") Long customer_id){

        applicationService.addNewApplication(application_type_id,animal_id,customer_id);

        return "added";

    }


}
