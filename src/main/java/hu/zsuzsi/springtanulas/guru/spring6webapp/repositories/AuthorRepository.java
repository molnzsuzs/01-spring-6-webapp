package hu.zsuzsi.springtanulas.guru.spring6webapp.repositories;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
