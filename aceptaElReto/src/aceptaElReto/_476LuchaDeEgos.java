package aceptaElReto;

import java.util.Scanner;

public class _476LuchaDeEgos {

	public static void emparejamiento(int superheroes) {
		Scanner tec = new Scanner(System.in);

		String resultado;

		int[] nivel = new int[superheroes];

		// Niveles
		for (int i = 0; i < nivel.length; i++) {
			nivel[i] = tec.nextInt();
		}

		// max valor y min valor
		int[] max = new int[superheroes];
		int[] min = new int[superheroes];
		for (int i = 0; i < max.length; i++) {
			String preferencia = tec.next();
			char valor = preferencia.charAt(0);
			int rival = Character.getNumericValue(preferencia.charAt(1));
			if (valor == '=') {
				max[i] = rival;
				min[i] = rival;

			} else if (valor == '>') {
				max[i] = 5;
				min[i] = rival + 1;
			} else {
				max[i] = rival - 1;
				min[i] = 1;
			}
		}

		// Han sido asignados, puestos en false.
		boolean[] asignados = new boolean[superheroes];
		for (int i = 0; i < asignados.length; i++) {
			asignados[i] = false;
		}

		boolean pareja = false;
		for (int i = 0; i < (asignados.length -1); i++) {
			boolean encontrado = false;
			for (int j = i + 1; j < asignados.length && !asignados[j] && !asignados[i]; j++) {
				if(min[i] <= nivel[j] && max[i] >= nivel[j] && min[j] <= nivel[i] && max[j] >= nivel[i]){
					encontrado = true;
					asignados[i] = true;
					asignados[j] = true;
					pareja = true;
					System.out.println((i+1) + " " + (j+1));
				}
				
			}
			}
		
		if(!pareja){
			System.out.println("NO HAY");
		}
		}



	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int superheroes = 0;

		do {
			superheroes = tec.nextInt();
			if(superheroes>0 && superheroes<=100){
			emparejamiento(superheroes);
			System.out.println("---");
			}else{
				System.out.println("---");
			}
		} while (superheroes > 0);

	}

}


