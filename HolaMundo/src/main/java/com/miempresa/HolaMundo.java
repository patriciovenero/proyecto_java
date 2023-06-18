package com.miempresa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HolaMundo {
	@RequestMapping("/saludar")
	public String Saludar() {
		String saludo = "<h1>Hola mundo desde <b>Spring Boot</b></h1> <br>"; 
		saludo += "<a href='/'>INICIO</a>";
		return saludo;
	}
	@RequestMapping("/misdatos")
	public String MisDatos() {
		String nombres = "Dante Samuel Rodríguez Chambi";
		int edad = 18;
		String curso = "diseño y desarrollo de software";
		String foto = "gato.jpg";
		String datos = "<table border=1>";
		datos += "<tr><td colspan=2><img src="+ foto +"> <br> <center><h1>¿por que java?</h1></center> </td></tr>";
		datos += "<tr><td><h3>Me llamo</h3></td><td>"+ nombres +" </td></tr>";
		datos += "<tr><td><h3>mi edad es</h3></td><td>"+ edad +" </td></tr>";
		datos += "<tr><td><h3>Estoy en el curso de </h3></td><td>"+ curso +" </td></tr>";
		datos += "</table>";
		datos += "<a href= '/'> INICIO</a>";
		
		return datos;
		
	}
	@RequestMapping("/")
	public String Indice() {
		String enlaces = "<a href='/saludar' >Mostrar Saludo</a> <br>";
		enlaces += "<a href='/misdatos' > Mostrar Mis 	Datos</a> <br>";
		enlaces += "<a href='/index.html' >Index</a>";		
		return enlaces;
	}
}
