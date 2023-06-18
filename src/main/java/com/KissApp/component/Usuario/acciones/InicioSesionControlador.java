package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.UsuarioDTO;
import com.KissApp.component.Usuario.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    private static final String PERFIL = "redirect:/perfil";
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
    public String validationSesion(@ModelAttribute("usuario") UsuarioDTO user, Model model , HttpServletRequest request) {
        HashMap<String, String> validationErrors = usuarioService.validacionInicioSesion(user.getUserName(), user.getPassword());
        if (validationErrors.containsKey("Error")) {
            model.addAttribute("error", "Credenciales inválidas");
            return REDIRECT_LIST;
        }

        // Ejemplo de creación de sesión
        HttpSession session = request.getSession();
        session.setAttribute("username", user.getUserName());
        return PERFIL;
    }





}
