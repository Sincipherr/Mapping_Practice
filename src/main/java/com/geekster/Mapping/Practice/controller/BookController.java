package com.geekster.Mapping.Practice.controller;

import com.geekster.Mapping.Practice.model.Book;
import com.geekster.Mapping.Practice.service.BookService;
import com.geekster.Mapping.Practice.service.LaptopService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bs;

    @PostMapping(value = "/book")
    public void addbook(@RequestBody Book book){
        bs.addbook(book);
    }

    @GetMapping(value = "/getbook")
    public List<Book> getAllBook(@Nullable @RequestParam Long bookId){
        return bs.getAllBook(bookId);
    }

    @DeleteMapping("/delete/{bookId}")
    public String deleteBookById(@PathVariable Long bookId){
        return bs.deleteBookById(bookId);
    }

    @PutMapping("/update{bookId}")
    public String updateBook(@PathVariable Long bookId , @RequestBody Book book){
        return bs.updateBook(bookId , book);
    }
}
