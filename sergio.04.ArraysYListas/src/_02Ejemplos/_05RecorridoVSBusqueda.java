package _02Ejemplos;

public class _05RecorridoVSBusqueda {

	public static void main(String[] args) {
		int[] edad = { 2, 3, 4, 1, 5, 45, 78, 34, 26, 7, 12 };
		int cont = 0;
		// Recorrido contar mayores de edad:

		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18)
				cont++;
		}

		System.out.println("Mayores de edad: " + cont);

		// Busqueda: hay alguien mayor de edad

		boolean resultado = false;

		for (int i = 0; i < edad.length && !resultado; i++) {

			if (edad[i] >= 18) {
				resultado = true;
				System.out.println("Sí hay alguien mayor de edad");
			}
		}
		
		if(!resultado){
			System.out.println("No hay nadie mayor de edad");
		}
		
	}

}
