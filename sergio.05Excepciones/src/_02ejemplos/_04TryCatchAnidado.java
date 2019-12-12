package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04TryCatchAnidado {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try {
			System.out.println("Numerador: ");
			int numerador = tec.nextInt();

			try {
				int denominador;
				do {
					System.out.println("Denominador:");
					denominador = tec.nextInt();
				} while (denominador == 0);
			} catch (InputMismatchException e) {
				System.out.println("El denominador no es un numero.");
			}

		} catch (InputMismatchException e) {

			
			System.out.println("El numerador no es un numero.");
		}

	}

}
