package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _09BlackJack {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random r = new Random();

		String pregunta;
		int resultado = 0;
		int total = 0;

		do {
			System.out.println("¿Quieres otra carta?");
			pregunta = tec.nextLine();
			if (pregunta.equals("si")) {
				resultado = r.nextInt(10) + 1;
				total = total + resultado;
				pregunta = tec.next();
				System.out.println("Tus cartas suman: "+ total);
			}

		} while (pregunta.equals("si") && total <= 21);

		
		if (total > 21)
			System.out.println("Te has pasado. Tus cartas suman: " + total);

		else
			System.out.println("Fin de jugada. Tus cartas suman " + total);

	}
}
