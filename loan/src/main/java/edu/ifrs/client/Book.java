package edu.ifrs.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import edu.ifrs.model.Invoice;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8080/catalog")
public interface Book {
    

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    Invoice list();

}
