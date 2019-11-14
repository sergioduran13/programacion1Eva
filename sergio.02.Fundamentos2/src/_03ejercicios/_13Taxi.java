package _03ejercicios;

import java.util.Scanner;

public class _13Taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Pedimos datos
		String t;
		int s;
		double k;
		System.out.println("Momento del trayecto: ");
		t = tec.nextLine().toLowerCase();
		System.out.println("Dia de la semana: ");
		s = tec.nextInt();
		System.out.println("KM recorridos: ");
		k = tec.nextDouble();

		// Calculamos precio km dependiendo dia y momento.
		double precio;

		if (s == 7)
			precio = k * 0.93;
		else if (t.equals("dia"))
			precio = k * 0.73;
		else
			precio = k * 0.84;
		
		
		//Precio minimo
		if (t.equals("dia") & (precio < 2.95)) {
			precio = 2.95;
			System.out.println("Coste del trayecto: " + precio + "€");

		}else if (t.equals("noche") & (precio < 4)) {
			precio = 4;
			System.out.println("Coste del trayecto: " + precio + "€");
		}else
			System.out.println("Coste del trayecto: " + precio + "€");
			
	}
}