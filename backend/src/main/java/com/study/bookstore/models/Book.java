package com.study.bookstore.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_book")
public class Book {
    /*
     * TODO: Terminar implementação, adicionar ISBN, preços e checar interações com
     * as reviews.
     * - Nomear os campos das tabelas e checar tipos e validação
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_description")
    private String bookDesc;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Review> bookReviews;

    public Book() {
    }

    public long getBookId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDescription) {
        this.bookDesc = bookDescription;
    }

    public Set<Review> getBookReviews() {
        return bookReviews;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", bookDescription=" + bookDesc + ", bookReviews="
                + bookReviews + "]";
    }

}
