package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Laptop;
import com.geekster.Mapping.Practice.service.LaptopService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService ls;

    @PostMapping(value = "laptop")
    public void addlaptop(@RequestBody Laptop laptop){
        ls.addlaptop(laptop);
    }

    @GetMapping(value = "/getlap")
    public List<Laptop> getAllLaptop(@Nullable @RequestParam Long laptopId){
        return ls.getAllLaptop(laptopId);
    }

    @DeleteMapping("/delete/{laptopId}")
    public String deleteLaptopById(@PathVariable Long laptopId){
        return ls.deleteLaptopById(laptopId);
    }

    @PutMapping("/update/{LaptopId}")
    public String updateLaptop(@PathVariable Long LaptopId , @RequestBody Laptop laptop){
        return ls.updateLaptop(LaptopId , laptop);
    }

}
