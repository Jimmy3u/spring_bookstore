package com.study.bookstore.bookstore.utils;

import com.study.bookstore.bookstore.models.Book;
import com.study.bookstore.bookstore.records.BookRecord;
import com.study.bookstore.bookstore.records.BookWithReviewsRecord;

public class RecordUtil {
    public static BookRecord toRecord(Book b) {
        return new BookRecord(b.getBookId(), b.getBookName(), b.getBookName());
    }

    public static BookWithReviewsRecord toBookDetailedRecord(Book b) {
        return new BookWithReviewsRecord(b.getBookId(), b.getBookName(), b.getBookDescription(), b.getBookReviews());
    }
}
