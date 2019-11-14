package _03ejercicios;

import java.util.Scanner;

public class _03IndiceMasa {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escriba peso en kg: ");
		double num1 = tec.nextDouble();
		System.out.println("Escriba altura en metros: ");
		double num2 = tec.nextDouble();
		
		
		System.out.println("Tu IMC es :"+ (num1/((num2*num2))));
		


	}

}
