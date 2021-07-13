package org.formacion;

import java.util.Optional;

public class Vivienda {

	private Optional<Persona> propietario;
	
	private String nombre;

	public Vivienda(Persona propietario, String nombre) {
		this.nombre = nombre;
	}
	
	public Vivienda(String nombre) {
		this.nombre = nombre;
	}

	public Optional<Persona> getPropietario() {
		return propietario;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Optional<String> nombrePropietario() {
		return null;
	}
	
	
}
