package com.KissApp.component.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioEntity , String> {
    UsuarioEntity findByUserNameAndPassword(String username, String password);
}
