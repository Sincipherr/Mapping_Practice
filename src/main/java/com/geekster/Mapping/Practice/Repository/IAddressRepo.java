package com.geekster.Mapping.Practice.Repository;

import com.geekster.Mapping.Practice.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
}
