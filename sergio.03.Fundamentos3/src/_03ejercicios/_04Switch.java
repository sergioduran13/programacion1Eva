package _03ejercicios;

import java.util.Scanner;

public class _04Switch {

	public static String nombreMes(int mes) {
		String nombre = "";

		switch (mes) {
		case 1:
			nombre = "Enero";
			break;
		case 2:
			nombre = "Febrero";
			break;
		case 3:
			nombre = "Marzo";
			break;
		case 4:
			nombre = "Abril";
			break;
		case 5:
			nombre = "Mayo";
			break;
		case 6:
			nombre = "Junio";
			break;
		case 7:
			nombre = "Julio";
			break;
		case 8:
			nombre = "Agosto";
			break;
		case 9:
			nombre = "Septiembre";
			break;
		case 10:
			nombre = "Octubre";
			break;
		case 11:
			nombre = "Noviembre";
			break;
		case 12:
			nombre = "Diciembre";
			break;
		}

		return nombre;

	}

	public static String estacionDelAnyo(int mes) {
		String nombre = "";
		switch (mes) {
		case 1:
		case 2:
		case 3:
			nombre = "Invierno";
			break;
		case 4:
		case 5:
		case 6:
			nombre = "Primavera";
			break;
		case 7:
		case 8:
		case 9:
			nombre = "Verano";
			break;
		case 10:
		case 11:
		case 12:
			nombre = "Invierno";
			break;
		}
		return nombre;

	}

	public static int numeroDiaSemana(String dia) {

		int num = 0;
		switch (dia) {
		case "lunes":
			num = 1;
			break;
		case "martes":
			num = 2;
			break;
		case "miercoles":
			num = 3;
			break;
		case "jueves":
			num = 4;
			break;
		case "viernes":
			num = 5;
			break;
		case "sabado":
			num = 6;
			break;
		case "domingo":
			num = 7;
			break;
		}

		return num;
	}

	public static String nombreDiaSemana(int dia) {

		String nombre;
		switch (dia) {
		case 1:
			nombre = "Lunes";
			break;
		case 2:
			nombre = "Martes";
			break;
		case 3:
			nombre = "Miercoles";
			break;
		case 4:
			nombre = "Jueves";
			break;
		case 5:
			nombre = "Viernes";
			break;
		case 6:
			nombre = "Sabado";
			break;
		default:
			nombre = "Domingo";
			break;
		}
		return nombre;

	}

	public static int diasDelMes(int mes, int anyo) {

		int dias;
		switch (mes) {
		case 1:
			dias = 31;
			break;
		case 2:
			dias = 28;
			break;
		case 3:
			dias = 31;
			break;
		case 4:
			dias = 30;
			break;
		case 5:
			dias = 31;
			break;
		case 6:
			dias = 30;
			break;
		case 7:
			dias = 31;
			break;
		case 8:
			dias = 31;
			break;
		case 9:
			dias = 30;
			break;
		case 10:
			dias = 31;
			break;
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;
			break;
		}


		if (mes == 2){
			boolean bisiesto = anyo % 400 == 0 || anyo % 100 != 0 && anyo % 4 == 0;
			if (bisiesto)
			dias++;
		}
		return dias;

	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce un numero mes: ");
		int mes = tec.nextInt();
		String nombreMes = nombreMes(mes);
		String estacion = estacionDelAnyo(mes);
		System.out.println(nombreMes);
		System.out.println(estacion);
		tec.nextLine();
		System.out.println("-------------------");

		System.out.println("Escribe día de la semana: ");
		String semana = tec.nextLine().toLowerCase();
		int nombre = numeroDiaSemana(semana);
		System.out.println(nombre);
		System.out.println("-------------------");


		System.out.println("Introduce un dia de la semana: ");
		int dia = tec.nextInt();
		String diaE = nombreDiaSemana(dia);
		System.out.println(diaE);
		System.out.println("------------------");

		System.out.println("Introduce mes y año: ");
		dia = tec.nextInt();
		int anyo = tec.nextInt();
		int diaM = diasDelMes(dia, anyo);
		System.out.println("Ese mes tiene: " + diaM + " días.");

	}

}
