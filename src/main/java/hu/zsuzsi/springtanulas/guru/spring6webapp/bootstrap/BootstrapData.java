package hu.zsuzsi.springtanulas.guru.spring6webapp.bootstrap;

import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Author;
import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Book;
import hu.zsuzsi.springtanulas.guru.spring6webapp.domain.Publisher;
import hu.zsuzsi.springtanulas.guru.spring6webapp.repositories.AuthorRepository;
import hu.zsuzsi.springtanulas.guru.spring6webapp.repositories.BookRepository;
import hu.zsuzsi.springtanulas.guru.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("37429234");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        authorRepository.save(ericSaved);
        bookRepository.save(noEJBSaved);

        Publisher bestBooks = new Publisher();
        bestBooks.setPublisherName("Best Books");
        bestBooks.setAddress("2500 Main street");
        bestBooks.setCity("Green Valley");
        bestBooks.setState("MA");
        bestBooks.setZip("324534");
        publisherRepository.save(bestBooks);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
