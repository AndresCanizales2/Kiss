package com.KissApp.component.Usuario;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UsuarioServiceImp implements UsuarioService{


    private final MongoTemplate mongoTemplate;
    private final ModelMapper modelMapper;

    private final UsuarioRepository usuarioRepository;
    @Autowired
    UsuarioServiceImp(ModelMapper modelMapper, MongoTemplate mongoTemplate, UsuarioRepository usuarioRepository) {
        this.mongoTemplate = mongoTemplate;
        this.modelMapper = modelMapper;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public String  save(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuarioDTO, UsuarioEntity.class);
        UsuarioEntity savedDevice = mongoTemplate.save(usuarioEntity);
        return "/";
    }


    HashMap<String,String> mensajes = new HashMap<String,String>();
    @Override
    public HashMap<String, String> validacionInicioSesion(String userName, String password) {

        if(usuarioRepository.findByUserNameAndPassword(userName, password) == null){
            mensajes.put("Error", "Nombre de usuario o password incorrectas");
        }
        return mensajes;
    }

}
