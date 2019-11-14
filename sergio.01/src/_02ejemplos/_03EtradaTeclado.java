package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _03EtradaTeclado {
	public static void main (String args[]){
		//Scanner tec= new Scanner(System.in);
		//Para introducir la estatura con ,
		Scanner tec= new Scanner(System.in).useLocale(Locale.US);
		//Para introducir la estatura con . 

		
		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt(); //Leemos un entero
		
		System.out.println("Introduce tu estatura en metros: ");
		double estatura = tec.nextDouble();
		
		System.out.println("Tienes " + edad + " años");
		System.out.println( "Mides " + estatura + " metros");
	}

}
