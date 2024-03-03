package com.study.bookstore.records;

import java.util.Set;

import com.study.bookstore.models.Review;

public record BookWithReviewsRecord(
        Long bookId,
        String bookName,
        String bookDescription,
        Set<Review> bookReviews) {
}