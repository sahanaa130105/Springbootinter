package com.example.springbootfirst.controllers;
import com.example.springbootfirst.models.Student;
import com.example.springbootfirst.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//
//import org.springframework.web.bind.annotation.RestController;
//
import java.util.List;


@RestController
@RequestMapping("/stud")

public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping("/")
    public List<Student> getmethod() {

        return hws.getmethod();
    }
    // for retriving based on id specified:
    @GetMapping("/{studentID}")
    public Student getStudentById(@PathVariable int studentID)  {
        return hws.getStudentById(studentID);
    }

    @PostMapping("/")
    public String postmethod(@RequestBody Student stud){
        //Student stud = new Student(3,"Threya");
        return hws.postmethod(stud);
    }
    @PutMapping("/")
    public String putmethod() {
        return hws.putmethod();
    }

    @PutMapping("/{studentID}")
    public String putmethod(@RequestBody Student student) {
        return hws.updateStudentById(student);
    }
    @DeleteMapping("/")
    public String deletemethod(){

        return hws.deletemethod();
    }
    @DeleteMapping("/{studentID}")
    public String deleteStudentById(@PathVariable int studentID)  {
        return hws.deleteStudentById(studentID);
    }

}


//public class HelloWorldController {
//    @GetMapping("/")
//    public String hello(){
//        System.out.println("Hello world");
//        return "Hello world this is universe";
//    }
//}