package concursos;

import java.util.Scanner;

public class _474TuAmigableVecino {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		// Variables
		int n;
		int s, a, b;
		n = tec.nextInt();
		int cont = 0;
		int distancia;
		int distancia2;
		int d1;
		int d2;

		// Hacemos contador para n posibles casos
		while (cont < n) {
			cont++;
			s = tec.nextInt();
			a = tec.nextInt();
			b = tec.nextInt();

			// Leemos y operamos, si el resultado es negativo (<0) se convierte a positivo.

			// De A a B
			distancia = s - a;
			distancia = Math.abs(distancia);

			distancia2 = a - b;
			distancia2 = Math.abs(distancia2);


			d1 = distancia + distancia2;

			// De B a A
			distancia = s - b;
			distancia = Math.abs(distancia);


			distancia2 = b - a;
			distancia2 = Math.abs(distancia2);


			d2 = distancia + distancia2;
			
			
			System.out.println(Math.min(d1, d2));

	

		}

	}

}