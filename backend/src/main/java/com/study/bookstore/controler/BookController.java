package com.study.bookstore.controler;

import org.springframework.web.bind.annotation.RestController;

import com.study.bookstore.models.Book;
import com.study.bookstore.records.BookRecord;
import com.study.bookstore.service.BookService;
import com.study.bookstore.utils.RecordUtil;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/book")
public class BookController {
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
    public ResponseEntity<BookRecord> addBook(@RequestBody Book b) {
        var saved = bookService.saveBook(RecordUtil.toBookRecord(b));
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<BookRecord> updateBook(@PathVariable long id, @RequestBody BookRecord b) {
        var up = bookService.updateBook(id, b);
        return ResponseEntity.ok(up);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<BookRecord> deleteBook(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bookService.deleteBook(id));
    }

    @PostMapping("/{id}/addReview")
    public String addReviewToBook(@RequestBody String entity) {
        // TODO: Add review service to add reviews.

        return entity;
    }

}
