package _02ejemplos;

import java.util.Scanner;

public class _09Poltergeist {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//CUIDADO CUANDO SE HACE UN nextLine() despues de un nextXXX()
				
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		tec.nextLine();
		System.out.println("Nombre completo: ");
		String nombre= tec.nextLine(); 	
		//Con tec.nextLine quitamos el Intro. Vaciar el teclado.
		
		System.out.println("Estatura: ");
		double est= tec.nextDouble();
		
	}

}
