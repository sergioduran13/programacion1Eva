package _03ejercicios;

import java.util.Scanner;

public class _14MenorDeDos1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce primer numero: ");
		int num1 = tec.nextInt();
		System.out.println("Introduce segundo numero: ");
		int num2 = tec.nextInt();

		if (num1 > num2)
			System.out.println(num1 + " es mayor que " + num2);
		else
			System.out.println(num1 + " es menor que " + num2);

	}
}