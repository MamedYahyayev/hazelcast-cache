package az.maqa.spring.hazelcast.service;

import az.maqa.spring.hazelcast.domain.Book;
import az.maqa.spring.hazelcast.repository.BookRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Cacheable("books")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
