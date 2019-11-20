package concursos;

import java.util.Scanner;

public class _525MultasDesdeElCielo {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int contador = 0;
		int casos = tec.nextInt();
				
		while (contador < casos) {
			contador++;
			int t1 = tec.nextInt();
			int t2 = tec.nextInt();
			int t3 = tec.nextInt();
			int t4 = tec.nextInt();

			// Ordenamos de menor a mayor
			int c1, c2, d1, d2;

			c1 = Math.min(t1, t2);
			c2 = Math.max(t1, t2);

			d1 = Math.min(t3, t4);
			d2 = Math.max(t3, t4);

			if (c2 <= d1)
				System.out.println("SEPARADOS");
			else if (d2 <= c1)
				System.out.println("SEPARADOS");
			else
				System.out.println("SOLAPADOS");

		}

	}

}