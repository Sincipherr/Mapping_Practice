package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Student;
import com.geekster.Mapping.Practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService ss;

    @PostMapping(value = "/student")
    public void addstudent(@RequestBody Student student){
        ss.addstudent(student);
    }
}
