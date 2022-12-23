package com.example;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResources {
    @Inject
    BookRepository repository;
    @Inject
    Logger logger;
    @GET
    public List<Book> getAllBooks()
    {
        logger.info("All Books");
        return repository.getAllBooks();
    }
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public int doCount()
    {
        logger.info("Number of Books");
        return repository.doCount();
    }
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Optional<Book> findBook(@PathParam("id")int id)
    {
        logger.info("Book with id ");
        return repository.findBook(id);
    }
}
