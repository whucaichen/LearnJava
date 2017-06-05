package example;

/**
 * Created by Chance on 17/03/22.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/Jersey")
public class JerseyTest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        System.out.println("Hello World!");
        return "hello world";
    }
}
