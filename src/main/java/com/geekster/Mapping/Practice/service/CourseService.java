package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.ICourseRepo;
import com.geekster.Mapping.Practice.Repository.IStudentRepo;
import com.geekster.Mapping.Practice.model.Course;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo cr;

    @Autowired
    IStudentRepo sr;

    public void addcourse(Course course) {
        cr.save(course);
    }

    public List<Course> getAllCourse(Long courseId) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(cr.findById(courseId).get());
        return courseList;
    }

    public String deleteCourseById(Long courseId) {
        cr.deleteById(courseId);
        return "Course with id "+courseId + " deleted successfully";
    }

    public String updateCourse(Long courseId, Course course) {
        List<Student> newStudentList = course.getStudentList();
        List<Student> listStudent = new ArrayList<>();

        for(Student student : newStudentList){
            Optional<Student> student1 = sr.findById(student.getStudentId());
            if(student1.isPresent()){
                listStudent.add(student1.get());

            }else{
                throw new IllegalStateException("Student id " +student.getStudentId() + " not present");
            }
        }
        course.setStudentList(listStudent);
        course.setCourseId(courseId);
        cr.save(course);
        return "Course with id "+courseId + " updated successfully";
    }
}
