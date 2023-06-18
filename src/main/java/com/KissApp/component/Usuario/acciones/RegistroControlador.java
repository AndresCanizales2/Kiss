package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.UsuarioService;
import com.KissApp.component.Usuario.UsuarioDTO;
import com.KissApp.component.Usuario.updateImage.FileUpload;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
@Controller
@RequestMapping("/registro")
public class RegistroControlador {

    private static final String REDIRECT_LIST = "redirect:/";
    private final UsuarioService usuarioService;


    @Autowired
    private final FileUpload fileUpload;

    @Autowired
    public RegistroControlador(UsuarioService usuarioService, Cloudinary cloudinary, FileUpload fileUpload) {
        this.usuarioService = usuarioService;
        this.fileUpload = fileUpload;
    }

    @GetMapping({"/", ""})
    public String showPantallaRegistro(Model model) {
        model.addAttribute("usuario", new UsuarioDTO());
        return "registro";
    }

    @PostMapping({"/save"})
    public String saveDevice(@Valid @ModelAttribute("usuario") UsuarioDTO usuarioDTO, @RequestParam("image")MultipartFile multipartFile ,  BindingResult result) throws IOException {

        if (!usuarioDTO.getPassword().equals(usuarioDTO.getConfirmPassword())) {
            result.rejectValue("password", "password.mismatch", "Las contraseñas no coinciden");
            result.rejectValue("confirmPassword", "password.mismatch", "Las contraseñas no coinciden");
        }
        if (result.hasErrors()) {
            return "registro";
        }

        // Cargar la imagen en Cloudinary
        String imageURL = fileUpload.uploadFile(multipartFile);
        usuarioDTO.setUrlFotoUsuario(imageURL);

        // Guardar el usuario en la base de datos
        usuarioService.save(usuarioDTO);

        return REDIRECT_LIST;
    }
}
