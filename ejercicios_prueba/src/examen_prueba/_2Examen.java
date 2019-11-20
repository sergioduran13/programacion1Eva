package examen_prueba;

import java.util.Scanner;

public class _2Examen {

	public static double calcularImporteDatos(double megas){
		double precio = 0;
		
		if( megas < 500){
			precio = megas * 0.05;
		}else if (megas < 1500 ){
			precio = megas * 0.03;
		}else if(megas < 5000) {
			precio =megas *0.02;
		}else if(megas >5000){
			precio = megas * 0.01;
		}
		
		return precio;
		
	}
	
	public static double calcularImporteLlamadas(int minuto){
		
		double precio = 5;
		
		if(minuto > 200)
			precio = precio + (minuto - 200) * 0.07;
		
		return precio;
		
	}
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		double megas = 0;
		int minuto = 0;
		double precioMega = 0;
		double precioMinuto=0;
		
		//Pedimos datos
		System.out.println("Introduce megas consumidos: ");
		megas = tec.nextDouble();
		
		System.out.println("Introduce minutos hablados: ");
		minuto = tec.nextInt();

		//Calculamos
		precioMega = calcularImporteDatos(megas);
		precioMinuto = calcularImporteLlamadas(minuto);
		double total = precioMega + precioMinuto;
		
		//Resultados
		
		System.out.println("Coste por datos: " + precioMega);
		System.out.println("Coste por llamadas: " + precioMinuto);
		System.out.println("Total: " + total);
		System.out.println("Total IVA INCLUIDO: " + (total * 1.21));
		
	}

}
