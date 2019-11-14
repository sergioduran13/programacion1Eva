package _03ejercicios;

import java.util.Scanner;

public class _23Circulo {
	public static double longitudCircunferencia(double x) {

		double longitud = (2 * Math.PI) * x;
		return longitud;

	}

	public static double areaCirculo(double x) {

		double area = Math.PI * Math.pow(x, 2);
		return area;
	}

	public static double volumenEsfera(double x) {

		double volumen = (4.0 / 3.0) * Math.PI * Math.pow(x, 3);
		return volumen;

	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un radio: ");

		double radio = tec.nextDouble();
		double longitud = longitudCircunferencia(radio);
		double area = areaCirculo(radio);
		double volumen = volumenEsfera(radio);

		System.out.println("Longitud: " + longitud);
		System.out.println("Area: " + area);
		System.out.println("Volumen: " + volumen);

	}

}
