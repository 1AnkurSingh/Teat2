package com.example.Tset1.Service;

import com.example.Tset1.dao.StudentRepository;
import com.example.Tset1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
