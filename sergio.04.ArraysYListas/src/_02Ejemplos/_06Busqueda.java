package _02Ejemplos;

public class _06Busqueda {
	public static void main(String[] args) {
		int[] edad = { 2, 3, 4, 1, 5, 4, 7, 3, 26, 7, 12 };

		// Averiguar si las edades suman mas de 100 o no.

		boolean supera = false;
		int suma = 0;
		for (int i = 0; i < edad.length && !supera; i++) {
			suma = suma + edad[i];
			if (suma > 100) {
				System.out.println("Superan 100");
				supera = true;
			}
		}
		if (!supera)
			System.out.println("No superan 100");
	}

}
