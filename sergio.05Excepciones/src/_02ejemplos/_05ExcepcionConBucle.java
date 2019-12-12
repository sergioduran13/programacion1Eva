package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05ExcepcionConBucle {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int edad;
		boolean ok = false;
		do {
			try {
				System.out.println("Edad: ");
				edad = tec.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("No es un numero");
				tec.nextLine();
			}
		} while (!ok);

	}

}
