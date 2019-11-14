package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _10AdivinarNumero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Random r = new Random();
		int num=r.nextInt(100)+1;
		int num2;
		//System.out.println("Numero a adivinar: " + num);
		System.out.println("---------------------------");
		
		do {
			System.out.println("Adivina el numero: ");
			num2 = tec.nextInt();
			if (num2>num)
				System.out.println("Te has pasado");
			else if (num2<num)
				System.out.println("Te has quedado corto");
			
		} while (num2 != num);
		System.out.println("Has acertado");
	}

}
