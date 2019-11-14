package _03ejercicios;

import java.util.Scanner;

public class _19Fechas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int dia1, mes1, anyo1, dia2, mes2, anyo2, fecha1, fecha2;

		System.out.println("Introduce fecha 1(dd,mm,año). ");
		System.out.println("Dia:");
		dia1 = tec.nextInt();
		System.out.println("Mes:");
		mes1 = tec.nextInt();
		System.out.println("Año:");
		anyo1 = tec.nextInt();

		System.out.println("Introduce fecha 2(dd,mm,año). ");
		System.out.println("Dia:");
		dia2 = tec.nextInt();
		System.out.println("Mes:");
		mes2 = tec.nextInt();
		System.out.println("Año:");
		anyo2 = tec.nextInt();

		if (anyo1 > anyo2)
			System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anyo1 + " es menor");
		else if (anyo1 < anyo2)
			System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + anyo2 + " es menor");
		else if (mes1 > mes2)
			System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anyo1 + " es menor");
		else if (mes1 < mes2)
			System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + anyo2 + " es menor");
		else if (dia1 > dia2)
			System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + anyo1 + " es menor");
		else if (dia1 < dia2)
			System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + anyo2 + " es menor");

	}

}
