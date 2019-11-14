package _03ejercicios;

import java.util.Scanner;

public class _01Estaturas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double estatura;
		double[] personas = new double[10];

		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Introduce estatura persona "+(cont+1)+":");
			estatura = tec.nextDouble();
			personas[cont] = estatura;
		}
		
		for(int i=0; i< personas.length;i++){
			System.out.println("Estatura de persona "+ (i+1) + ": " + personas[i]+"m" );
		}
	}
}
