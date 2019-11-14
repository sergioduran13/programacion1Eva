package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _11AdivinarNumero2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Random r = new Random();
		int num = r.nextInt(101);
		int num2 = 0;
		System.out.println("Numero a adivinar: " + num);
		System.out.println("---------------------------");
		int contador = 0;

		while (contador < 5) {
			System.out.println("Adivina el numero: ");
			num2 = tec.nextInt();
			if (num2 > num){
				System.out.println("Te has pasado");
				contador++;
			}else if (num2 < num){
				System.out.println("Te has quedado corto");
			contador++;

			}else if (num2 == num) {
				System.out.println("Has acertado");
				contador = 5;
			}
		}
		if (num2 != num)
			System.out.println("Has agotado intentos. El número era: " + num);
	}
}