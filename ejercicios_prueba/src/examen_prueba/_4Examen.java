package examen_prueba;

import java.util.Scanner;

public class _4Examen {
	
	public static boolean empiezaComoTermina(int numero){
		boolean empiezaFin = false;
		numero = Math.abs(numero);
		String numeroS = String.valueOf(numero);
		char primero = numeroS.charAt(0);
		char ultimo = numeroS.charAt(numeroS.length()-1);
		
		if (primero == ultimo){
			empiezaFin = true;
		}
		
		return empiezaFin;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("numero 1: ");
		int num1 = tec.nextInt();

		System.out.println("Numero 2: ");
		int num2 = tec.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			if(empiezaComoTermina(i)){
				System.out.println(i);
			}
		}

	}

}
