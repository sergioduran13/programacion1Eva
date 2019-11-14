package _03ejercicios;

import java.util.Scanner;

public class _10Fuerza {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		//LEO LOS DATOS
		double masa1, masa2, dist;
		double G ;
		double F ;
		System.out.println("Escribe masa cuerpo 1 :");
		masa1 = tec.nextDouble();
		System.out.println("Escribe masa cuerpo 2 :");
		masa2 = tec.nextDouble();
		System.out.println("Escribe distancia entre ellos:");
		dist = tec.nextDouble();
		
		//HAGO OPERACIONES
		
		G = (6.693E-11);
		//Los elevado a 10^(x) se expresa con valor "E"; 1234*10^45 = 1231E45
					
		F = (G*masa1*masa2)/(dist*dist);
		
				
		//MUESTRO RESULTADOS
		
		System.out.println(F);
	}

}
