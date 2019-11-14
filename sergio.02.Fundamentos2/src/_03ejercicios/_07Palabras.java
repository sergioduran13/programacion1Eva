package _03ejercicios;

import java.util.Scanner;

public class _07Palabras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Solicito texto
		System.out.println("Escribe un texto: ");
		String texto = tec.nextLine();

		// Primera letra
		System.out.println("La primera palabra del texto introducido: " + texto.charAt(0));

		// Ultima Palabra
		System.out.println("La última letra del texto introducido: " + texto.charAt(texto.length() - 1));

		
		//Mostrar Palabras
		int primera = texto.indexOf(' ');
		int segunda = texto.indexOf(' ',  (primera+1));
		int tercera = texto.indexOf(' ',  (segunda+1));

		if (primera == -1) {
			System.out.println("La primera palabra del texto introducido: " + texto);
			System.out.println("Solo tiene una palabra");
		}
		
		else if (segunda == -1) {
			System.out.println("La primera palabra del texto introducido: " + texto.substring(0, primera));
			System.out.println("La segunda palabra que contenga el texto: " + texto.substring(primera));
			System.out.println("Solo tiene dos palabras");

		} else if (tercera == -1){
			System.out.println("La primera palabra del texto introducido: " + texto.substring(0, primera));
			System.out.println("La segunda palabra que contenga el texto: " + texto.substring(primera, segunda));
			System.out.println("La tercera palabra que contenga el texto: " + texto.substring(segunda));
			System.out.println("Tiene 3 palabras");


		}else{
			System.out.println("La primera palabra del texto introducido: " + texto.substring(0, primera));
			System.out.println("La segunda palabra que contenga el texto: " + texto.substring(primera, segunda));
			System.out.println("La tercera palabra que contenga el texto: " + texto.substring(segunda, tercera));
			System.out.println("Tiene más de 3 palabras");

		}
	}

}
