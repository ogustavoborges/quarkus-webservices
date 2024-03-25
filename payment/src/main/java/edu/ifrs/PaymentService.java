package edu.ifrs;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentService {

    @POST
    @Path("/pay")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("User") //regras definidas de quem pode acessar
    public Invoice pay(
        @FormParam("cardNumber") String cardNumber, 
        @FormParam("value") String value) {
        Invoice invoice = new Invoice();
        invoice.setCardNumber(cardNumber);
        invoice.setValue(value);
        invoice.setPaid(true);

        return invoice;
    }   
}
