package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _07PropagarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;

		do {
			try {
				System.out.println("Num 1: ");
				int num1 = tec.nextInt();

				System.out.println("Num2: ");
				int num2 = tec.nextInt();

				System.out.println("Operacion (+,-,*,/):");
				char op = tec.next().charAt(0);

				int result = calcular(num1, num2, op);

				System.out.println("Resultado: " + result);
				ok = true;

			} catch (InputMismatchException | ArithmeticException e) {
				System.out.println("Error en los datos.");
				tec.nextLine();
			}
		} while (!ok);
	}

	public static int calcular(int a, int b, char op) throws ArithmeticException {
		int res = 0;
		if (op == '+')
			res = a + b;
		else if (op == '-')
			res = a - b;
		else if (op == '*')
			res = a * b;
		else if (op == '/')
			res = a / b;

		return res;
	}
}