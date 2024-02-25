package com.study.bookstore.bookstore.records;

public record BookRecord(
            Long bookId,
            String bookName,
            String bookDescription
            ) { }