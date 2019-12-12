package _03ejercicios;

import java.util.Scanner;

public class _03MediaEdades {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int suma = 0;
		int edad;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("edad "+i+": ");
			edad= tec.nextInt();
			suma = suma + edad;
		}
		
		System.out.println("Media: "+ (suma/5.0));
	}

}
