package _02ejemplos;

import java.util.Scanner;

public class _09NumeroPrimos {

	public static boolean esPrimo(int num) {
		int contDivisores = 0;

		for (int divisor = 1; divisor <= num && contDivisores <= 2; divisor++) {
			if (num % divisor == 00) {
				contDivisores++;
			}
			divisor++;
		}
		return contDivisores <= 2;

	}

	public static boolean esPrimo2(int num) {

		int contDivisores = 0;
		int divisor;
		for (divisor = 1; divisor <= num; divisor++) {
			if (num % divisor == 0) {
				contDivisores++;
			}
		}
		return contDivisores <= 2;

	}

	public static boolean esPrimo3(int num) {
		if (num == 1 || num == 2)
			return true;
		else if (num % 2 == 0)
			return false;
		else {
			int contDivisores = 0;
			for (int divisor = 3; divisor <= Math.sqrt(num) && contDivisores < 1; divisor+=2) {
				if (num % divisor == 00) {
					contDivisores++;
				}
			}
			return contDivisores < 1;
		}
	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero:");
		int x = tec.nextInt();

		long tInicial = System.currentTimeMillis();

		for (int i = 1; i <= x; i++) {
			if (esPrimo3(i)) {
				// System.out.println(i);
			}
		}

		long tFinal = System.currentTimeMillis();
		System.out.println("Tiempo version buena: " + (tFinal - tInicial));

		long tInicial2 = System.currentTimeMillis();

		for (int i = 1; i <= x; i++) {
			if (esPrimo2(i)) {
				// System.out.println(i);
			}
		}

		long tFinal2 = System.currentTimeMillis();
		System.out.println("Tiempo version mala: " + (tFinal2 - tInicial2));
	}

}
