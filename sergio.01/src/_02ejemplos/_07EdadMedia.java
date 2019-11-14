package _02ejemplos;

import java.util.Scanner;

public class _07EdadMedia {
	public static void main(String[] args) {
		/* Programa que pida al usuario la edad de tres personas y muestre la media	
		   de las tres edades
		 */
		
		Scanner tec = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Introduce Edad 1: ");
		num1 = tec.nextInt();
		System.out.println("Introduce Edad 2: ");
		num2 = tec.nextInt();
		System.out.println("Introduce Edad 3: ");
		num3 = tec.nextInt();

		System.out.println("La edad media es: " + ((num1+num2+num3)/3.0));

	}

}
