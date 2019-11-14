package _03ejercicios;

import java.util.Scanner;

public class _14ImparesHastaN {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");
		int num = tec.nextInt();
		int impar = 1;

		while (impar <= num){

			System.out.print(impar + " ");
			impar = impar + 2;

		}
		
		//Con FOR
		
		for (impar = 1 ; impar <= num; impar +=2){
			System.out.print(impar + " ");

		}

	}

}
