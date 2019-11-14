
package _03ejercicios;

import java.util.Scanner;

public class _06Contenedores {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int container = 0;
		double tonelada = 0;
		double peso = 0;

		while (container < 100 && peso < 700) {

			container++;
			System.out.println("Numero de container: " + container);
			System.out.println("Introduce un peso (en toneladas): ");
			tonelada = tec.nextInt();
			peso = peso + tonelada;
					
		}
		if (peso>700){
			peso = peso - tonelada;
			container= container -1;
		}
		System.out.println("------------------");

		System.out.println("Containers totales: " + container);
		System.out.println("Peso total(toneladas): " + peso);

	}

}
