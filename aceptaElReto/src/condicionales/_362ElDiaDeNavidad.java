package condicionales;

import java.util.Scanner;

public class _362ElDiaDeNavidad {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int a = tec.nextInt();

		int cont = 0;

		while (a != cont) {
			int b = tec.nextInt();
			int c = tec.nextInt();
			if (b == 25 & c == 12)
				System.out.println("SI");
			else
				System.out.println("NO");

			cont++;

		}

	}

}
