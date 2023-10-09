package hu.zsuzsi.springtanulas.guru.spring6webapp.repositories;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
