package com.librarybackend.rest.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by John on 3/24/2017.
 */
@Entity
@JsonRootName(value = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String tempIsbn;
    private String subject;

    protected Book() {
    }

    public Book(String _id, String title, String author, String publisher, String isbn, String tempIsbn, String subject) {
        this._id = Long.valueOf(_id);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.tempIsbn = tempIsbn;
        this.subject = subject;
    }

    public Book(String _id, String title, String author, String publisher, String isbn, String subject) {
        this._id = Long.valueOf(_id);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.subject = subject;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTempIsbn() {
        return tempIsbn;
    }

    public void setTempIsbn(String tempIsbn) {
        this.tempIsbn = tempIsbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "_id=" + _id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", subject='" + subject + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
