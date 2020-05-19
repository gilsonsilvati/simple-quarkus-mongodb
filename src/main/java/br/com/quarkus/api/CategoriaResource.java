package br.com.quarkus.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bson.types.ObjectId;

import br.com.quarkus.domain.model.Categoria;
import br.com.quarkus.domain.repository.CategoriaRepository;

@Path("categoria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {

    @Inject
    private CategoriaRepository categoriaRepository;

    @GET
    public List<Categoria> listar() {
        return categoriaRepository.listAll();
    }

    @POST
    public Categoria salvar(Categoria categoria) {
        categoria.persist();
        return categoria;
    }

    @PUT
    public Categoria editar(Categoria categoria) {
        categoria.persistOrUpdate();
        return categoria;
    }

    @DELETE
    @Path("{id}")
    public void deletar(@PathParam("id") String id) {
        var objectId = new ObjectId(id);
        var categoria = categoriaRepository.findById(objectId);

        categoria.delete();
    }

}