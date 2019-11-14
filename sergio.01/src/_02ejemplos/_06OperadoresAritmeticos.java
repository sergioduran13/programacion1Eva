package _02ejemplos;

import java.util.Scanner;

public class _06OperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce un entero: ");
		num1 = tec.nextInt();
		System.out.println("Introduce otro entero: ");
		num2 = tec.nextInt();
		
		//Operaciones Aritmeticas
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Producto: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));
		System.out.println("Resto division: " + (num1 % num2));
		
		//Division entera
		
		System.out.println("Division Entera: " + ( 5/2));
		System.out.println("Division real: " + ( 5/2.0));




	}
	
}

