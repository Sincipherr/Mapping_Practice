package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IAddressRepo;
import com.geekster.Mapping.Practice.model.Address;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo ar;

    public void address(Address address) {
        ar.save(address);
    }

    public List<Address> getAllAddress(Long addressId) {
        List<Address> addressList = new ArrayList<>();
        addressList.add(ar.findById(addressId).get());
        return addressList;
    }

    public String deleteAddressById(Long addressId) {
        ar.deleteById(addressId);
        return "Address with id "+addressId + " deleted successfully";
    }

    public String updateAddress(Long addressId, Address address) {
        address.setAddressId(addressId);
        ar.save(address);
        return "Address with id "+addressId + " updated successfully";
    }
}
