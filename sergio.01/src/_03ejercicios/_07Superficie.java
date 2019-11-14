package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double longitud;
		double anchura;

		System.out.println("Introduzca longitud(m) de la habitacion: ");
		longitud = tec.nextDouble();
		System.out.println("Introduzca anchura(m) de la habitacion: ");
		anchura = tec.nextDouble();

		System.out.println("Su superficie es: " + longitud * anchura + " metros cuadrados");
		
		//Con format:
		System.out.format("Superficie: %f%n" , (longitud * anchura) );
		System.out.format("Superficie: %8.2f" , (longitud * anchura) );

	}
}
