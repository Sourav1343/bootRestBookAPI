package com.api.book.bootRestBook.controllers;

import com.api.book.bootRestBook.entity.Book;
import com.api.book.bootRestBook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping(value = "/books")
    public List<Book> getbook(){

        return this.bookService.getAllBooks();
    }
}
