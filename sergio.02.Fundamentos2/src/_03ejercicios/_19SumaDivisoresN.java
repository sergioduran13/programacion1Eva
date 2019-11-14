package _03ejercicios;

import java.util.Scanner;

public class _19SumaDivisoresN {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num1;
		System.out.println("Introduce un numero entero: ");
		num1 = tec.nextInt();
		int contador = 0;
		int resto;
		int suma=0;

		while (contador < num1) {
			contador++;
			resto = num1 % contador;
			if (resto == 0)
				suma = suma + contador;
		}
		
		System.out.println(suma);
		
		//FOR
		num1=tec.nextInt();
		for(contador=0;contador<num1;contador++){
			resto = num1 % contador;
			if (resto == 0)
				suma = suma + contador;
			
		}
	}
}