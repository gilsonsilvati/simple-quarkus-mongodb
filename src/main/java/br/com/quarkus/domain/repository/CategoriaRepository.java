package br.com.quarkus.domain.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.quarkus.domain.model.Categoria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CategoriaRepository implements PanacheRepository<Categoria> {
    
}