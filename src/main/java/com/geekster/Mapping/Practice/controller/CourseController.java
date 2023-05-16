package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Course;
import com.geekster.Mapping.Practice.service.CourseService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService cs;

    @PostMapping(value = "/course")
    public void addcourse(@RequestBody Course course){
        cs.addcourse(course);
    }
    @GetMapping(value = "/getcourse")
    public List<Course> getAllCourse(@Nullable @RequestParam Long courseId){
        return cs.getAllCourse(courseId);
    }

    @DeleteMapping("/delete/{courseId}")
    public String deleteCourseById(@PathVariable Long courseId){
        return cs.deleteCourseById(courseId);
    }

    @PutMapping("/update/{courseId}")
    public String updateCourse(@PathVariable Long courseId , @RequestBody Course course){
        return cs.updateCourse(courseId , course);
    }
}
