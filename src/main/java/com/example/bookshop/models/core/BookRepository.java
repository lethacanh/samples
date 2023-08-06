package com.example.bookshop.models.core;

import org.jetbrains.annotations.NotNull;

public interface BookRepository {

    void addNew(@NotNull Book b);
}
