package com.example.infra;

import com.example.domain.models.Book;
import com.example.domain.models.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class InmemoryBookRepository implements BookRepository {
    final List<Book> books = new ArrayList<>(10);
}
