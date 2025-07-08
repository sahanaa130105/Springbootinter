package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Student;

import com.example.springbootfirst.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping("/{studentID}")
    public Student getStudentByID(@PathVariable int studentID) {
        return hws.getStudentsByID(studentID);
    }

    @GetMapping("/dept/{dept}")
    public List<Student> getStudentByDept(@PathVariable String dept) {
        return hws.getStudentsByDept(dept);
    }


    @PostMapping
    public String addStudent(@RequestBody Student stud){
        return hws.addStudent(stud);
    }


    @PutMapping("/{studentID}")
    public String updateStudent(@RequestBody Student student) {
        return hws.UpdateStudent(student);
    }


    @DeleteMapping("/{studentID}")
    public String deleteStudentById(@PathVariable int studentID)  {
        return hws.deleteStudentById(studentID);
    }
}
