package br.com.quarkus.domain.model;

import java.util.List;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

@MongoEntity
@Getter
@Setter
public class Categoria extends PanacheMongoEntity {

    private String nome;

    public List<Categoria> listar() {
        return listAll();
    }

    public Categoria porId(ObjectId objectId) {
        return findById(objectId);
    }
    
}