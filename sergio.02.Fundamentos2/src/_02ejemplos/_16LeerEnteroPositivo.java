package _02ejemplos;

import java.util.Scanner;

public class _16LeerEnteroPositivo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce numero positivo: ");
		int num = tec.nextInt();
		
		while (num<=0){
			System.out.println("Te has equivocado");
			System.out.println("Introduce positivo: ");
			num = tec.nextInt();
			
					
		}
		System.out.println("El numero introducido es: "+num);

	}

}
