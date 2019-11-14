package _03ejercicios;

import java.util.Scanner;

public class _01Circulo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double radio;
		double longitud;
		double area;
		double volumen;
				
		System.out.println("Introduce el radio: ");
	    radio = tec.nextDouble();
	    
	    longitud = (2* Math.PI) * radio;
	    area = Math.PI * Math.pow(radio, 2); //Math.pow es una elevacion.
	    
	    volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
	   
	    
	    System.out.println("La longitug es: " + longitud);
	    System.out.println("El area es: " + area);
	    System.out.println("El volumen es: " + volumen);


	    
	    
	    
	    

		
		
	}
}
