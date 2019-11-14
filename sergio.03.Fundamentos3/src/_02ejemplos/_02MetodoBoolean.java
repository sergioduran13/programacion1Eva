package _02ejemplos;

import java.util.Scanner;

public class _02MetodoBoolean {
	
	public static boolean puedeConducir(int edad){
		
		boolean puede;
		if (edad >=18)
			puede = true;
			else
			puede = false;	
		return puede;
	}
		
public static boolean puedeConducir2(int edad){
		boolean puede = edad >18;
		return puede;
	}

public static boolean puedeConducir3(int edad){
		return edad>=18;
}

	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		if(puedeConducir(edad))
			System.out.println("Puedes conducir");
		else
			System.out.println("No puedes conducir");
	}
	
	

}
