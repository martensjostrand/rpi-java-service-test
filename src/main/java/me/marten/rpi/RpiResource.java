package me.marten.rpi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public class RpiResource {

    private final String message;

    public RpiResource(String message) {
        this.message = message;
    }

    @GET
    public ServiceInfo getInfo() {
        return new ServiceInfo(message);
    }
}
