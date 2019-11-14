
package _03ejercicios;

import java.util.Scanner;

public class _06containers2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int container = 0;
		double tonelada = 0;
		double peso = 0;
		boolean cabeMas = true;
		while (cabeMas) {
			System.out.println("Introduce un peso (en toneladas): ");
			tonelada = tec.nextInt();
			if(peso+tonelada >= 700 || container >100)
				cabeMas = false;
			if (peso+tonelada <=700){
				container++;
				System.out.println("Numero de container: " + container);
				peso = peso + tonelada;
	


			}
		}
		
		System.out.println("------------------");

		System.out.println("Containers totales: " + container);
		System.out.println("Peso total(toneladas): " + peso);

	}

}
