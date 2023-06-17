package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.UsuarioService;
import com.KissApp.component.Usuario.UsuarioDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroControlador {

    private static final String REDIRECT_LIST = "redirect:/";
    private static final String CRUD_LIST = "configuration/list";
    private static final String ERROR = "";
    private final UsuarioService usuarioService;

    RegistroControlador(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @GetMapping({"/", ""})
    public String showPantallaRegistro(Model model){
       model.addAttribute("usuario", new UsuarioDTO());
        return "registro";
    }

    @PostMapping({"/save"})
    public String saveDevice(@Valid @ModelAttribute("usuario") UsuarioDTO usuarioDTO, BindingResult result ) {
        if (!usuarioDTO.getPassword().equals(usuarioDTO.getConfirmPassword())){
            result.rejectValue("password", "password.mismatch", "Las contraseñas no coinciden");
            result.rejectValue("confirmPassword", "password.mismatch", "Las contraseñas no coinciden");
        }
        if (result.hasErrors() ) {
            return "registro";
        }
        usuarioService.save(usuarioDTO);
        return REDIRECT_LIST ;
    }
}
