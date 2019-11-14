package _02Ejemplos;

import java.util.Scanner;

public class _02NotasSuperanLaMedia {
	final static int NUM_ALUMNOS = 5;

	public static void main(String[] args) {
		// Leer la nota de una serie de alumnos y mostar la media
		Scanner tec = new Scanner(System.in);
		double total = 0;

		// ARRAY DE int
		int[] notas = new int[NUM_ALUMNOS];
		// -------------------------------

		for (int alu = 0; alu < NUM_ALUMNOS; alu++) {
			System.out.println("Introduce nota del alumno " + (alu+1) + ":");
			notas[alu] = tec.nextInt();
			total = total + notas[alu];
		}

		// nota media de los alumnos

		System.out.println("Nota media: " + (total / NUM_ALUMNOS));

		double media = total / NUM_ALUMNOS;

		// Cuantos han superado la media?
		// NO TIENE UNA BUENA SOLUCION CON LAS HERRAMIENTAS QUE TENEMOS HASTA
		// AHORA

		int porEncima = 0;
		for (int alu = 0; alu < NUM_ALUMNOS; alu++) {
			if (notas[alu] > media)
				porEncima++;
		}
		System.out.println("Alumnos por encima de la media: "+ porEncima);
		
		

	}

}
