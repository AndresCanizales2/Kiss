package com.KissApp.component.Usuario.acciones;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class index {


    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        // Invalida la sesión al hacer logout
        HttpSession session = request.getSession();
        session.invalidate();
        // Redirige a la página de inicio de sesión
        return "redirect:/login";
    }
}
