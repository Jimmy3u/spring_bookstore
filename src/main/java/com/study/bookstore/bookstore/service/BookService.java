package com.study.bookstore.bookstore.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.study.bookstore.bookstore.models.Book;
import com.study.bookstore.bookstore.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepository){
        this.bookRepo = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

    public void saveBook(Book b){
        if(b !=null)
            bookRepo.save(b);
    }

    
}
