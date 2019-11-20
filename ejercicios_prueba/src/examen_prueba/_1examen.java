package examen_prueba;

import java.util.Scanner;

public class _1examen {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double precio = 0;

		System.out.println("Introduce edad: ");
		int edad = tec.nextInt();

		System.out.println("Introduce numero socio (0 si no eres socio): ");
		int socio = tec.nextInt();
		tec.nextLine();

		System.out.println("¿Familia numerosa? (si/no): ");
		String numerosa = tec.nextLine().toLowerCase();

		// precio base
		if (edad >= 5 && edad <= 12)
			precio = 80;
		else if (edad >= 13 && edad <= 17)
			precio = 100;
		else if (edad >= 18 && edad <= 64)
			precio = 120;
		else if (edad < 5 || edad > 80)
			precio = 0;
		else if (edad >= 65 && edad <= 80)
			precio = 50;

		// Descuento socio

		if (socio > 0 && edad >= 5 && edad <= 12)
			precio = precio - 5;
		else if (socio > 0 && edad >= 13 && edad <= 17)
			precio = precio - 7.5;
		else if (socio > 0 && edad >= 18 && edad <= 64)
			precio = precio - 10;
		else if (socio > 0 && edad > 64)
			precio = precio - 12.5;

		// Familia numerosa

		if (numerosa.equals("si") && edad >= 5 && edad <= 80) {
			precio = precio - 10;
		}

		if (edad >= 5 && edad <= 80)
			System.out.format("Precio anual para edad " + edad + " es de: " + precio + "€");
		else
			System.out.println("Edad no permitida");

	}

}
