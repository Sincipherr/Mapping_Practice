package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.ICourseRepo;
import com.geekster.Mapping.Practice.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepo cr;

    public void addcourse(Course course) {
        cr.save(course);
    }
}
