package _03ejercicios;

import java.util.Scanner;

public class _12Calculadora {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		// Solicitamos numeros y operacion
		System.out.println("Primer numero: ");
		double n1 = tec.nextDouble();
		System.out.println("Segundo numero: ");
		double n2 = tec.nextDouble();
		tec.nextLine();
		System.out.println("Operación: ");
		String simbolo = tec.nextLine();

		// Operamos
		double operacion;
		if (simbolo.equals("+")) {
			operacion = n1 + n2;
			System.out.println("Resultado de " + n1 + simbolo + n2 + " es " + operacion);

		} else if (simbolo.equals("-")) {
			operacion = n1 - n2;
			System.out.println("Resultado de " + n1 + simbolo + n2 + " es " + operacion);

		} else if (simbolo.equals("x")) {
			operacion = n1 * n2;
			System.out.println("Resultado de " + n1 + simbolo + n2 + " es " + operacion);

		} else {
			operacion = (n1 * 1.0) / n2;
			System.out.println("Resultado de " + n1 + simbolo + n2 + " es " + operacion);
		}
	}
}
