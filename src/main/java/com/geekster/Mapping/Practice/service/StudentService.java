package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IStudentRepo;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo sr;

    public void addstudent(Student student) {
        sr.save(student);
    }

    public List<Student> getAllStudent(Long studentId) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(sr.findById(studentId).get());
        return studentList;
    }

    public String deleteStudentById(Long studentId) {
        sr.deleteById(studentId);
        return "Student with id "+studentId + " deleted successfully";

    }

    public String updateStudent(Long studentId, Student student) {
        Optional<Student> optionalStudent = sr.findById(studentId);
        if(optionalStudent.isEmpty()){
            return "Student with id "+studentId + " is not present";
        }else{
            student.setStudentId(studentId);
            sr.save(student);
            return "Student with id "+studentId + " updated successfully";
        }
    }
}
