package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/nuevo")
@Singleton
public class NuevoController {
    @GET
    public String sayNuevo() {
        return "Mi nuevo mensaje!";
    }
}
