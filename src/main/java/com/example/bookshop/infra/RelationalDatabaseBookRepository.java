package com.example.infra;

import com.example.domain.models.Book;
import com.example.domain.models.BookRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class RelationalDatabaseBookRepository implements BookRepository {

    private final JpaRepository jpaRepository;

    public RelationalDatabaseBookRepository(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public interface innerSpringJpaBookRepository extends JpaRepository<Book, Long> {

    }
}
