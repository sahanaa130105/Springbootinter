package com.example.springbootfirst.service;


import com.example.springbootfirst.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class HelloWorldService {
    List<Student> stu= new ArrayList<>(
            Arrays.asList(
                    new Student(1,"sri"),
                    new Student(2,"karthika"))
    );
//    public String getmethod(){
//        return "THis is Get method";
//    }
//    public String postmethod(){
//        return "THis is post method";
//    }
//    public String putmethod(){
//        return "THis is put method";
//    }
//    public String deletemethod(){
//        return "THis is delete method";
//    }

    public List<Student> getmethod(){

        return stu;
    }
    public Student getStudentById(int studentID ){
        int ind=0;
        boolean flag= false;
        for(int i=0;i<stu.size();i++){
            if(studentID ==stu.get(i).getStudentID()){
                System.out.println("StuedentID:"+stu.get(i).getStudentID()+stu.get(i));
                ind=i;
                flag=true;
                break;
            }
        }
        if(flag){
            return stu.get(ind);
        }else{
            return new Student();
        }
    }
    public String postmethod(Student stud){
        stu.add(stud);
        return "Employee Added Sucessfully";
    }
    public String putmethod(){

        return "THis is put method";
    }
    // update specific id
    public String updateStudentById(Student student){
        int ind=0;
        boolean flag= false;
        for(int i=0;i<stu.size();i++){
            if(student.getStudentID() ==stu.get(i).getStudentID()){
                System.out.println("StudentID:"+stu.get(i).getStudentID()+stu.get(i));
                ind=i;
                flag=true;
                break;
            }
        }
        if(flag){
            stu.set(ind,student);
            return "Updated Sucessfully";
        }else{
            return "Not Found";
        }
    }






    public String deletemethod(){
        return "THis is delete method";
    }
    // delete by specific id
    public String deleteStudentById(int studentID ){
        int ind=0;
        boolean flag= false;
        for(int i=0;i<stu.size();i++){
            if(studentID ==stu.get(i).getStudentID()){
                System.out.println("StudentID:"+stu.get(i).getStudentID()+stu.get(i));
                ind=i;
                flag=true;
                break;
            }
        }
        if(flag){
            stu.remove(ind);
            return "Deleted Sucessfully";
        }else{
            return "Not Found";
        }
    }
}




//
//
//
//
//import com.example.springbootfirst.models.Student;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class HelloWorldService {
//    List<Student> stu= new ArrayList<>(
//            Arrays.asList(
//                    new Student(1,"sri"),
//                    new Student(2,"karthika"))
//    );
//    public List<Student> getMethod(){
//        return stu;
//    }
//    public String postMethod(){
//        return "This is POST Method";
//    }
//    public String putMethod(){
//        return "This is PUT Method";
//    }
//    public String deleteMethod(){
//        return "This is DELETE Method";
//
//    }
//}
