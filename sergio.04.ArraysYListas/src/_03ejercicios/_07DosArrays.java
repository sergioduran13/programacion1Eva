package _03ejercicios;

import java.util.Arrays;

public class _07DosArrays {

	public static double[] sumaArraysIguales(double a[], double b[]) {

		double[] resultado = new double[a.length];

		for (int i = 0; i < resultado.length; i++) {

			resultado[i] = a[i] + b[i];

		}

		return resultado;

	}

	public static double[] sumaArrays(double a[], double b[]) {

		double[] resultado;

		if (a.length < b.length) {

			resultado = new double[b.length];

			for (int i = 0; i < a.length; i++) {

				resultado[i] = a[i] + b[i];
			}

			for (int i = a.length; i < resultado.length; i++) {
				resultado[i] = b[i];

			}

		} else if (a.length > b.length){
			resultado = new double[a.length];

			for (int i = 0; i < b.length; i++) {
				resultado[i] = a[i] + b[i];
			}

			for (int i = b.length; i < resultado.length; i++) {
				resultado[i] = a[i];

			}

		} else{
			resultado = sumaArraysIguales(a, b);
		}

		return resultado;

	}

	public static void main(String[] args) {

		double[] a = { 1, 1, 1, 1 };
		double[] b = { 2, 2, 2, 2, 2, 2, 2 };
		double[] c = { 1, 1, 1};

		System.out.println(Arrays.toString(sumaArraysIguales(a, b)));

		System.out.println(Arrays.toString(sumaArrays(a, c)));

	}

}
