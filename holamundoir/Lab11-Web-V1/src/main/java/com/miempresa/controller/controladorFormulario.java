package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class controladorFormulario {
    @GetMapping("/formularioregistro")
    public String envioformulario(Model model){
        model.addAttribute("form",new formularioDTO());
        return "formulario";
    }
}
