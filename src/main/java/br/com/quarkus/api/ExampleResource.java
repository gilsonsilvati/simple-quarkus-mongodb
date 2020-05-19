package br.com.quarkus.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.quarkus.domain.model.Categoria;

@Path("hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("outro-hello")
    public Categoria outroHello() {
        var categoria = new Categoria();
        categoria.setNome("Nome da categoria");

        return categoria;
    }

}