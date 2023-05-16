package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.ILaptopRepo;
import com.geekster.Mapping.Practice.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo lr;

    public void addlaptop(Laptop laptop) {
        lr.save(laptop);
    }
}
