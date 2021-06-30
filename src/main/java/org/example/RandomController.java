package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/api/random")

public class RandomController {
    @GET
    @Path("/{random}")
    @Produces(MediaType.TEXT_PLAIN)
    public int generateRandomNumber(){
        Random randomNumber = new Random();
        int upperBound = 100;
        int int_random = randomNumber.nextInt(upperBound);
        return int_random;
    }
}
