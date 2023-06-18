package com.miempresa.DTO;

import org.hibernate.validator.constraints.*;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class formularioDTO {
	@NotBlank(message="Campo obligatorio")
    private String nombre;
	@NotBlank(message="Campo obligatorio")
    private String apellido;
	
    private String sexo;
    @Range(min=0, max=100, message = "Ingrese una edad correcta")
    private int edad;

    
    @NotBlank(message = "Campo obligatorio")
    @Pattern.List({
        @Pattern(regexp = "^(?=.*\\d).{6,}$", message = "La contraseña debe contener al menos un número y tener una longitud mínima de 6 caracteres"),
    })
    private String clave;
    
    @NotBlank(message="Campo obligatorio")
    @Email(message="Ingrese un correo valido")
    private String correo;
    
    private OpcionesSexo[] opcionesSexo;
	
    
 
	public formularioDTO() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public OpcionesSexo[] getOpcionesSexo() {
		return opcionesSexo;
	}
	public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
		this.opcionesSexo = opcionesSexo;
	}
}
