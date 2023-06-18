package com.KissApp.component.Usuario;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioEntity , String> {
    UsuarioEntity findByUserNameAndPassword(String username, String password);


}
