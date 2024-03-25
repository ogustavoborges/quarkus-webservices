package edu.ifrs;



import org.eclipse.microprofile.rest.client.inject.RestClient;

import edu.ifrs.client.Book;
import edu.ifrs.model.Invoice;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/loans")
public class LoanService {

    @Inject
    @RestClient
    Book catalogService;

    // Listar livros
    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public Invoice books() {
        return catalogService.list();
    }

}
