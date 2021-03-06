package com.savindu.HospitalRestServer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "web api working !";
    }
    
    @POST
	@Path("/message")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage(@PathParam("message") String msg) {
		String data = "Hello " + msg;
		return Response.status(200).entity(data).build();
	}
}
