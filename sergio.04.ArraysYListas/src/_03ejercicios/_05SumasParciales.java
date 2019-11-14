package _03ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _05SumasParciales {

	public static int[] sumaParcial(int v[]) {

		int[] resultado = new int[v.length];
		int suma = 0;
		for (int i = 0; i < resultado.length; i++) {

			suma = suma + v[i];
			resultado[i] = suma;
		}

		return resultado;

	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int tamanyo = tec.nextInt();

		int[] v = new int[tamanyo];
		for (int i = 0; i < v.length; i++) {
			int numero = tec.nextInt();
			v[i] = numero;
		}
		System.out.println(Arrays.toString(sumaParcial(v)));
	}

}
