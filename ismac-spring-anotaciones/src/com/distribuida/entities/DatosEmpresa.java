package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatosEmpresa {

	@Value(value = "${empresa}")
	private String empresa;
	@Value(value = "${direccion}")
	private String direccion;
	@Value(value = "${correo}")
	private String correo;
	@Value(value = "${telefono}")
	private String telefono; 
	
	public DatosEmpresa() {
		
		
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "DatosEmpresa [empresa=" + empresa + ", direccion=" + direccion + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
	
	
}
