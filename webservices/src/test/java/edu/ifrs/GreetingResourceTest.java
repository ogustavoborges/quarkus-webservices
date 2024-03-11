package edu.ifrs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.beans.Transient;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/api/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy"));
    }


    @Test
    void testHello2Endpoint() {
        given()
            .formParam("name", "John")
            .when().post("/api/helloPost")
            .then()
            .statusCode(200)
            .body(is("{\"message\": \"Hello John\"}"));
    }



    @Test
    void testHello3Endpoint() {
        given()
          .when().get("/api/helloGet/John")
          .then()
             .statusCode(200)
             .body(is("{\"message\": \"Hello John\"}"));
    }

}