package _03ejercicios;

public class _10PrimerImpar {

	public static int sumaDesdeImpar(int[] a) {
		int suma = 0;
		int primerImpar = 0;
		boolean impar = false;

		for (int i = 0; i < a.length && !impar; i++) {
			if (a[i] % 2 != 0) {
				impar = true;
				primerImpar = i;
			}
		}

		for (int i = primerImpar +1; i < a.length; i++) {
			suma = suma + a[i];
		}

		return suma;
	}

	public static void main(String[] args) {
		
		int[] a = { 2, 4 , 3 , 3 , 4 };
		System.out.println(sumaDesdeImpar(a));
	}

}
