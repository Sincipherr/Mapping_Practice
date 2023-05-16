package com.geekster.Mapping.Practice.Repository;

import com.geekster.Mapping.Practice.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book,Long> {
}
