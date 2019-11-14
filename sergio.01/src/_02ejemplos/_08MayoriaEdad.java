package _02ejemplos;

import java.util.Scanner;

public class _08MayoriaEdad {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		int edad;
		edad = tec.nextInt();
		
		if(edad>=18){
			
			System.out.println("Tienes "+ edad + " años");
			System.out.println("Eres MAYOR de edad");
		} else {
			System.out.println("Tienes "+ edad + " años");
			System.out.println("Eres MENOR de edad");
		}
		
		
		
		
	}

}
