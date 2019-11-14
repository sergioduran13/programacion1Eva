package _03ejercicios;

import java.util.Scanner;

public class _16CuentaAtras {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		
		int num = tec.nextInt();
				
		while (num>=0){
			
			System.out.println(num);
			num--;
			
		}
		
		//FOR
		
		for (num = tec.nextInt(); num >=0; num--){
			System.out.println(num);
		}
	}

}
