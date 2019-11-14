package _03ejercicios;

import java.util.Scanner;

public class _18Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int hora;
		int minuto;
		int hora12;

		System.out.println("Introduce hora: ");
		hora = tec.nextInt();
		System.out.println("Introduce minutos: ");
		minuto = tec.nextInt();

		if (minuto > 59)
			System.out.println("Has introducido mal los minutos");

		else if (hora > 24)
			System.out.println("Has introducido mal la hora");

		else if (hora > 12) {

			hora12 = (hora - 12);
			System.out.println("Las " + hora + ":" + minuto + " son las " + hora12 + ":" + minuto + " PM");

		} else if (hora == 12)
			System.out.println("Las " + hora + ":" + minuto + " son las " + hora + ":" + minuto + " PM");

		else if (hora == 0)

			System.out.println("Las " + hora + ":" + minuto + " son las " + hora + ":" + minuto + " PM");

		else
			System.out.println("Las " + hora + ":" + minuto + " son las " + hora + ":" + minuto + " AM");

	}
}
