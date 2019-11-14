package _03ejercicios;

import java.util.Scanner;

public class _26Mes {

	public static int diasDe(int mes) {

		int dia = 0;

		if (mes == 1)
			dia = 31;
		else if (mes == 2)
			dia = 28;
		else if (mes == 3)
			dia = 31;
		else if (mes == 4)
			dia = 30;
		else if (mes == 5)
			dia = 31;
		else if (mes == 6)
			dia = 30;
		else if (mes == 7)
			dia = 31;
		else if (mes == 8)
			dia = 31;
		else if (mes == 9)
			dia = 30;
		else if (mes == 10)
			dia = 31;
		else if (mes == 11)
			dia = 30;
		else if (mes == 12)
			dia = 31;
		else
			dia = 0;
		return dia;

	}

	public static int diasDe(String mes) {
		int dia = 0;
		if (mes.equals("enero"))
			dia = 31;
		else if (mes.equals("febrero"))
			dia = 28;
		else if (mes.equals("marzo"))
			dia = 31;
		else if (mes.equals("abril"))
			dia = 30;
		else if (mes.equals("mayo"))
			dia = 31;
		else if (mes.equals("junio"))
			dia = 30;
		else if (mes.equals("julio"))
			dia = 31;
		else if (mes.equals("agosto"))
			dia = 31;
		else if (mes.equals("septiembre"))
			dia = 30;
		else if (mes.equals("octubre"))
			dia = 31;
		else if (mes.equals("noviembre"))
			dia = 30;
		else if (mes.equals("diciembre"))
			dia = 31;

		return dia;

	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce numero mes: ");
		int mes = tec.nextInt();
		int mesI = diasDe(mes);
		System.out.println(mesI + " dias.");
		tec.nextLine();

		System.out.println("Escribe el nombre del mes: ");
		String mesL = tec.nextLine().toLowerCase();
		int mesS = diasDe(mesL);
		System.out.println(mesS + " dias.");

	}

}
