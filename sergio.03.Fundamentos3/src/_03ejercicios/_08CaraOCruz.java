package _03ejercicios;

import java.util.Random;

public class _08CaraOCruz {
	/*
	 * VARIABLES CONSTANTES, son variables que nunca cambian
	 * final static int CARA = 1; 
	 * final static int CRUZ =
	 * 0;
	 */

	public static void main(String[] args) {

		Random r = new Random();

		int moneda;
		int total = 0;
		int contCara = 0;
		int contCruz = 0;
		double mediaCara = 0;
		double mediaCruz = 0;
		double media;

		do {

			moneda = r.nextInt(2);
			if (moneda == 1)
				contCara++;
			else
				contCruz++;

			total = contCara + contCruz;
			mediaCara = (contCara * 100.0) / total;
			mediaCruz = (contCruz * 100.0) / total;
			media = mediaCara - mediaCruz;
			media = Math.abs(media);

			System.out.println("Cruces: " + contCruz + "," + " Porcentaje: " + mediaCruz);
			System.out.println("Caras: " + contCara + "," + " Porcentaje: " + mediaCara + "\n");

		} while (media > (0.001));
		System.out.println("--------------------");
		System.out.println("TOTAL");
		System.out.println("Cruces: " + contCruz + "," + " Porcentaje: " + mediaCruz);
		System.out.println("Caras: " + contCara + "," + " Porcentaje: " + mediaCara);
	}

}
