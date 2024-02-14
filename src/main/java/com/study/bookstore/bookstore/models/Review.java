package com.study.bookstore.bookstore.models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Review {
    @ManyToOne()
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
