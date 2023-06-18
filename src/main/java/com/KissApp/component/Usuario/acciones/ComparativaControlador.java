package com.KissApp.component.Usuario.acciones;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comparativa")
public class ComparativaControlador {

    @PostMapping({"/", ""})
    public String getCards(Model model , HttpServletRequest request ) {
        // Datos para la primera card
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            // Si no hay una sesión activa, redirige a la página de inicio de sesión
            return "redirect:/login";
        }
        model.addAttribute("username", username);

        model.addAttribute("edad1", 25);
        model.addAttribute("altura1", 1.65);
        model.addAttribute("marcaCoche1", "Nissan");
        model.addAttribute("musicaFavorita1", "Rock");
        model.addAttribute("salarioAnual1", "$50,000");
        model.addAttribute("localizacion1", "Madrid");

        // Datos para la segunda card
        model.addAttribute("edad2", 30);
        model.addAttribute("altura2", 1.70);
        model.addAttribute("marcaCoche2", "Toyota");
        model.addAttribute("musicaFavorita2", "Pop");
        model.addAttribute("salarioAnual2", "$70,000");
        model.addAttribute("localizacion2", "Barcelona");

        // Comentarios para la card del centro
        model.addAttribute("comentario1", "Comentario 1");
        model.addAttribute("comentario2", "Comentario 2");
        model.addAttribute("comentario3", "Comentario 3");
        model.addAttribute("comentario4", "Comentario 4");


        return "comparativa";
    }
}
