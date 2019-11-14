package _01pruebas;

import java.util.Scanner;

public class ValidarHora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Solicitud de datos
		System.out.println("Introduzca la hora: ");
		String texto = tec.nextLine();

		String hora, min;
		int posPuntos;
		posPuntos = texto.indexOf(':');
		int h;
		int m;

		if (texto.equals(":")) {
			System.out.println("La hora 00:00 es correcta");

		} else if (posPuntos != -1) { // TIENE ":"

			hora = texto.substring(0, posPuntos);
			min = texto.substring(posPuntos + 1);

			// COMPROBAMOS SI TIENE ALGO VACIO
			if (hora.equals("")) {
				m = Integer.parseInt(min);
				h = 0;

			} else if (min.equals("")) {
				h = Integer.parseInt(hora);
				m = 0;

			} else {
				h = Integer.parseInt(hora);
				m = Integer.parseInt(min);
			}

			// COMPROBAMOS SI LA HORA ES CORRECTA TENIENDO ":"

			if (h <= 23 & m <= 59)
				System.out.format("La hora %02d:%02d es correcta", h, m);
			else
				System.out.format("La hora %02d:%02d es incorrecta", h, m);

		} else { // HORA INCOMPLETA SIN ":"

			int th = texto.length();
			int textoInt = Integer.parseInt(texto);

			// Un caracter
			if (th == 1)
				System.out.format("La hora %02d:00 es correcta", textoInt);

			// Dos caracteres
			else if (th == 2) {

				if (textoInt <= 23) {
					System.out.format("La hora %02d:00 es correcta", textoInt);

				} else {
					h = textoInt / 10;
					m = (textoInt % 10);

					if (m <= 5) {
						m = m * 10;
						System.out.format("La hora %02d:%02d es correcta", h, m);

					} else {
						m = m * 10;
						System.out.format("La hora %02d:%02d es incorrecta", h, m);
					}
				}

				// Tres caracteres
			} else if (th == 3) {
				h = textoInt / 100;
				m = textoInt % 100;

				if (m > 59)
					System.out.format("La hora %02d:%02d es incorrecta", h, m);
				else
					System.out.format("La hora %02d:%02d es correcta", h, m);

				// Cuatro Caracteres
			} else if (th == 4) {

				h = textoInt / 100;
				m = textoInt % 100;

				if (h > 23)
					System.out.format("La hora %02d:%02d es incorrecta", h, m);
				else if (m > 59)
					System.out.format("La hora %02d:%02d es incorrecta", h, m);
				else
					System.out.format("La hora %02d:%02d es correcta", h, m);

			}

		}

	}
}
