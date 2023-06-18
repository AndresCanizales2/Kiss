package com.KissApp.component.Usuario;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<CardData> perfiles() {
        List<UsuarioDTO> usuarios = usuarioRepository.findAll().stream()
                .map(UsuarioDTO::convertEntityToDto)
                .collect(Collectors.toList());
        List<CardData> cads = new ArrayList<>();
        for(UsuarioDTO usuario :usuarios){

           CardData card = new CardData(usuario.getNombre() , Integer.parseInt(usuario.getEdad()), usuario.getUrlFotoUsuario()  , usuario.getTextArea());
           cads.add(card);
        }
        return cads;
    }


}
