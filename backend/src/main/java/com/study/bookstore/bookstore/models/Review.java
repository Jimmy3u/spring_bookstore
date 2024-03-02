package com.study.bookstore.bookstore.models;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_book_reviews")
public class Review {

    @Id
    @Column(name = "review_id")
    private Long id;

    @Column(name = "review_text", columnDefinition = "TEXT")
    private String reviewText;

    @Column(name = "review_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date reviewDate;

    @ManyToOne()
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    // TODO : Adicionar parte de usuario e notas de review.

    public Review() {
    }

    public String getReviewText() {
        return reviewText;
    }

}
