package aceptaElReto;

import java.util.Scanner;

public class _191LosProblemasDeSerRico {

	public static int operacion(int num, int litros, int diferencia) {
		int total = 0;

		while (num > 0) {

			total = total + litros;
			litros = litros - diferencia;
			num--;
		}

		return total;
	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int contador = tec.nextInt();
		int num;
		int litros;
		int diferencia;
		int total;

		while (contador > 0) {

			num = tec.nextInt();
			litros = tec.nextInt();
			diferencia = tec.nextInt();
			total = operacion(num, litros, diferencia);
			System.out.println(total);

			contador--;
		}

	}
}
