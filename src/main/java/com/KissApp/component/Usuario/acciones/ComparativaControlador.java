package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.UsuarioEntity;
import com.KissApp.component.Usuario.UsuarioRepository;
import com.KissApp.component.Usuario.UsuarioService;
import com.KissApp.component.Usuario.UsuarioServiceImp;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comparativa")
public class ComparativaControlador {
    private final UsuarioService usuarioService;

    @Autowired
    ComparativaControlador(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping({"/", ""})
    public String comparativa(@RequestParam("nombre") String nombre, Model model, HttpServletRequest request ) {
        // Datos para la primera card
        System.out.println(nombre);
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // Si no hay una sesión activa, redirige a la página de inicio de sesión
            return "redirect:/login";
        }
        UsuarioEntity datos1 = usuarioService.perfilPorUser(username);
        UsuarioEntity datos2 = usuarioService.perfilPorUser(nombre);
        model.addAttribute("imagen1", datos1.getUrlFotoUsuario());
        model.addAttribute("nombreUsuario1", datos1.getNombre());
        model.addAttribute("edad1", datos1.getEdad());
        model.addAttribute("altura1", datos1.getAltura());
        model.addAttribute("marcaCoche1", datos1.getCoche());
        model.addAttribute("musicaFavorita1", datos1.getMusica_favorita());
        model.addAttribute("salarioAnual1", "$"+datos1.getSalario());
        model.addAttribute("localizacion1", datos1.getCiudad());

        // Datos para la segunda card
        model.addAttribute("imagen2", datos2.getUrlFotoUsuario());
        model.addAttribute("nombreUsuario2", datos2.getNombre());
        model.addAttribute("edad2", datos2.getEdad());
        model.addAttribute("altura2", datos2.getAltura());
        model.addAttribute("marcaCoche2", datos2.getCoche());
        model.addAttribute("musicaFavorita2", datos2.getMusica_favorita());
        model.addAttribute("salarioAnual2", "$" +datos2.getSalario());
        model.addAttribute("localizacion2", datos2.getCiudad());

    String comentario1 ="" ;
        if(Integer.valueOf(datos1.getAltura()) >  Integer.valueOf(datos2.getAltura()) ){
            comentario1 = "eres muy alto";
        }else{
            comentario1 = "eres muy bajo";
        }
        // Comentarios para la card del centro
        model.addAttribute("comentario1", comentario1);
        model.addAttribute("comentario2", "Comentario 2");
        model.addAttribute("comentario3", "Comentario 3");
        model.addAttribute("comentario4", "Comentario 4");
        model.addAttribute("comentario5", "Comentario 5");


        return "comparativa";
    }
}
