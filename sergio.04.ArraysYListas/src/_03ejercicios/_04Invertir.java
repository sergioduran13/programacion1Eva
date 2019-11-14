package _03ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _04Invertir {
	
	public static int[] invertirArray(int[] v){
		
		int[] resultado = new int[v.length];
		int posicionResultado= v.length;
				
		for (int i = 0; i <= v.length -1; i++) {
			 posicionResultado--;
			 resultado[posicionResultado] = v[i] ;
			}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int tamanyo = tec.nextInt();
		
		int[] v = new int[tamanyo];
		for (int i = 0; i < v.length; i++) {
			int numero = tec.nextInt();
			v[i] = numero;
		}
		
		System.out.println(Arrays.toString(invertirArray(v)));
		
	}

}
