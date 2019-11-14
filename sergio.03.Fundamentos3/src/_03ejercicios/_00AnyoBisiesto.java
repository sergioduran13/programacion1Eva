package _03ejercicios;

import java.util.Scanner;

public class _00AnyoBisiesto {

	public static boolean bisiesto(int a) {
	  return  a % 400 == 0 || a % 100 != 0 && a % 4 == 0;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("introduce un año: ");
		int a = tec.nextInt();

		//
		// if (a % 400 == 0) { System.out.println("Es bisiesto"); } else if (a %
		// 100 == 0) System.out.println("No es bisiesto"); else if (a % 4 == 0)
		// System.out.println("Es bisiesto"); else
		// System.out.println("No es bisiesto");
		//
		// System.out.println(a % 400 == 0 || a % 100 != 0 && a % 4 == 0);
		//

		if (bisiesto(a))
			System.out.println("Es bisiesto.");
		else
			System.out.println("No es bisiesto.");

	}

}
