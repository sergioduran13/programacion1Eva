package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un entero: ");
		int num = tec.nextInt();
		int contador = 0;
		int suma = 0;
		int num2 = 0;

		while (contador < num) {

			contador = contador + 1;
			suma = suma + 1;
			// suma++;
			num2 = suma + num2;
			// impar +=2

		}

		System.out.println("El sumatorio es " + num2);

		// FOR

		suma = 0;
		num2 = 0;
		num = tec.nextInt();
		int x = num;
		for (contador = 0; contador < num; contador++) {
			suma++;
			num2 += suma;
		}
		System.out.println("El sumatorio es " + num2);

	}

}
