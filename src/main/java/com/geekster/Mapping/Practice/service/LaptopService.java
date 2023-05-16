package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.ILaptopRepo;
import com.geekster.Mapping.Practice.Repository.IStudentRepo;
import com.geekster.Mapping.Practice.model.Laptop;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo lr;

    @Autowired
    IStudentRepo sr;

    public void addlaptop(Laptop laptop) {
        lr.save(laptop);
    }

    public List<Laptop> getAllLaptop(Long laptopId) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(lr.findById(laptopId).get());
        return laptopList;

    }

    public String deleteLaptopById(Long laptopId) {
        lr.deleteById(laptopId);
        return "Laptop with id "+laptopId + " deleted successfully";
    }

    public String updateLaptop(Long laptopId, Laptop laptop) {
        Optional<Laptop> optionalLaptop = lr.findById(laptopId);
        Student student = laptop.getStudent();
        if(optionalLaptop.isEmpty()){
            return "Laptop with id "+laptopId + " is not present";
        }else{
            Optional<Student> student1 = sr.findById(student.getStudentId());
            laptop.setStudent(student1.get());
            laptop.setLaptopId(laptopId);
            lr.save(laptop);
            return "Laptop with id "+laptopId + " updated successfully";
        }
    }
}
