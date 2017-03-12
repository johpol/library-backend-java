package com.librarybackend.rest.domain;

import java.util.List;

/**
 * Created by John on 3/11/2017.
 */
public class Book {
    private List<Item> items;

    public Book() {

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
