package com.Practice.SpringBootPractice.Service;

import com.Practice.SpringBootPractice.Entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

    public List<Book> fetchBookList();

    public void deleteBookById(Long bookId);
}
