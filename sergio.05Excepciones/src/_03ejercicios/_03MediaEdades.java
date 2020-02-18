package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03MediaEdades {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		pedirEdad();
	}

	// 1-volver a pedir la edad
	public static void pedirEdad() {
		int suma = 0;
		int edad;
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("edad " + i + ": ");
				edad = tec.nextInt();
				suma = suma + edad;
			}
			System.out.println("Media: " + (suma / 5.0));

		} catch (InputMismatchException e) {
			
		}
	}
	// 2-volver a pedir todas las edades

	// 3-Mostrar mensaje y termina

}
