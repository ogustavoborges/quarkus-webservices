package edu.ifrs;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/catalog")
public class CatalogService {

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public Invoice list() {
        Invoice invoice = new Invoice();
        invoice.addBook(new Book("Java Programming", "Gustavo", "202102", true));
        invoice.addBook(new Book("Javascript", "Gustavo", "202102", true));
        invoice.addBook(new Book("Python", "Gustavo", "202103", true));
        return invoice;
    }  

}
