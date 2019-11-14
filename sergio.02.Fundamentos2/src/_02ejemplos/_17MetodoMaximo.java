package _02ejemplos;

import java.util.Scanner;

public class _17MetodoMaximo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce 3 enteros: ");
		int a = tec.nextInt();
		int b = tec.nextInt();
		int c = tec.nextInt();
		
		//Guardar en una variable
		int m = maximoDe3(a,b,c);
		System.out.println("Maximo: " + m);
		
		//Al vuelo
		System.out.println("Maximo: " + maximoDe3(a,b,c));


		
		
		

	}

	public static int maximoDe3(int x, int y, int z) {
		int max;
		if (x > y) {
			if (x > z) {
				max = x;
			} else {
				max = z;
			}
		} else {
			if (y > z) {
				max = y;
			} else {
				max = z;
			}
		}

		return max;
	}
}
