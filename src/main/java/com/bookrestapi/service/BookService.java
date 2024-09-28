package com.bookrestapi.service;

import com.bookrestapi.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(12,"JAVA People in List","AXYXX"));
        list.add(new Book(13,"JAVA People in List 2","AXYXX 2"));
        list.add(new Book(14,"JAVA People in List 3","AXYXX 3"));
        list.add(new Book(125,"ablc","suieuwi"));
    }
  public List<Book> getAllBooks(){
        return list;
  }
  public Book getBookById(int id){
        //JAVa 8 Stream API;
      Book book;
     book= list.stream().filter(e->e.getId()==id).findFirst().get();
      return book;
  }

    public Book addBook(Book book) {

        list.add(book);
         return book;
    }
}
