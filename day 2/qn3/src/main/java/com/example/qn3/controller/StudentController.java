package com.example.qn3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qn3.model.Student;

@RestController
public class StudentController 
{
    @GetMapping("/student")
    public Student msg()
    {
        Student s = new Student(1L, "John Doe", "This is a student description");
        return s;
    }
}

