package com.study.bookstore.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.bookstore.bookstore.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
