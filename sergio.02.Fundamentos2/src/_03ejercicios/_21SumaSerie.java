package _03ejercicios;

import java.util.Scanner;

public class _21SumaSerie {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int n = tec.nextInt();
		
		int contador = 0;
		int n2 = n;
		double suma =0;
		
		while (contador<n){
			contador++;
			
			suma = suma + (1.0/n2);
			n2 = n2 -1;
	
		}
		
	
		System.out.println(suma);
		
		
		
		
		
		

	}

}
