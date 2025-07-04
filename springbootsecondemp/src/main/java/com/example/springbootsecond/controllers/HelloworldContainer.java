package com.example.springbootsecond.controllers;
import com.example.springbootsecond.services.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloworldContainer {
    @Autowired
    private HelloworldService hws;

    @GetMapping("/")
    public String hello() {
        return hws.helloworld();
    }

    @PostMapping("/")
    public String postMethod() {
        return hws.postMethod();
    }
    @PutMapping("/")
    public String putMethod() {
        return hws.putMethod();
    }

    @DeleteMapping("/")
    public String deleteMethod() {
        return hws.deleteMethod();
    }

}