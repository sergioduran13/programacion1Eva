package _03ejercicios;

import java.util.Random;

public class _03Dados {

	public static void main(String[] args) {
		Random r = new Random();
		
		int dado1 = r.nextInt(6) + 1;
		int dado2 = r.nextInt(6) + 1;
		
		System.out.println("Dado 1: "+ dado1);
		System.out.println("Dado 2: "+ dado2);
		System.out.println("Suma 1: "+ (dado1+dado2));

		
				
		
	}

}
