package _03ejercicios;

import java.util.Scanner;

public class _16NotasTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nota: ");
		int nota = tec.nextInt();

		if (nota < 5)
			System.out.println("INSUFICIENTE");
		else if (nota < 6)
			System.out.println("SUFICIENTE");
		else if (nota < 7)
			System.out.println("BIEN");
		else if (nota < 9)
			System.out.println("NOTABLE");
		else
			System.out.println("SOBRESALIENTE");

	}

}
