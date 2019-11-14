package _03ejercicios;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class _10QuitarBlancosSobrantes {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		
		//Leemos las palabras
		System.out.println("Introduce dos palabras: ");
		String texto = tec.nextLine().trim();
		
		//Quitamos espacios
		 
		int espacio = texto.indexOf(' ');
		String palabra1 = texto.substring(0, espacio);
		String palabra2 = texto.substring(espacio);
		palabra2 = palabra2.trim();
			
		
		System.out.println("Las palabras sin espacios son: " + palabra1 + " "+palabra2);

		
		
		
	}

}
