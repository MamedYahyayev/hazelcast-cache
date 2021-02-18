package az.maqa.spring.hazelcast.controller;

import az.maqa.spring.hazelcast.domain.Book;
import az.maqa.spring.hazelcast.model.BookDto;
import az.maqa.spring.hazelcast.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * GET /api/books  -- get all books
     *
     * @return book list with 200 ok status
     */
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.findAllBooks();
        return ResponseEntity.ok(books);
    }

    /**
     * POST /api/book
     *
     * @param bookDto dto objects for creating new book
     * @return book object with ok (200) status
     * @throws Exception occurs when dto object is null
     */
    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody BookDto bookDto) throws Exception {
        Book book = bookService.saveBook(bookDto);
        return ResponseEntity.ok(book);
    }


}
