package org.formacion;

import java.util.ArrayList;
import java.util.List;

public class AgrupadorConList implements Agrupador {

	private List<Object> contenido = new ArrayList<>();

	@Override
	public void add(Object elemento) {
		contenido.add(elemento);
	}

	@Override
	public int numeroElementos() {
		return contenido.size();
	}

}
