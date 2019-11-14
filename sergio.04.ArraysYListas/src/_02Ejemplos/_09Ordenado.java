package _02Ejemplos;

import java.util.Arrays;

public class _09Ordenado {
	public static void main(String[] args) {

		int[] edad = { 20, 30, 1, 40, 5 };

		boolean desordenado = false;

		for (int i = 0; i < (edad.length - 1) && !desordenado; i++) {
			if (edad[i] > edad[i + 1]) {
				desordenado = true;
			}
		}
		if (desordenado)
			System.out.println("No esta ordenado");
		else
			System.out.println("Esta ordenado");
	}

}
