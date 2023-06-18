package com.miempresa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miempresa.interfaces.Iempleado;
import com.miempresa.modelo.Empleado;

@Controller
public class BuscarEmpleadoController {

    @Autowired
    private Iempleado repo;

    @GetMapping("/buscarEmpleado")
    public String buscarEmpleado(@RequestParam("nombre") String nombre, Model model) {
        List<Empleado> empleados = repo.findByNombreContaining(nombre);
        
        if (empleados.isEmpty()) {
            model.addAttribute("noResult", true);
        } else {
            model.addAttribute("empleados", empleados);
        }
        
        return "buscarEmpleado";
    }
}