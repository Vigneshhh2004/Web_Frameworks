package com.example.qn2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qn2.model.Student;

@RestController
public class StudentController 
{
    @PostMapping("/students")
    public String nameAge()
    {
        Student s = new Student("Nithish", 22);
        return "Student created:" + s.getName()+",Age:"+s.getAge();
    }
}
