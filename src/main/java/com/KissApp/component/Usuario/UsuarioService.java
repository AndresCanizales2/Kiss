package com.KissApp.component.Usuario;

import java.util.HashMap;
import java.util.List;


public interface UsuarioService{

//
    String save(UsuarioDTO usuarioDTO);

    HashMap<String, String> validacionInicioSesion(String userName, String password);

    List<CardData> perfiles();

    UsuarioEntity perfilPorUser(String user);

}
