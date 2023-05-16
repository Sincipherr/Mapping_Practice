package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Student;
import com.geekster.Mapping.Practice.service.StudentService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService ss;

    @PostMapping(value = "/student")
    public void addstudent(@RequestBody Student student){
        ss.addstudent(student);
    }

    @GetMapping(value = "/getstudent")
    public List<Student> getAllStudent(@Nullable @RequestParam Long studentId){
        return ss.getAllStudent(studentId);
    }

    @DeleteMapping("/delete/{studentId}")
    public String deleteStudentById(@PathVariable Long studentId){
        return ss.deleteStudentById(studentId);
    }

    @PutMapping("/update/{studentId}")
    public String updateStudent(@PathVariable Long studentId , @RequestBody Student student){
        return ss.updateStudent(studentId , student);
    }
}
