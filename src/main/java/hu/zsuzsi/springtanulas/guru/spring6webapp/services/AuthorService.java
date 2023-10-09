package hu.zsuzsi.springtanulas.guru.spring6webapp.services;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
