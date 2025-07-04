package com.example.springbootfirst.services;
import com.example.springbootfirst.models.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {
    List<Students> stu= new ArrayList<>(
            Arrays.asList(
                    new Students(1,"sri"),
                    new Students(2,"karthika"))
    );
    public List<Students> getMethod(){
        return stu;
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
