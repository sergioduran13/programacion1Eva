package _03ejercicios;

import java.util.Scanner;

public class _20Etapas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el numero de personas: ");
		int personas = tec.nextInt();

		int contador = 0;
		double edad;
		double infancia = 0;
		double pubertad = 0;
		double adolescencia = 0;
		double adultez = 0;
		double vejez = 0;
		double ancianidad = 0;
		
		double total = 0;

		while (contador<personas){
		System.out.println("Introduce la edad");
		edad = tec.nextInt();
		
		if(edad <=10)
			infancia ++;
		else if (edad>=11 & edad<=14)
			pubertad++;
		else if (edad>=15 & edad<=21)
			adolescencia++;
		else if (edad>=22 & edad <=55)
			adultez++;
		else if (edad>=56 & edad<=70)
			vejez++;
		else if (edad>=71){
			ancianidad++;
		}
		
		total = infancia + pubertad + adolescencia + adultez + vejez+ ancianidad;
		contador++;
		}
		

		
		System.out.println("Infancia: " +((infancia*100.0)/total) + "%");
		System.out.println("Pubertad: " + (pubertad*100.0)/total+ "%");
		System.out.println("Adolescencia: " +(adolescencia*100.0)/total+ "%");
		System.out.println("Adultez: " +(adultez*100.0)/total+ "%");
		System.out.println("Vejez: " +(vejez*100.0)/total+ "%");
		System.out.println("Ancianidad: " +(ancianidad*100.0)/total+ "%");


		
		
		
	}

}
