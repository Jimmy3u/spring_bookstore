package com.study.bookstore.bookstore.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    /*
     * TODO: Terminar implementação, adicionar ISBN, preços e checar interações com as reviews.
     *      - Nomear os campos das tabelas e checar tipos e validação
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bookName;
    private String bookDescription;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private Set<Review> bookReviews;

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Set<Review> getBookReviews() {
        return bookReviews;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", bookDescription=" + bookDescription + ", bookReviews="
                + bookReviews + "]";
    }

}
