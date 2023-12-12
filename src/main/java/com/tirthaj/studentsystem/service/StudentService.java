package com.tirthaj.studentsystem.service;

import com.tirthaj.studentsystem.model.student;

import java.util.List;

public interface StudentService {
    public student saveStudent(student Student);
    public List<student> getAllStudents();

}
