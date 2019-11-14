package _02ejemplos;

import java.util.Scanner;

public class _11CompararStrings {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("a".compareTo("b"));
		System.out.println("a".compareTo("h"));
		System.out.println("b".compareTo("c"));

		System.out.println("zen".compareTo("murcielago"));
		System.out.println("casita".compareTo("casota"));
		System.out.println("casa".compareTo("Casa"));

		// Leer dos nombres y mostrarlos ordenados

		System.out.println("Nombre 1: ");
		String n1 = tec.nextLine();

		System.out.println("Nombre 2: ");
		String n2 = tec.nextLine();

		if (n1.compareTo(n2) < 0) {

			System.out.println(n1);
			System.out.println(n2);
		} else {
			System.out.println(n2);
			System.out.println(n1);
		}

		System.out.format("%02d/%02d/%04d\n", 1, 1, 2000);

		String fecha = String.format("%02d/%02d/%04d\n", 1, 1, 2000);
		System.out.println(fecha);

	}

}
