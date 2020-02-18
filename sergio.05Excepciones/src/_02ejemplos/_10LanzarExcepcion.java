package _02ejemplos;

import java.util.Scanner;

public class _10LanzarExcepcion {
	 
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de dia: ");
		int dia = tec.nextInt();
		System.out.println(nombreDiaSemana(dia));

	}
	
	public static String nombreDiaSemana(int dia) {
		String nombre;
		
		switch (dia) {
		case 1: nombre = "Lunes";			break;
		case 2: nombre = "Martes";			break;
		case 3: nombre = "Miercoles";			break;
		case 4: nombre = "Jueves";			break;
		case 5: nombre = "Viernes";			break;
		case 6: nombre = "Sabado";			break;
		case 7: nombre = "Domingo";			break;

		default:
			throw new IllegalArgumentException("Numero incorrecto "+ dia);
		}
		return nombre;
	}

}
