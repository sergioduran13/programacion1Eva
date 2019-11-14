package _02Ejemplos;

import java.util.Arrays;

public class _10ClaseArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,6,4};
		int[] b = {2,1,3,6,4};
		int[] c = new int[10];
		
		//METODOS DE LA CLASE Arrays
		
		//Mostrar el contenido
		System.out.println(Arrays.toString(a));
		
		//Rellenar un array con valores
		Arrays.fill(c, 125);
		System.out.println(Arrays.toString(c));

		//Ordenar
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		//Comprobar si dos arrays son iguales
		
		System.out.println(Arrays.equals(a, c));
	
	}

}
