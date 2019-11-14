package _03ejercicios;

public class _13Subsecuencia {

	public static int posicionSecuencia(int[] a) {
		int posicion = 0;
		int secuencia = 0;
		boolean encontrado = false;
		
		for (int i = 0; i < (a.length -1)  && !encontrado; i++) {

			if (a[i] == (a[i + 1] - 1)) {
				secuencia = secuencia + 1;
			} else {
				secuencia = 0;
			}
			if (secuencia == 2) {
				posicion = i - 1 ;
				encontrado = true;
			}
		}

		return posicion;
	}

	public static void main(String[] args) {
		int[] a = {7, 1, 2, 8, 3, 8, 9, 10,11 };
		int posicion = posicionSecuencia(a);
		
		if(posicion==0)
		System.out.println("-1");
		
		else
			System.out.println(posicion);
		
	}

}
