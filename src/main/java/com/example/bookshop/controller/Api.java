package com.example.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Api {
    @GetMapping
    public BookInfo getBook(){
        return new BookInfo();
    }

    private static class BookInfo {
    }
}