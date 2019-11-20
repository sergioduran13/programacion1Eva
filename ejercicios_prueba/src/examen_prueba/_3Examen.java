package examen_prueba;

import java.util.Random;
import java.util.Scanner;

public class _3Examen {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Random r = new Random();
		int num = r.nextInt(101);
		int num2 = 0;
		System.out.println("Numero a adivinar: " + num);
		System.out.println("---------------------------");
		int contador = 0;

		while (contador < 10) {
			System.out.println("Intento " + (contador + 1) + ":");
			num2 = tec.nextInt();
			if (num2 > num){
				System.out.println("Te has pasado");
				contador++;
			}else if (num2 < num){
				System.out.println("Te has quedado corto");
			contador++;

			}else if (num2 == num) {
				System.out.println("ACERTASTE");
				contador = 5;
			}
		}
		if (num2 != num)
			System.out.println("Has agotado intentos. El número era: " + num);
	}
}