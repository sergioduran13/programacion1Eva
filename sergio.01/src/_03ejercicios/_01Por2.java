package _03ejercicios;

import java.util.Scanner;

public class _01Por2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int numero = tec.nextInt();
		System.out.println("El doble de "+ numero+ " es " + (numero*2));
	}

}
