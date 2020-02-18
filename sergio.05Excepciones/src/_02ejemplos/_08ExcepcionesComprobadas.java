package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08ExcepcionesComprobadas {

	public static void main(String[] args) {
		
		mediaTeclado();
		mediaFichero();

	}
	
	public static void mediaTeclado() {
		
			Scanner tec = new Scanner(System.in);
			System.out.println("Introduce 5 numeros: ");

			int suma = 0;
			for (int i = 1; i <= 5; i++) {
				int num = tec.nextInt();
				suma += num;
			}
			System.out.println("Media: " + (suma/5.0));
		

		
	}

	public static void mediaFichero() {
		
		Scanner tec = null; 
		
		try {
			 tec = new Scanner(new File("numeros.txt"));

			int suma = 0;
			for (int i = 1; i <= 5; i++) {
				
				int num = tec.nextInt();
				suma += num;
			}
			System.out.println("Media: " + (suma/5.0));
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe.");
		}finally {
			if(tec!= null) tec.close();
		}

	}

}
