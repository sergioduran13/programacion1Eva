package _03ejercicios;

import java.util.Scanner;

public class _06Email {
	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre de direccion de email: ");
		String dir = tec.nextLine();
		
		
		
		//Nombre usuario: 
		int a = dir.lastIndexOf("@");
		System.out.println("Nombre de usuario: " + dir.substring(0, a));
		
		//Subdominio
		int p = dir.lastIndexOf('.');
		System.out.println("Subdominio: " + dir.substring(a+1,p));
		
		//Dominio
		System.out.println("Dominio: "+ dir.substring(p+1));
		
		
			
		
		
}
}
