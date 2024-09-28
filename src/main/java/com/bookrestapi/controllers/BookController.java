package com.bookrestapi.controllers;

import com.bookrestapi.entity.Book;
import com.bookrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    public BookService bookService = null;

    @GetMapping(value = "/books")
    public List<Book> getbook() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(value = "/book/{id}")
    public Book getBook(@PathVariable(value = "id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping(value = "/book")
    public Book book(@RequestBody Book book){

        return bookService.addBook(book);

    }
}
