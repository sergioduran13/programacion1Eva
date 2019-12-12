package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03CapturarExcepcion {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try {
			System.out.println("Numerador: ");
			int numerador = tec.nextInt();
			int denominador;
			do {
				System.out.println("Denominador");
				denominador = tec.nextInt();

			} while (denominador == 0);

		} catch (InputMismatchException e) {

			System.out.println("Algun dato es incorrecto. \nNo se puede dividir.");
		}
		
	}

}
