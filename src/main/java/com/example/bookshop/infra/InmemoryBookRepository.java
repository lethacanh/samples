package com.example.bookshop.infra;

import com.example.bookshop.models.domain.Book;
import com.example.bookshop.models.domain.BookRepository;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class InmemoryBookRepository implements BookRepository {
    final List<Book> books = new ArrayList<>(10);

    @Override
    public void addNew(@NotNull Book b) {

    }
}
