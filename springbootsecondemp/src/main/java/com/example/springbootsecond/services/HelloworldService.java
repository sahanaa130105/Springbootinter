package com.example.springbootsecond.services;
import com.example.springbootsecond.models.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class HelloworldService {
    List<Employee> emp = new ArrayList<>(Arrays.asList(new Employee(1,"sana",  "developer"), new Employee(2,"jaya","product manager"))
    );
    public String helloworld(){
        return "This is GET Method";
    }
    public String postMethod(){
        return "This is POST Method";
    }
    public String putMethod(){
        return "This is PUT Method";
    }
    public String deleteMethod(){
        return "This is DELETE Method";
    }
}
