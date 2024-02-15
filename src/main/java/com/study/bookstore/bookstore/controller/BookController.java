package com.study.bookstore.bookstore.controller;

import org.springframework.web.bind.annotation.RestController;

import com.study.bookstore.bookstore.models.Book;
import com.study.bookstore.bookstore.service.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    /*
     * TODO: Implementar metodos para adição de livros, reviews
     */
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<Book> getAllboks() {
       return bookService.getBooks();
    }
    
}
