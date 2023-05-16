package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Address;
import com.geekster.Mapping.Practice.model.Student;
import com.geekster.Mapping.Practice.service.AddressService;
import com.geekster.Mapping.Practice.service.StudentService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService as;

    @PostMapping(value = "/address")
    public void address(@RequestBody Address address){
        as.address(address);
    }

    @GetMapping(value = "/get")
    public List<Address> getAllAddress(@Nullable @RequestParam Long addressId){
        return as.getAllAddress(addressId);
    }

    @DeleteMapping("/delete/{addressId}")
    public String deleteAddressById(@PathVariable Long addressId){
        return as.deleteAddressById(addressId);
    }

    @PutMapping("/update/{addressId}")
    public String updateAddress(@PathVariable Long addressId , @RequestBody Address address){
        return as.updateAddress(addressId , address);
    }
}
