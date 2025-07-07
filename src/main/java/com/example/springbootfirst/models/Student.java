package com.example.springbootfirst.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentID;
    private String studentName;

}


//    public Student(int studentID, String studentName) {
//        this.studentID=studentID;
//        this.studentName=studentName;
//    }





