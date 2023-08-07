package com.example.bookshop.infra;

import com.example.bookshop.models.core.Book;
import com.example.bookshop.models.core.BookRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public class RelationalDatabaseBookRepository implements BookRepository {

    private final SpringJpaBookRepository jpaRepository;

    public RelationalDatabaseBookRepository(SpringJpaBookRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void addNew(@NotNull Book b) {
        jpaRepository.save(new BookEntity(b));
    }

    public interface SpringJpaBookRepository extends JpaRepository<BookEntity, Long> {

    }

    static class BookEntity {

        String id;
        String title;
        String content;
        String priceCurrency;
        BigDecimal priceAmount;

        private BookEntity(String id, String title, String content, String priceCurrency, BigDecimal priceAmount) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.priceCurrency = priceCurrency;
            this.priceAmount = priceAmount;
        }

        public BookEntity(Book book) {
            new BookEntity(
                    book.getId(),
                    book.getTitle(),
                    book.getContent(),
                    book.getPrice().getCurrency(),
                    book.getPrice().getAmount());
        }
    }
}
