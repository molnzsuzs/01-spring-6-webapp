package hu.zsuzsi.springtanulas.guru.spring6webapp.repositories;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
