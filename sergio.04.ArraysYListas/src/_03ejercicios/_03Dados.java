package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class _03Dados {
	final static int LANZAMIENTOS = 10000;

	public static void main(String[] args) {

		Random r = new Random();
		int[] veces = new int[7];
		int lanzamiento;
		for (lanzamiento = 0; lanzamiento < LANZAMIENTOS; lanzamiento++) {
			int valorDado = r.nextInt(6) + 1;
			veces[valorDado]++;
			
			if(lanzamiento%1000 == 0){
			for (int i = 1; i < veces.length; i++) {
				System.out.format("%d: %7.4f ", i, (100.0 * veces[i] / (lanzamiento+1)));
			}
			System.out.println();
			}

		}

	}

}
