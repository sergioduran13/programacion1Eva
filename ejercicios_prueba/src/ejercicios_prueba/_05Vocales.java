package ejercicios_prueba;

import java.util.Scanner;

public class _05Vocales {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un texto: ");
		String texto = tec.nextLine().toLowerCase();
		int contA = 0;
		int contE = 0;
		int contI = 0;
		int contO = 0;
		int contU = 0;

		for (int i = 0; i < texto.length(); i++) {

			switch (texto.charAt(i)) {
			case 'a':
				contA++;
				break;
			case 'e':
				contE++;
				break;
			case 'i':
				contI++;
				break;
			case 'o':
				contO++;
				break;
			case 'u':
				contU++;
				break;
			
			}
		}

		System.out.println("En el textoy hay " + contA + " A");
		System.out.println("En el textoy hay " + contE + " E");
		System.out.println("En el textoy hay " + contI + " I");
		System.out.println("En el textoy hay " + contO + " O");
		System.out.println("En el textoy hay " + contU + " U");

		
		
	}

}
