package _03ejercicios;

import java.util.Scanner;

public class _04Redondear {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double n;
		double operacion;
		double m;
		
		System.out.println("Introduce un numero real: ");
		n = tec.nextDouble();
		
		operacion = (n * 10);
		m = (Math.round(operacion))/10.0;
				
		System.out.println("El numero redondeado a un decimal es " + m );
		
			
	}
}
