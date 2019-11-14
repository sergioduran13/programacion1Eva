package _03ejercicios;

import java.util.Scanner;

public class _02Lluvias {

	public static double lluviaTotal(double p[]) {

		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total = total + p[i];
		}
		return total;
	}

	public static double lluviaMedia(double p[]) {
		return lluviaTotal(p) / p.length;

	}

	public static double lluviaMaxima(double p[]) {
		double numero = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > numero)
				numero = p[i];

		}

		return numero;
	}

	public static double lluviaMinima(double p[]) {
		double numero = p[0];
		for (int i = 0; i < p.length; i++) {
			if (p[i] < numero)
				numero = p[i];

		}

		return numero;
	}

	public static int diaMasLluvia(double p[]) {
		int dia = 0;
		double numero = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i] > numero) {
				numero = p[i];
				dia = i + 1;
			}
		}
		return dia;
	}

	public static int diaMenosLluvia(double p[]) {
		int dia = 0;
		double numero = Double.MAX_VALUE;

		for (int i = 0; i < p.length; i++) {
			if (p[i] < numero) {
				numero = p[i];
				dia = i + 1;
			}
		}
		return dia;

	}

	public static int contarDiasLluviaX(double p[], double x) {
		int veces = 0;

		for (int i = 0; i < p.length; i++) {
			if (x == p[i]) {
				veces++;
			}
		}
		return veces;

	}

	public static double lluviaTotalPeriodo(double p[], int ini, int fin) {
		ini--;
		fin--;
		double suma = 0;
		while (ini <= fin) {
			suma = suma + p[ini];
			ini++;
		}
		return suma;
	}

	public static int contarDiasLluviaCreciente(double[] p) {
		int dia = 0;
		for (int i = 0; i < p.length -1; i++) {
			if (p[i] < p[i+1]){
				dia++;
			}
		}
		return dia;
	}
	

public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double[] p = { 2, 2, 3, 4, 2, 1, 3, 4, 3, 10, 11, 12, 13, 14, 15, 16, 48, 18, 19, 49, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31 };

		double total = lluviaTotal(p);

		System.out.println("Lluvia total: " + total);

		System.out.println("LLuvia media: " + lluviaMedia(p));

		System.out.println("Cantidad que mas ha llovido: " + lluviaMaxima(p));

		System.out.println("Cantidad que menos ha llovido: " + lluviaMinima(p));

		System.out.println("Dia que mas ha llovido: " + diaMasLluvia(p));

		System.out.println("Dia que menos ha llovido: " + diaMenosLluvia(p));

		System.out.println("Dia inicio: ");
		int ini = tec.nextInt();
		System.out.println("Dia fin: ");
		int fin = tec.nextInt();

		System.out.println("Suma de lluvia entre rangos: " + lluviaTotalPeriodo(p, ini, fin));

	}

}
