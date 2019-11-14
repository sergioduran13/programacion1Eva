package _03ejercicios;

import java.util.Scanner;

public class _05Horas {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca un número de segundos: ");
		int seg = tec.nextInt();
		
		System.out.println("El número de horas completas es: "+ (seg/3600));
		System.out.println("Sobran: "+ (seg%3600)+" segundos");
	}
}
