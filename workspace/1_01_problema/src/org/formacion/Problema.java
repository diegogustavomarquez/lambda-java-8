package org.formacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problema {
	
	public static void main (String[] args) {
		
		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");
		
		Comparator<String> comparadorLongitud = 
				(o1, o2) -> o1.length() - o2.length();
		Collections.sort(nombres,comparadorLongitud);
				
		System.out.println(nombres);
	}

}
