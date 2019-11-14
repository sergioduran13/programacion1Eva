package _03ejercicios;

import java.util.Scanner;

public class _09Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int seg;
		int dia;
		int hora;
		int minuto;
		int segrest;

		System.out.println("Introduce una cantidad de segundos: ");
		seg = tec.nextInt();

		dia = seg / 86400;
		hora = (seg % 86400) / 3600;
		minuto = (seg % 3600) / 60;
		segrest = (seg % 60);

		System.out.println(seg + " segundos son: ");
		System.out.println(dia + " dias");
		System.out.println(hora + " horas");
		System.out.println(minuto + " minutos");
		System.out.println(segrest + " segundos");

	}

}
