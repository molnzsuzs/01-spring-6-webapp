package hu.zsuzsi.springtanulas.guru.spring6webapp.services;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
