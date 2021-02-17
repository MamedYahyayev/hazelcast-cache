package az.maqa.spring.hazelcast.controller;

import az.maqa.spring.hazelcast.domain.Book;
import az.maqa.spring.hazelcast.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

   /* @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody BookDto bookDto) {
        Optional<Book> book = bookService.saveBook(bookDto);
       return ResponseEntity.of(book);
    }*/


}
