package org.formacion;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class TestAgrupador {

	/**
	 * Completad la definicion de la clase AgrupadorConList 
	 * para que implemente la interface
	 * (este ejercicio es de repaso, no usa los metodos default)
	 */
	@Test
	public void test_add() {
		
		Agrupador agrupador = new AgrupadorConList();
		Assert.assertEquals(0, agrupador.numeroElementos());
		
		agrupador.add("primero");
		Assert.assertEquals(1, agrupador.numeroElementos());
		
	}
	
	
	/**
	 * definid un metodo default addAll que acepte un Collection y
	 * añada cada objeto al agrupador
	 * Cuando tengais el metodo, descomentad el codigo comentado en el test
	 */
	@Test
	public void test_addAll() {
		
		Agrupador agrupador = new AgrupadorConList();
		agrupador.addAll(Arrays.asList("primero","segundo"));
		
		Assert.assertEquals(2,agrupador.numeroElementos());
	}
}
