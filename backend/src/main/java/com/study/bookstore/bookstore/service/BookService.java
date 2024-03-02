package com.study.bookstore.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.bookstore.bookstore.models.Book;
import com.study.bookstore.bookstore.records.BookWithReviewsRecord;
import com.study.bookstore.bookstore.records.BookRecord;
import com.study.bookstore.bookstore.repository.BookRepository;
import com.study.bookstore.bookstore.utils.RecordUtil;

@Service
public class BookService {
    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepository) {
        this.bookRepo = bookRepository;
    }

    public List<BookRecord> getBooks() {
        return bookRepo.findAll().stream()
                .map(t -> RecordUtil.toBookRecord(t)).toList();
    }

    public BookWithReviewsRecord getBook(long id) {
        var b = bookRepo.findById(id).orElse(
                new Book());
        return RecordUtil.toBookRecordWithReviews(b);
    }

    public BookRecord saveBook(BookRecord book) {
        Book b = new Book();

        b.setBookName(book.bookName());
        b.setBookDesc(book.bookDescription());

        var saved = bookRepo.save(b);

        return RecordUtil.toBookRecord(saved);

    }

    @SuppressWarnings("null")
    public BookRecord deleteBook(long id) {

        var b = bookRepo.findById(id).orElseThrow();
        bookRepo.delete(b);
        return RecordUtil.toBookRecord(b);
    }

    public BookRecord updateBook(long id, BookRecord b) {
        var up = bookRepo.findById(id).orElseThrow();
        if (b.bookName() != null)
            up.setBookName(b.bookName());
        if (b.bookDescription() != null)
            up.setBookDesc(b.bookDescription());
        bookRepo.save(up);
        return RecordUtil.toBookRecord(up);
    }
}
