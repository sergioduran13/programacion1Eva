package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _09Finally {


	public static void main(String[] args) {
		
		int edad = edad();
		System.out.println("Edad: " + edad);

	}

	public static int edad() {
		
		Scanner tec = new Scanner(System.in);

		try {
			System.out.println("Introduce edad: ");
			int edad = tec.nextInt();
			return edad;
		} catch (InputMismatchException e) {
			System.out.println("No es un numero");
		} finally {
			System.out.println("Se ejecuta el finally");

		}
		return 0;

	}

}
