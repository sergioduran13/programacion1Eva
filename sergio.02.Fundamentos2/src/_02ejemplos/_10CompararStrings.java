package _02ejemplos;

import java.util.Scanner;

public class _10CompararStrings {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre 1: ");
		String n1= tec.nextLine();
		
		System.out.println("Nombre 2: ");
		String n2 = tec.nextLine();
		
		//Forma incorrecta
		
		if (n1==n2)
			System.out.println("Los nombre son iguales");
		else
			System.out.println("Los nombres son distintos");
		
		//Forma correcta
		
		if (n1.equals(n2))
			System.out.println("Los nombre son iguales");
		else
			System.out.println("Los nombres son distintos");
		
		//Forma incorrecta
		
		if (n1 != "pepe")
			System.out.println("No te llamas pepe");
		
		//Forma correcta
		
		if (!n1.equals("pepe"))
			System.out.println("No te llamas pepe");
			else
				System.out.println("Te llamas pepe");
		
		
	}

}
