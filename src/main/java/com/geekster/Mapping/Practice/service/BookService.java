package com.geekster.Mapping.Practice.service;

import com.geekster.Mapping.Practice.Repository.IBookRepo;
import com.geekster.Mapping.Practice.Repository.IStudentRepo;
import com.geekster.Mapping.Practice.model.Book;
import com.geekster.Mapping.Practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo br;

    @Autowired
    IStudentRepo sr;

    public void addbook(Book book) {
        br.save(book);
    }

    public List<Book> getAllBook(Long bookId) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(br.findById(bookId).get());
        return bookList;
    }

    public String deleteBookById(Long bookId) {
        br.deleteById(bookId);
        return "Book with id "+bookId + " deleted successfully";
    }

    public String updateBook(Long bookId, Book book) {
        Optional<Book> optionalbook = br.findById(bookId);
        Student student = book.getStudentBook();
        if(optionalbook.isEmpty()){
            return "Book with id "+bookId + " is not present";
        }else{
            Optional<Student> student1 = sr.findById(student.getStudentId());
            book.setStudentBook(student1.get());

            book.setBookId(bookId);
            br.save(book);
            return "Book with id "+bookId + " updated successfully";
        }
    }
}
