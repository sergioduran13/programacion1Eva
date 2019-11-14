package _03ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _06Rotaciones {
	
	public static void rotarDerecha(int v[]){
		int ultimoValor =v[v.length -1];
	
		for (int i = v.length-1; i > 0; i--) {
			v[i] = v[i-1];
			
		}
		v[0] = ultimoValor;
	}
		
	
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int tamanyo = tec.nextInt();
		
		int[] v = new int[tamanyo];
		for (int i = 0; i < v.length; i++) {
			int numero = tec.nextInt();
			v[i] = numero;
		}
		for (int i = 0; i < v.length; i++) {
			rotarDerecha(v);
			System.out.println(Arrays.toString(v));
			System.out.println("-----------------");
		}
	}
}
