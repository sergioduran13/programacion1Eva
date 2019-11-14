package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _04MultiplicarDosNumeros {
	public static void main (String args[]){
		Scanner tec= new Scanner(System.in);
		
		System.out.println("Introduce número 1: ");
		int num1 = tec.nextInt();
		System.out.println("Introduce número 2: ");
		int num2 = tec.nextInt();
		
		System.out.println("El producto de " + num1 + " por " + num2+ " es " +(num1 * num2) );
		System.out.format("El resultado de %d por %d es %d", num1, num2, num1*num2);
	}

}
