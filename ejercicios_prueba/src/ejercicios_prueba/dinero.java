package ejercicios_prueba;

import java.util.Arrays;
import java.util.Scanner;

public class dinero {

	public static int[] repartirFacil(int cantidad, int[] valorBilletes) {

		int[] resultado = new int[valorBilletes.length];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = cantidad / valorBilletes[i];
			cantidad = cantidad % valorBilletes[i];
		}

		return resultado;

	}

	public static int[] repartirMedio(int cantidad, int[] valorBilletes, int[] stock) {

		int[] resultado = new int[valorBilletes.length];
		int resto = 0;
		int division = 0;

		for (int i = 0; i < resultado.length; i++) {
			division = cantidad / valorBilletes[i];

			if (stock[i] > division) {
				resultado[i] = division;
				resto = (division * valorBilletes[i]);
				cantidad = cantidad - resto;
			} else {
				division = stock[i];
				resultado[i] = division;
				resto = (division * valorBilletes[i]);
				cantidad = cantidad - resto;
			}

		}

		return resultado;
	}

	public static int[] repartirCompleto(int cantidad, int[] valorBilletes, int[] stock) {

		int[] resultado = new int[valorBilletes.length];
		int resto = 0;
		int division = 0;

		for (int i = 0; i < resultado.length; i++) {
			division = cantidad / valorBilletes[i];

			if (stock[i] - division > 0) {
				resultado[i] = division;
				resto = (division * valorBilletes[i]);
				cantidad = cantidad - resto;

			} else {
				division = stock[i];
				resultado[i] = division;
				resto = (division * valorBilletes[i]);
				cantidad = cantidad - resto;
			}

		}
		//Cantidad pedida mayor a la de stock.
		if (cantidad > 0) {
			return null;
		} else {
			
			//Modificamos stock
			for (int j = 0; j < resultado.length; j++) {
				stock[j] = stock[j] - resultado[j];
			}

			return resultado;
		}
	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int[] valorBilletes = { 100, 50, 20, 10, 5, 1 };
		int[] stock = { 5, 10, 33, 40, 8, 100 };

		System.out.println("Cantidad a repartir: ");
		int cantidad = tec.nextInt();

		// Dinero con stock ilimitado
		int[] reparto = repartirFacil(cantidad, valorBilletes);
		System.out.println("Reparto 1: ");
		System.out.println(Arrays.toString(reparto));
		// Dinero con stock

		int[] reparto2 = repartirMedio(cantidad, valorBilletes, stock);
		System.out.println("Reparto 2: ");
		System.out.println(Arrays.toString(reparto2));

		// Dinero con stock y reduce el stock

		int[] reparto3 = repartirCompleto(cantidad, valorBilletes, stock);

		if (reparto3 != null) {

			System.out.println("Reparto 3: ");
			System.out.println(Arrays.toString(reparto3));
			System.out.println("Stock: ");
			System.out.println(Arrays.toString(stock));
		} else {
			System.out.println("No hay dinero suficiente");
		}

	}

}
