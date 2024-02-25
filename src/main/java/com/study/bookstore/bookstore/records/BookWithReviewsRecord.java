package com.study.bookstore.bookstore.records;

import java.util.Set;

import com.study.bookstore.bookstore.models.Review;

public record BookWithReviewsRecord(
        Long bookId,
        String bookName,
        String bookDescription,
        Set<Review> bookReviews) {
}