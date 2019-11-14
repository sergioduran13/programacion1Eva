package _02ejemplos;

import java.util.Scanner;

public class _15LeerEdades {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int numEdad;
		System.out.println("Cuantas edades vas a introducir?");
		numEdad = tec.nextInt();
		int contador = 0;
		int edad;

		while (contador != numEdad) {
			System.out.println("Introduce edad:");
			edad = tec.nextInt();
			contador = contador + 1;
		}
	}

}
