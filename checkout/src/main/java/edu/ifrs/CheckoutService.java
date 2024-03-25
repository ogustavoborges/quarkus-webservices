package edu.ifrs;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import edu.ifrs.client.Payment;
import edu.ifrs.model.Invoice;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/checkout")
public class CheckoutService {

    @Inject
    @RestClient
    Payment paymentService;

    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("User")
    public Invoice buy(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value) {
        return paymentService.pay(cardNumber, value);
    }
}
