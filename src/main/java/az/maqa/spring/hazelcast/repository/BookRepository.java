package az.maqa.spring.hazelcast.repository;

import az.maqa.spring.hazelcast.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
