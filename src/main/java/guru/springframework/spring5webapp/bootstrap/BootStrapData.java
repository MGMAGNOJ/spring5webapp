package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE","456456");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher agata = new Publisher();
        agata.setName("Magno");
        agata.setLastname("Junior");
        agata.setAddress("Rua 21 de Abril");
        agata.setCity("Blumenau");
        agata.setState("Santa Catarina");
        agata.setZIPCode("88075000");

        publisherRepository.save(agata);


        System.out.println("Started Bootstrap");
        System.out.println("Number of Books " + bookRepository.count());
        System.out.println("My Publisher Count: " + publisherRepository.count());



    }
}
