package com.my.experiments.microservices.chassis.operations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ravipalakodeti on 8/22/17.
 */
@Path("health")
public class HealthApi {

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHealthStatus() {
        return "{\"status\": \"UP\"}";
    }
}
