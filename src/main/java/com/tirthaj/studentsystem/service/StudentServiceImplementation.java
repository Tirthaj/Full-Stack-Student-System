package com.tirthaj.studentsystem.service;

import com.tirthaj.studentsystem.model.student;
import com.tirthaj.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public student saveStudent(student Student) {

        return studentRepository.save(Student);
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}
