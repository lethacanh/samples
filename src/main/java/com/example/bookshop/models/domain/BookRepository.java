package com.example.bookshop.models.domain;

import org.jetbrains.annotations.NotNull;

public interface BookRepository {

    void addNew(@NotNull Book b);
}
