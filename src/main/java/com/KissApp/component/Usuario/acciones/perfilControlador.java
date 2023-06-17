package com.KissApp.component.Usuario.acciones;

import com.KissApp.component.Usuario.CardData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/perfil")
public class perfilControlador {

    private static final String REDIRECT_LIST = "redirect:/perfil";
    private static final String CRUD_LIST = "configuration/list";
    private static final String INDEX = "redirect:/";



    @GetMapping({"/", ""})
    public String getCards(Model model) {
        List<CardData> cards = new ArrayList<>();

        // Aquí puedes crear tantos perfiles como desees y añadirlos a la lista
        // Este es solo un ejemplo. Puedes llenar esta lista dinámicamente como necesites.
        CardData card1 = new CardData("Angelica", 34, "https://thispersondoesnotexist.com/", "Soy una persona amante de la tecnología y me encanta viajar. Conóceme más deslizando a la derecha.");
        cards.add(card1);

        CardData card2 = new CardData("Ricardo", 29, "https://thispersondoesnotexist.com/", "Me encanta el arte y disfruto mucho de la naturaleza. No dudes en deslizar a la derecha para conocerme mejor.");
        cards.add(card2);

        // ... puedes seguir añadiendo más perfiles aquí ...

        // Añade la lista de perfiles al modelo para que pueda ser accedida en la vista
        model.addAttribute("perfiles", cards);

        // Retorna el nombre de la vista (en este caso, la vista se llama 'perfil')
        return "perfil";
    }




}
