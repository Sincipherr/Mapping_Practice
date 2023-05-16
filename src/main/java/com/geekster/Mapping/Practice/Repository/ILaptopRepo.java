package com.geekster.Mapping.Practice.Repository;

import com.geekster.Mapping.Practice.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop,Long> {
}
