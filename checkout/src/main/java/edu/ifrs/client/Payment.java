package edu.ifrs.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import edu.ifrs.model.Invoice;
import io.quarkus.oidc.token.propagation.AccessToken;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://localhost:8445/payment")
@AccessToken
public interface Payment {
    

    @POST
    @Path("/pay")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Invoice pay(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value);



}
