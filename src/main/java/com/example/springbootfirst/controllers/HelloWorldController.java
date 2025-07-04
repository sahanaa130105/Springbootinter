package com.example.springbootfirst.controllers;
import com.example.springbootfirst.models.Students;
import com.example.springbootfirst.services.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class HelloWorldController {
    @Autowired
    HelloWorldService hws;


    @GetMapping("/")
    public List<Students> hello(){
        return hws.getMethod();

    }
    @PutMapping("/")
    public String putMethod() {
        return hws.putMethod();
    }

    @PostMapping("/")
    public String postMethod() {
        return hws.postMethod();
    }

    @DeleteMapping ("/")
    public String deleteMethod() {
        return hws.deleteMethod();
    }

}


//public class HelloWorldController {
//    @GetMapping("/")
//    public String hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
//    }
//}