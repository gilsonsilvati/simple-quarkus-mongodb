package br.com.quarkus.api;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
    @Transactional
    public Categoria salvar(Categoria categoria) {
        categoriaRepository.persist(categoria);

        return categoria;
    }
    
}