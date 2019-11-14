package _02ejemplos;

import java.util.Scanner;

public class _14MediaNotas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int contador = 0;
		double sumaNotas = 0;
		while (contador < 5) {
			System.out.println("Introduce nota: ");
			double nota = tec.nextDouble();
			
			sumaNotas= sumaNotas + nota;

			contador = contador + 1;
		}
		
		double media = sumaNotas/ 5.0;
		System.out.println(media);
	}

}
