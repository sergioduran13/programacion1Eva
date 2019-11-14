package _03ejercicios;

import java.util.Scanner;

public class _08Medidas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double pies;
		System.out.println("Introduzca una medida es pies: ");
		pies = tec.nextDouble();
		System.out.println("Pulgadas: "+ pies * 12);
		System.out.println("Yardas: " + pies / 3.0 );
		System.out.println("Centímetros: "+ pies * 30.48);
		System.out.println("Metros: "+ pies * 0.3048);


		
		
	}

}
