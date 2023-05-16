package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Course;
import com.geekster.Mapping.Practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService cs;

    @PostMapping(value = "/course")
    public void addcourse(@RequestBody Course course){
        cs.addcourse(course);
    }

}
