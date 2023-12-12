package com.tirthaj.studentsystem.controller;

import com.tirthaj.studentsystem.model.student;
import com.tirthaj.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody student Student){
        studentService.saveStudent(Student);
        return "New Student is added";
    }

    @GetMapping("/all")
    public List<student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
