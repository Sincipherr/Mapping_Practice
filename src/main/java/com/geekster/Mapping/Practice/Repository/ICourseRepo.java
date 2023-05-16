package com.geekster.Mapping.Practice.Repository;

import com.geekster.Mapping.Practice.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course,Long> {
}
