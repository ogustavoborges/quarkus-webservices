package edu.ifrs;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/checkout")
public class CheckoutService {

    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String buy(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value) {
        return cardNumber + " - " + value;
    }
}
