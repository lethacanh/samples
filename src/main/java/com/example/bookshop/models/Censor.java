package com.example.bookshop.models;

public interface Censor {
    CensorResult handle(String content);
}
