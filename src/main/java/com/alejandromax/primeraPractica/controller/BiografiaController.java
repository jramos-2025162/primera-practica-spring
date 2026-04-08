package com.alejandromax.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String mostrarBiografia(Model model) {
        String bioTexto = "Mi nombre es Jancarlo Antonio Ramos López, tengo 16 años. Nací el 24 de junio del año 2009... " +
                "Actualmente vivo en la Alameda, zona 18. Me apasiona la música, especialmente instrumentos como el bajo y el teclado. " +
                "Deseo convertirme en un buen programador y también en un buen músico.";

        model.addAttribute("titulo", "Mi Biografía");
        model.addAttribute("contenido", bioTexto);
        return "biografia";
    }
}