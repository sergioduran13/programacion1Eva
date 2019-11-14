package _02ejemplos;

public class _02SalidaPantalla {
	public static void main (String args[]){
		//Estos textos se imprimiran en la misma lina
		System.out.print("Miguel");
		System.out.print("Luis");
		System.out.print("Ana");
		
		//Esto se imprime en lineas distintas
		System.out.println("Primera Linea");
		System.out.println("Segunda Linea");
		
		//Los textos entrecomillados aparecen tal cual los escribimos
		System.out.println("Estamos en el año 2019");
		
		//Pero se puede mostrar otra informacion
		System.out.println("El relsultado de 2 por 5 es "+(2*5));
		System.out.println ((2*5)+ " es el resultado de 2 por 5");
		
		//A veces los parentesis son necesarios
		System.out.println("el resultado de 2+5 es " + 2+5);
		System.out.println("el resultado de 2+5 es " + (2+5));

	}
}
