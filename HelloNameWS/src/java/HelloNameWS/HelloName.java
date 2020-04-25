/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloNameWS;

import javax.ws.rs.core.*;
import javax.ws.rs.*;

/**
 * REST Web Service
 *
 * @author Luca
 */
@ApplicationPath("/")
@Path("/test")
public class HelloName extends Application{

    public HelloName() {
        super();
    }
    
    @GET
    @Produces("text/xml")
    @Path("{name}")
    public String getMessage(@PathParam(value="name") String name) {
        return "<message>Ciao "+ name+ "!</message>";
    }
}
