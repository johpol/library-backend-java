package com.librarybackend.rest.dao;

import com.librarybackend.rest.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by John on 3/25/2017.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String bookTitle);
}
