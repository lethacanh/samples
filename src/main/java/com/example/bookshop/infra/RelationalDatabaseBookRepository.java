package com.example.bookshop.infra;

import com.example.bookshop.models.core.Book;
import com.example.bookshop.models.core.BookRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public class RelationalDatabaseBookRepository implements BookRepository {

    private final JpaRepository jpaRepository;

    public RelationalDatabaseBookRepository(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void addNew(@NotNull Book b) {

    }

    public interface innerSpringJpaBookRepository extends JpaRepository<Book, Long> {

    }
}
