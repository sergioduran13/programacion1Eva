package _03ejercicios;

import java.util.Scanner;

public class _11LongitudEntero {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un entero largo: ");
		long texto = tec.nextLong();
		
		String num = String.valueOf(texto);
		
		System.out.println("Longitud: "+ num.length() );
		
		
	}

}
