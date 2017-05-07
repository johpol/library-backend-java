package com.librarybackend.rest.controller;

import com.librarybackend.rest.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by John on 2/25/2017.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<com.librarybackend.rest.model.Book> book() {
        Iterable<com.librarybackend.rest.model.Book> allBooks = repository.findAll();

        return allBooks;
    }
}
