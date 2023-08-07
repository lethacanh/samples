package com.example.bookshop.models.core;

public class Book {
    String id;
    String title;
    String content;
    Money price;

    public Book(String id, String title, String content, Money price) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Money getPrice() {
        return price;
    }
}
