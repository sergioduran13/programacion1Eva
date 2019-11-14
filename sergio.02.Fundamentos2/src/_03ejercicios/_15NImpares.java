package _03ejercicios;

import java.util.Scanner;

public class _15NImpares {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un entero: ");
		int num = tec.nextInt();
		int contador = 0;
		int impar = 1;
		while (contador < num) {
			System.out.println(impar );
			contador = contador + 1;
			impar = impar + 2;

		}
		
		//CON FOR
		impar=1;
		for(contador = 0;contador < num ; contador++){
			System.out.println(impar );
			impar+=2;
		}
	
		
	}

}
