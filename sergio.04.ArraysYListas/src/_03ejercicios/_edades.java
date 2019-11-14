package _03ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//el usuario introduce edades, las que el usario quiera. cuantas tienen entre 0-9, 10-19,... hasta 100.

public class _edades {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("¿Cuantas edades vas a introducir?");
		int numEdades = tec.nextInt();
		int rango[] = new int[10];
		
		for (int i = 0; i < numEdades; i++) {
			System.out.println("Edad: ");
			int edad = tec.nextInt();
			rango[edad/10]++;
					
		}
		
		for (int i = 0; i < rango.length; i++) {
			System.out.println("Edades en rango de edad " + (i+1)+ "ª decena: " + rango[i]  );
			
		}
		

	}

}
