package com.miempresa.controller;

import com.miempresa.form.FormularioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioController {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("formulario", new FormularioModel());
        return "formulario";
    }

    @PostMapping("/formulario")
    public String procesarFormulario(FormularioModel formulario) {
        // Aquí puedes realizar las operaciones necesarias con los datos recibidos
        return "resultados";
    }
}
