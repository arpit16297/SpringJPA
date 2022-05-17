package com.Practice.SpringBootPractice.Controller;


import com.Practice.SpringBootPractice.Entity.Book;
import com.Practice.SpringBootPractice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/books")
    public List<Book> fetchBookList(){
        return bookService.fetchBookList();
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable("id")  Long bookId){
        bookService.deleteBookById(bookId);
        return "Deletion Successfull !!!!";
    }

}