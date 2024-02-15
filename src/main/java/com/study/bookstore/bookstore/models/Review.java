package com.study.bookstore.bookstore.models;

import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_reviews")
public class Review {
    @Id
    private Long id;
    private String reviewText;

    @ManyToOne()
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    //TODO : Adicionar parte de usuario e notas de review.

    public Review() {}

    public String getReviewText() {
        return reviewText;
    }

}
