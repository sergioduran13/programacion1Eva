package _03ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {

	public static String palabra(char x, int y){
		
		int contador= 0;
		String cadena= "";
		
		while (contador < y){
			contador++;
			 cadena = cadena + x;
		}
		return cadena;
		
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un caracter: ");
		char letra = tec.next().charAt(0);
		
		System.out.println("Numero de repeticiones: ");
		int n = tec.nextInt();
		
		String cadena = palabra(letra, n);
		
		System.out.println(cadena);
		
		
		

	}

}
