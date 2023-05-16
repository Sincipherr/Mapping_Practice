package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IAddressRepo;
import com.geekster.Mapping.Practice.model.Address;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo ar;

    public void address(Address address) {
        ar.save(address);
    }
}
