package _03ejercicios;

import java.util.Scanner;

public class _11UltimaCifra {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int num;

		System.out.println("Introduce un número entero: ");
		num = tec.nextInt();
		
		System.out.println("La última cifra de "+num+ " es: "+ (num%10));
		
}

}
