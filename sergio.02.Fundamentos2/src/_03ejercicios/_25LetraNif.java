package _03ejercicios;

import java.util.Scanner;

public class _25LetraNif {

	public static char calcularLetraNif(int x) {

		String dni = "trwagmyfpdxbnjzsqvhlcke";
		char letra = dni.charAt(x % 23);
		return letra;

	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce NIF: ");
		String nif = tec.nextLine();

		String numero = nif.substring(0, nif.length() - 1);
		String letranif = nif.substring(nif.length() - 1).toLowerCase();

		int num = Integer.parseInt(numero);
		char l = calcularLetraNif(num);
		String letra = l + "";

		if (letranif.equals(letra))
			System.out.println("El NIF introducido es correcto");
		else
			System.out.println("El NIF es incorrecto");
	}

}
