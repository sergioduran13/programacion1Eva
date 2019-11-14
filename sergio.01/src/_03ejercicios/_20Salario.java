package _03ejercicios;

import java.util.Scanner;

public class _20Salario {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int hora;
		double salarioBruto;
		int extra;
		double salarioNeto;

		System.out.println("Horas trabajadas: ");
		hora = tec.nextInt();

		if (hora > 40) {
			extra = hora - 40;
			salarioBruto = ((40 * 6) + (extra * 10));
		} else {
			salarioBruto = hora * 6;
		}

		if (salarioBruto <= 350) {
			salarioNeto = salarioBruto * (0.98);

		} else {
			salarioNeto = salarioBruto * (0.9);
		}

		System.out.println("Salario neto semanal: " + salarioNeto + "€");

	}

}
