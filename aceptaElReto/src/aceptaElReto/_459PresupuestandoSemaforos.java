package aceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

public class _459PresupuestandoSemaforos {
	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		while(tec.hasNext()){
		int ancho = tec.nextInt();
		int alto = tec.nextInt();
		tec.nextLine();


		String[] texto = new String[alto];
		for (int i = 0; i < texto.length; i++) {
			texto[i]=tec.nextLine();
		}
		
		char[][] cuadricula = new char[alto][ancho];

		for (int i = 0; i < texto.length; i++) {
			for (int j = 0; j < texto[i].length(); j++) {
				char caracter = texto[i].charAt(j);
				cuadricula[i][j] = caracter;
			}
		}
		
		//
		int semaforos = 0;
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				if(cuadricula[i][j] == '#' ){
					int contador = 0;
					
					if( (i+1) < cuadricula.length && cuadricula[i+1][j] == '#')
						contador++;
					if((i-1) >= 0    && cuadricula[i-1][j] == '#'  )
						contador++;
					if((j+1) < cuadricula[i].length  && cuadricula[i][j+1] == '#' )
						contador++;
					if((j-1) >= 0  && cuadricula[i][j-1] == '#')
						contador++;
					
					
					if(contador==3){
						 semaforos = semaforos + 3;
					}else if (contador == 4){
						semaforos = semaforos + 4;
					}
				}
	
			}
		}
	
		System.out.println(semaforos);
		}
	}		
}


