package hu.zsuzsi.springtanulas.guru.spring6webapp.services;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Author;
import hu.zsuzsi.springtanulas.guru.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
