package com.study.bookstore.bookstore.records;

public record ReviewRecord(
        String reviewerName,
        String reviewText,
        int reviewRating
        ) { }