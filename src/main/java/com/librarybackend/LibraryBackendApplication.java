package com.librarybackend;

import com.librarybackend.rest.dao.BookRepository;
import com.librarybackend.rest.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryBackendApplication {

    private static final Logger log = LoggerFactory.getLogger(LibraryBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LibraryBackendApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(BookRepository repository) {
        return (args) -> {
            repository.save(new Book(
                    "1",
                    "SomeTitle",
                    "SomeAuthor",
                    "SomePublisher",
                    "1234567890",
                    "SomeSubject"));
            repository.save(new Book(
                    "2",
                    "SomeTitle2",
                    "SomeAuthor2",
                    "SomePublisher",
                    "2345678901",
                    "SomeSubject"));

            log.info("All books found with findAll():");
            log.info("-------------------------------");
            for (Book book : repository.findAll()) {
                log.info(book.toString());
            }
        };
    }
}
