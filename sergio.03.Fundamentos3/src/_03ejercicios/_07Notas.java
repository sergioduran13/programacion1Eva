package _03ejercicios;

import java.util.Scanner;

public class _07Notas {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int nota = 0;
		int numNotas = 0;
		int aprobados = 0;
		int media = 0;

		do {
			System.out.println("Introduce nota:");
			nota = tec.nextInt();
			if (nota >= 0) {
				numNotas++;
				media = media + nota;

				if (nota >= 5) {
					aprobados++;
				}
			}
		} while (nota >= 0);

		System.out.println("-------------");
		System.out.println("Numero de notas introducidas: " + numNotas);
		System.out.println("Numero de aprobados: " + aprobados);
		System.out.println("Numero de suspendidos: " + (numNotas - aprobados));
		System.out.println("Nota media: " + (media / (numNotas*1.0)));
	}

}
