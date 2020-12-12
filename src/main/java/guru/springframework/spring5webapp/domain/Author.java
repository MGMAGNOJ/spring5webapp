package guru.springframework.spring5webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fistName;
    private String lasName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;


    public Author() {
    }


    public Author(String fistName, String lasName, Set<Book> books) {
        this.fistName = fistName;
        this.lasName = lasName;
        this.books = books;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFistName() {
        return this.fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLasName() {
        return this.lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


}