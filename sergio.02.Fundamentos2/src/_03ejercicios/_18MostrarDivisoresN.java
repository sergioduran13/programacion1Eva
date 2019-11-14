package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int num1;
		System.out.println("Introduce un numero entero: ");
		num1 = tec.nextInt();
		int contador = 0;
		int resto;

		while (contador < num1) {
			contador++;
			resto = num1 % contador;
			if (resto == 0)
				System.out.println(contador);

		}
		
		//FOR
		num1 = tec.nextInt();
		for (contador =1; contador <=num1; contador++){
			resto = num1 % contador;
			if (resto == 0)
				System.out.println(contador);
		}

	}

}