package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Book;
import com.geekster.Mapping.Practice.service.BookService;
import com.geekster.Mapping.Practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bs;

    @PostMapping(value = "/book")
    public void addbook(@RequestBody Book book){
        bs.addbook(book);
    }
}
