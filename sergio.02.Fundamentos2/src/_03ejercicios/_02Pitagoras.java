package _03ejercicios;

import java.util.Scanner;

public class _02Pitagoras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double cateto1;
		double cateto2;
		double hipotenusa;
		
		System.out.println("Introduce cateto 1: ");
		cateto1= tec.nextDouble();
		System.out.println("Introduce cateto 2: ");
		cateto2= tec.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
		
		//Math.sqrt es la raiz cuadrada
		//Math.pow un numero elevado a otro numero
		
		System.out.println("Hipotenusa: "+ hipotenusa);

		

	}

}
