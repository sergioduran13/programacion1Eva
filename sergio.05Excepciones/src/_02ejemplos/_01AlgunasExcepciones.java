package _02ejemplos;

import java.util.Scanner;

public class _01AlgunasExcepciones {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		//El usuario indica su nombre y una posicion.
		//Se le muestra que caracte esta en la posicion indicada
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Posicion: ");
		int pos = tec.nextInt();
		
		if(pos >= 0 && pos < nombre.length()){
		char caracter = nombre.charAt(pos);
		
		System.out.format("En la posicion %d de %s está el caracter %c %n", pos, nombre, caracter);
		 
		}else{
			System.out.println("Posicion incorrecta");
		}
		
	}

}
