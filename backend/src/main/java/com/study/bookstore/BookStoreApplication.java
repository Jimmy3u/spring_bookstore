package com.study.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.bookstore.models.Book;
import com.study.bookstore.models.User;
import com.study.bookstore.repository.BookRepository;
import com.study.bookstore.repository.UserRepository;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(BookRepository bookRepository, UserRepository userRepository) {
		return args -> {

			// create a new book
			Book book = new Book();
			book.setBookName("Teste");
			book.setBookDesc("Teste2");

			// save the book
			bookRepository.save(book);

			Book book2 = new Book();
			book2.setBookName("Teste2");
			book2.setBookDesc("Teste3");

			// save the book
			bookRepository.save(book2);
			// create and save new pages

			User a = new User();
			a.setUserEmail("teste@gmail.com");
			a.setUserName("Carlos silva");
			userRepository.save(a);
		};
	}

}
