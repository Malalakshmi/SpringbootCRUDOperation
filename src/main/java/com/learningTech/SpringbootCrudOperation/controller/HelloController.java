package com.learningTech.SpringbootCrudOperation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${welcome.message}") // this line will take value from properties file
    private String WelcomeMessage;

    @GetMapping("/")
    public String Hello(){
        return WelcomeMessage;

    }
}
