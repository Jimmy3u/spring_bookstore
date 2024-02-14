package com.study.bookstore.bookstore.models;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Book {
    @Id
    @GeneratedValue()
    private long id;
    private String bookName;
    private String bookDescription;

    @OneToMany(mappedBy = "book")
    private Set<Review> bookReviews;
}
