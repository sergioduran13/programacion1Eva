package _03ejercicios;

import java.util.Scanner;

public class _12Almacen {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int dia = 1;
		int cantidad;
		int cantidadT = 500;
		int diferencia;

		do {

			System.out.format("Introduzca cantidad a servir el dia %d :", dia);
			cantidad = tec.nextInt();
			diferencia = cantidadT - cantidad;
		
			if (cantidad == 0) {
				System.out.println("Fin del programa.");
			} else{

			// Cantidad stock suficiente.
			if (cantidad <= cantidadT && diferencia >= 0) {
				cantidadT = cantidadT - cantidad;
				System.out.println("Pedido servido");
				// Stock minimo inferior a 100
				if (cantidadT < 100) {
					cantidadT = 500 - cantidadT;
					System.out.format("Rebasado stock mínimo. Se compran %d unidades. \n", cantidadT);
					cantidadT = 500;

				}

				// Cantidad insuficiente de sotck
			} else if (cantidad > cantidadT) {
				System.out.println("Stock insuficiente");

			}
			System.out.println("Queda en almacen: " + cantidadT + "\n");
			dia++;
			}

		} while (cantidad != 0);

	}

}
