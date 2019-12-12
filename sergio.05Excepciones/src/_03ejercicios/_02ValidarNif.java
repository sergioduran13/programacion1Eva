package _03ejercicios;

import java.util.Scanner;

public class _02ValidarNif {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Nif: ");
		String nif = tec.nextLine();
		System.out.println(esNifValido(nif));

	}

	public static boolean esNifValido(String nif) {
		try {
			nif = nif.toUpperCase();
			char letra = nif.charAt(nif.length() - 1);

			String textoNumeros = nif.substring(0, nif.length() - 1);
			int numero = Integer.parseInt(textoNumeros);
			char letraCorrecta = calcularLetraNif(numero);
			if (letra == letraCorrecta) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			return false;
		}
		
	}

	public static char calcularLetraNif(int numero) {
		final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(numero % 23);

	}
}
