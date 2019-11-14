package _02Ejemplos;

import java.util.Scanner;

public class _01NecesidadArrays {
	final static int NUM_ALUMNOS = 5;

	public static void main(String[] args) {
		// Leer la nota de una serie de alumnos y mostar la media
		Scanner tec = new Scanner(System.in);
		double total = 0;

		for (int alu = 1; alu <= NUM_ALUMNOS; alu++) {
			System.out.println("Introduce nota del alumno " + alu + ":");
			int nota = tec.nextInt();
			total = total + nota;
		}

		// nota media de los alumnos

		System.out.println("Nota media: " + (total / NUM_ALUMNOS));

		
		//Cuantos han superado la media?
		//NO TIENE UNA BUENA SOLUCION CON LAS HERRAMIENTAS QUE TENEMOS HASTA AHORA
		
		
		
	}

}
