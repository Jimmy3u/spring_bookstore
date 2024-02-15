package com.study.bookstore.bookstore;

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

			// create and save new pages
			
		};
	}
}
