package _03ejercicios;

import java.util.Scanner;

public class _06Intercambio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe un número para v1: ");
		int v1 = tec.nextInt();
		System.out.println("Escribe un número para v2: ");
		int v2 = tec.nextInt();

		System.out.println("Antes de intercambiar     v1: " + v1 + " v2: " + v2);

		int aux;
		aux = v2;
		v2 = v1;
		v1 = aux;

		System.out.println("Después de intercambiar   v1: " + v1 + " v2: " + v2);

	}

}
