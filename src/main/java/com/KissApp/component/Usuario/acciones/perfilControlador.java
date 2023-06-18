package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.CardData;
import com.KissApp.component.Usuario.UsuarioRepository;
import com.KissApp.component.Usuario.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/perfil")
public class perfilControlador {

    private static final String REDIRECT_LIST = "redirect:/perfil";
    private static final String CRUD_LIST = "configuration/list";
    private static final String INDEX = "redirect:/";

    private final UsuarioService usuarioService;

    @Autowired
    perfilControlador(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping({"/", ""})
    public String getCards(Model model , HttpServletRequest request) {


        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // Si no hay una sesión activa, redirige a la página de inicio de sesión
            return "redirect:/login";
        }
        model.addAttribute("username", username);
        // Añade la lista de perfiles al modelo para que pueda ser accedida en la vista
        model.addAttribute("perfiles",  usuarioService.perfiles());

        // Retorna el nombre de la vista (en este caso, la vista se llama 'perfil')
        return "perfil";
    }






}
