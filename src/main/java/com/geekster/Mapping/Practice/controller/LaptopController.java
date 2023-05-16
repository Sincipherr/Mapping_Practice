package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Laptop;
import com.geekster.Mapping.Practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    LaptopService ls;

    @PostMapping(value = "laptop")
    public void addlaptop(@RequestBody Laptop laptop){
        ls.addlaptop(laptop);
    }

}
