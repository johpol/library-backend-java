package com.librarybackend.rest.controller;

import com.librarybackend.rest.dao.BookRepository;
import com.librarybackend.rest.domain.BookLookup;
import com.librarybackend.rest.domain.VolumeInfo;
import com.librarybackend.rest.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by John on 2/25/2017.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> book() {
        Iterable<Book> allBooks = repository.findAll();

        return allBooks;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book book(@RequestBody Book book) {
        String url = "https://www.googleapis.com/books/v1/volumes";
        String param = "?q=isbn:" + book.getTempIsbn();

        RestTemplate template = new RestTemplate();
        BookLookup bookLookup = template.getForObject(url + param, BookLookup.class);

        VolumeInfo volumeInfo = bookLookup.getItems().get(0).getVolumeInfo();

        String title = volumeInfo.getTitle();
        String author = volumeInfo.getAuthors().get(0);
        String publisher = volumeInfo.getPublisher();
        String isbn = volumeInfo.getIndustryIdentifiers().get(0).getIdentifier();
        String subject = volumeInfo.getCategories() == null ? "" : volumeInfo.getCategories().get(0);

        Book bk = new Book(title, author, publisher, isbn, subject);

        repository.save(bk);

        return bk;
    }
}
