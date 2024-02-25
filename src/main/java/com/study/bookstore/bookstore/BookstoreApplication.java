package com.study.bookstore.bookstore;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.bookstore.bookstore.models.Book;
import com.study.bookstore.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(BookRepository bookRepository) {
		return args -> {

			// create a new book
			Book book = new Book();
			book.setBookName("Teste");
			book.setBookDescription("Teste2");

			// save the book
			bookRepository.save(book);

			Book book2 = new Book();
			book2.setBookName("Teste2");
			book2.setBookDescription("Teste3");

			// save the book
			bookRepository.save(book2);
			// create and save new pages
		};
	}
}
