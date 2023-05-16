package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Address;
import com.geekster.Mapping.Practice.model.Student;
import com.geekster.Mapping.Practice.service.AddressService;
import com.geekster.Mapping.Practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService as;

    @PostMapping(value = "/address")
    public void address(@RequestBody Address address){
        as.address(address);
    }

}
