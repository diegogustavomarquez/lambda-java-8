package org.formacion;

import java.util.Collection;

public interface Agrupador {

	void add(Object elemento);

	int numeroElementos();

	default void addAll(Collection<Object> collection) {
		for (Object object : collection) {
			add(object);
		}
	}

}
