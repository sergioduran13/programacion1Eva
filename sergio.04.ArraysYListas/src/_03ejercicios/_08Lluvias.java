package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class _08Lluvias {

	public static int primerDiaLluviaX(double p[], double x) {
		int dia = -1;
		boolean encontrado = false;
		for (int i = 0; i < p.length && !encontrado; i++) {
			if (p[i] == x) {
				encontrado = true;
				dia = i;
			}
		}
		return dia;
	}

	public static int ultimoDiaLluviaX(double p[], double x) {

		int dia = -1;
		boolean encontrado = false;

		for (int i = p.length - 1; i >= 0 && !encontrado; i--) {
			if (p[i] == x) {
				encontrado = true;
				dia = i;
			}
		}
		return dia;
	}

	public static void main(String[] args) throws FileNotFoundException {
		double[] lluvias = new double[31];
		double cantidad = 1;

		// Cargamos el array con datos de un fichero

		Scanner f = new Scanner(new File("lluvias.txt"));
		for (int i = 0; i < lluvias.length; i++) {
			lluvias[i] = f.nextDouble();
		}

		f.close();

		System.out.println(primerDiaLluviaX(lluvias, cantidad) + 1);
		System.out.println(ultimoDiaLluviaX(lluvias, cantidad)+1);

	}

}
