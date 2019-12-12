package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _09tocayosArrayList {

	public static void main(String[] args) {

		String[] lista1 = { "miguel", "josé", "ana", "maría" };
		String[] lista2 = { "ana", "josé", "luján", "juan", "josé", "pepa", "ángela", "sofía", "andrés", "bartolo" };

		ArrayList<String> g1 = new ArrayList<>();
		ArrayList<String> g2 = new ArrayList<>();

		for (int i = 0; i < lista1.length; i++) {
			g1.add(i, lista1[i]);
		}

		for (int i = 0; i < lista2.length; i++) {
			g2.add(i, lista2[i]);
		}

		// Mostrar los elementos de grupo1 tienen un tocayo en el grupo2.

		// MAL
		boolean encontrado = false;
		for (int i = 0; i < lista1.length; i++) {
			for (int j = 0; j < lista2.length && !encontrado; j++) {
				if (g1.get(i).equals(g2.get(j))) {
					encontrado = true;
					System.out.println("Tocayos: " + g1.get(i));
				}
			}
			encontrado = false;
		}

		System.out.println("------------------------");

		// BIEN
		for (int j = 0; j < lista1.length; j++) {
			if (g2.contains(g1.get(j))) {
				System.out.println("Tocayos: " + g1.get(j));
			}
		}

		// for EACH
		System.out.println("------------------------");
		for (String string : g1) {
			if (g2.contains(string)) {
				System.out.println("Tocayos: " + string);
			}
		}
		
		
		//Con metodo retainAll
		g2.retainAll(g1);
		System.out.println(g2);
		
	}
	

}
