package _03ejercicios;

import java.util.Scanner;

public class _12PenultimaCifra {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num, num1, num2, num3;

		System.out.println("Introduce un número entero: ");
		num = tec.nextInt();

		num1 = num % 100;
		num2 = num1 % 10;
		num3 = (num1 - num2) / 10;
		System.out.println("La penúltima cifra de " + num + " es: " + num3);
	}

}
