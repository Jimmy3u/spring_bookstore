package com.study.bookstore.records;

public record ReviewRecord(
        String reviewerName,
        String reviewText,
        int reviewRating
        ) { }