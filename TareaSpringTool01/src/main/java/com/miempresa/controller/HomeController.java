package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/numeros-primos")
    public String verNumerosPrimos(@RequestParam("inicio") int inicio, @RequestParam("fin") int fin, Model model) {
        List<Integer> numerosPrimos = obtenerNumerosPrimos(inicio, fin);
        model.addAttribute("primos", numerosPrimos);
        return "resultados";
    }

    @GetMapping("/tabla-multiplicar")
    public String verTablaMultiplicar(@RequestParam("numero") int numero, Model model) {
        List<Integer> resultados = generarTablaMultiplicar(numero);
        model.addAttribute("resultados", resultados);
        return "resultados2";
    }

    private List<Integer> obtenerNumerosPrimos(int inicio, int fin) {
        List<Integer> numerosPrimos = new ArrayList<>();

        for (int num = inicio; num <= fin; num++) {
            if (esPrimo(num)) {
                numerosPrimos.add(num);
            }
        }

        return numerosPrimos;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    private List<Integer> generarTablaMultiplicar(int numero) {
        List<Integer> resultados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            resultados.add(resultado);
        }

        return resultados;
    }
}
