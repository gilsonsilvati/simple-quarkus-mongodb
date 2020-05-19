package br.com.quarkus.domain.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.quarkus.domain.model.Categoria;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class CategoriaRepository implements PanacheMongoRepository<Categoria> {
    
}