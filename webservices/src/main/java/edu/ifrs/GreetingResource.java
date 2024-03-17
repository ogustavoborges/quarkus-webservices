package edu.ifrs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.Response;
import jakarta.json.Json;

@Path("/api")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy";
    }

    @POST
    @Path("/helloPost")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String hello2(@FormParam("name") String name){
            return "{\"message\": \"Hello " + name + "\"}";
    }

    
    @GET
    @Path("/helloGet/{name}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public String hello3(@PathParam("name") String name){
            return "{\"message\": \"Hello " + name + "\"}";
    }

    //Exercício 2

    // @POST
    // @Path("/km-to-miles")
    // @Consumes(MediaType.TEXT_PLAIN)
    // @Produces(MediaType.TEXT_PLAIN)
    // public String kmphToMph(double kmph) {
    //     double mph = kmph * 0.621371;
    //     // Truncate to 5 decimal places
    //     mph = Math.floor(mph * 100000) / 100000;
    //     return Double.toString(mph);
    // }

        // @POST
        // @Path("/km-to-miles")
        // @Consumes(MediaType.TEXT_PLAIN)
        // @Produces(MediaType.TEXT_PLAIN)
        // public String conversionKmMiles(double km){
        //     double miles = km  * 0.621371;
        //     miles = Math.floor(miles * 100000) / 100000;
        //     return Double.toString(miles);
        // }

        // @GET
        // @Path("/knots-to-km/{knots}")
        // @Produces(MediaType.APPLICATION_JSON)
        // public Response knotsToKmph(@PathParam("knots") double knots) {
        //     double kmph = knots * 1.852;
        //     return Response.ok(Json
        //         .createObjectBuilder()
        //         .add("value", kmph)
        //         .build()).build();
        // }

}