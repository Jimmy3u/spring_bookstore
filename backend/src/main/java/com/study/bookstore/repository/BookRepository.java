package com.study.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.bookstore.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
