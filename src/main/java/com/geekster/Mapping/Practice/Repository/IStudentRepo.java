package com.geekster.Mapping.Practice.Repository;

import com.geekster.Mapping.Practice.model.Student;
import com.geekster.Mapping.Practice.service.StudentService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Long> {
}
