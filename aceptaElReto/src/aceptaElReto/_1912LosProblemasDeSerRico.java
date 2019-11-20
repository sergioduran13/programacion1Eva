package aceptaElReto;

import java.util.Scanner;

public class _1912LosProblemasDeSerRico {
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
			total = (num * litros) - ((diferencia + (diferencia * (num - 1))) / 2 * (num - 1));
			System.out.println(total);
			contador--;
		}

	}
}
