package com.KissApp.component.Usuario;

import java.util.HashMap;


public interface UsuarioService{

//
    String save(UsuarioDTO usuarioDTO);

    HashMap<String, String> validacionInicioSesion(String userName, String password);


}
