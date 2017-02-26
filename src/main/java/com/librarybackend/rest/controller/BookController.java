package com.librarybackend.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by John on 2/25/2017.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @RequestMapping(method = RequestMethod.GET)
    public String book() {
        return "Book";
    }
}
