package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.UsuarioDTO;
import com.KissApp.component.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/login")
public class InicioSesionControlador {


    private static final String REDIRECT_LIST = "redirect:/registro";
    private static final String CRUD_LIST = "configuration/list";
    private static final String INDEX = "redirect:/";
    private final UsuarioService usuarioService;

    @Autowired
    InicioSesionControlador(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @GetMapping({"/", ""})
    public String showPantallaLogin(Model model){
        model.addAttribute("usuario", new UsuarioDTO());
        return "login";
    }
    @PostMapping("/action")
    public String validationSesion(@ModelAttribute("usuario") UsuarioDTO user, Model model) {
        HashMap<String, String> validationErrors = usuarioService.validacionInicioSesion(user.getUserName(), user.getPassword());
        if (validationErrors.containsKey("Error")) {
            model.addAttribute("error", "Credenciales inválidas");
            return REDIRECT_LIST;
        }
        return INDEX;
    }



}
