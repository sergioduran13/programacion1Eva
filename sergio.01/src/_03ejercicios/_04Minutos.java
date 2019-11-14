package _03ejercicios;

import java.util.Scanner;

public class _04Minutos {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un número de segundos: ");
		int seg = tec.nextInt();

		System.out.println("El número de minutos completos es: " + (seg / 60));
		System.out.println("Sobran: " + (seg % 60) + " segundos");

	}

}
