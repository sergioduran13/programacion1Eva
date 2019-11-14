package _02ejemplos;

import java.util.Scanner;

public class _09Estaturas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce estatura: ");
		double estatura = tec.nextDouble ();
		
		
		if( estatura >2) System.out.println("MUY ALTO");
			
		 else if( estatura >1.7)System.out.println("ALTO");
		 else if( estatura >1.6)System.out.println("ESTATURA MEDIA");
		 else System.out.println("BAJO");
			
		
	}
}
	
	
		


