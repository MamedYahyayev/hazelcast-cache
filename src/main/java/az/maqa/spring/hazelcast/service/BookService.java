package az.maqa.spring.hazelcast.service;

import az.maqa.spring.hazelcast.domain.Book;
import az.maqa.spring.hazelcast.model.BookDto;
import az.maqa.spring.hazelcast.repository.BookRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Cacheable("books-cache")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(BookDto bookDto) throws Exception {
        if (bookDto == null) {
            throw new Exception("Book objects is null!!!");
        }

        Book book = new Book();
        book.setIsbn(bookDto.getIsbn());
        book.setTitle(bookDto.getTitle());

        return bookRepository.save(book);
    }
}
