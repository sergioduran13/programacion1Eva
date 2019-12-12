package _03ejercicios;

import java.util.Scanner;

public class _01ValidarFecha {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce fecha: ");
		String texto = tec.nextLine();
		System.out.println(esFechaValida(texto));

	}

	public static boolean esFechaValida(String fecha) {

		try {
			int posBarra1 = fecha.indexOf("/");
			int posBarra2 = fecha.indexOf("/", posBarra1 + 1);

			String textoD = fecha.substring(0, posBarra1);
			String textoM = fecha.substring(posBarra1 + 1, posBarra2);
			String textoA = fecha.substring(posBarra2 + 1);

			int d = Integer.parseInt(textoD);
			int m = Integer.parseInt(textoM);
			int a = Integer.parseInt(textoA);

			if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && a >= 1) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		} catch (StringIndexOutOfBoundsException e) {
			return false;
		}

	}

}
