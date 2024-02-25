package com.study.bookstore.bookstore.controller;

import org.springframework.web.bind.annotation.RestController;

import com.study.bookstore.bookstore.records.BookRecord;
import com.study.bookstore.bookstore.service.BookService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/books")
public class BookController {
    /*
     * TODO: Implementar metodos para adição de livros, reviews
     */
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<BookRecord> getAllboks() {
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bookService.getBook(id));
    }

    @PostMapping("/add")
    public String addBook(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PutMapping("/update/{id}")
    public String updateBook(@PathVariable String id, @RequestBody String entity) {
        // TODO: process PUT request

        return entity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BookRecord> deleteBook(@PathVariable("id") Long id){
        return ResponseEntity.ok(bookService.deleteBook(id));
    }

    @PostMapping("/{id}")
    public String addReviewToBook(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

}
