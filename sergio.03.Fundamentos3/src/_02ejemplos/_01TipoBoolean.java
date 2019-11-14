package _02ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		boolean esMayor = edad >=18;
		System.out.println(esMayor);
		
		//Estos dos if serian equivalentes:
		if  (edad>=18)
		System.out.println("Eres mayor");
		
		if (esMayor) 
			System.out.println("Eres mayor");
		
	}
	
	

}
