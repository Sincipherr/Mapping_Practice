package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IStudentRepo;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepo sr;

    public void addstudent(Student student) {
        sr.save(student);
    }
}
