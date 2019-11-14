package _03ejercicios;

import java.util.Scanner;

public class _05LeerEntero {

	public static int leeEnteroPositivo(int num) {
		Scanner tec = new Scanner(System.in);
		while (num <= 0) {
			System.out.println("Error, vuelve a introducir numero.");
			num = tec.nextInt();
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero entero: ");
		int num = tec.nextInt();
		leeEnteroPositivo(num);
		System.out.println("Correcto");

	}

}
