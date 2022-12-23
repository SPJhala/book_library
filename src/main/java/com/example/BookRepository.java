package com.example;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks()
    {
        return List.of(
                new Book(1, "C language", "Shivraj"),
                new Book(2,"C++ Language", "Shakti"),
                new Book(3,"Java Language", "Shivrajsinh")
        );
    }

    public int doCount()
    {
        return getAllBooks().size();
    }

    public Optional<Book> findBook(int id)
    {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}
