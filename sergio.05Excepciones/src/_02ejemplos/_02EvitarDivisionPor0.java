package _02ejemplos;

import java.util.Scanner;

public class _02EvitarDivisionPor0 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Numerador: ");
		int numerador = tec.nextInt();
		int denominador;
		do {
			System.out.println("Denominador");
			 denominador = tec.nextInt();
			
		} while (denominador == 0);
	
		
			System.out.println(numerador / denominador);

	}

}
