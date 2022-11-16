package com.example.Tset1.controller;

import com.example.Tset1.Service.StudentService;
import com.example.Tset1.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentService studentService;

    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return studentService.findAll();
    }
}
