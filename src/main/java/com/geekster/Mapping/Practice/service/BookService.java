package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IBookRepo;
import com.geekster.Mapping.Practice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBookRepo br;

    public void addbook(Book book) {
        br.save(book);
    }
}
