package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    @ConfigProperty(name = "variable.text")
    String variableText;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return variableText;
    }
}