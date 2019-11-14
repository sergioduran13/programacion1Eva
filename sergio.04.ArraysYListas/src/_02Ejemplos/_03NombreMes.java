package _02Ejemplos;

import java.util.Scanner;

public class _03NombreMes {

	public static String nombreMes(int mes) {
		String[] nombre = { " ", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		return nombre[mes];
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int mes = tec.nextInt();
		String nombre = nombreMes(mes);
		System.out.println(nombre);
		
	}
	
}
