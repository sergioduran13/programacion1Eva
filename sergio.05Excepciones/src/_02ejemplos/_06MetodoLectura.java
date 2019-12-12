package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06MetodoLectura {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int edad = leerEntero(tec, "Introduce edad: ");
		if (edad >= 18)
			System.out.println("mayor edad");
		else
			System.out.println("menor edad");

	}

	public static int leerEntero(Scanner tec, String msg) {
		int num = 0;
		boolean ok = false;
		do {
			try {
				System.out.println(msg);
				num = tec.nextInt();
				tec.nextLine();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("No es un entero.");
				tec.nextLine();
			}
		} while (!ok);
		return num;
	}

}
