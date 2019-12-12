package _02Ejemplos;

import java.util.Scanner;

public class _11MantenimientoDeAlumnos {

	static Scanner tec = new Scanner(System.in);
	static final int MAX_ALUMNOS = 24;
	
	public static void main(String[] args) {
		
		String[] opcionesMenu = {"1.- Añadir alumno", 
								"2.- Eliminar alumno",
								"3.- Listado alumnos",
								"0.- Salir"};
		
		//Para almacenar alumnos
		String[] alumnos = new String[MAX_ALUMNOS];
		int numAlumnos= 0;
		
		
		
		//mostar el menu y hacer lo que el usuario elija
			
		int opcion;
		
		do {
			opcion = menu(opcionesMenu);
			switch (opcion) {
			case 1:  
				System.out.println("Nombre: ");
				String nombre = tec.nextLine();
				
				//Añadir el alumno
				if(numAlumnos == MAX_ALUMNOS  ){
					System.out.println("El grupo esta lleno");
				}else{
					//Lo añadimos al final
					alumnos[numAlumnos] = nombre;
					numAlumnos++;				
				}
				
				break;
				
				
			case 2:
				
				System.out.println("Alumno a eliminar: ");
				 nombre = tec.nextLine();
				int posAlumno = 0;
				boolean encontrado = false;
				for (int i = 0; i < numAlumnos && !encontrado; i++) {
					if(alumnos[i].equals(nombre)){
						encontrado= true;
						posAlumno = i;
					}
				}
					
					//si lo hemos encontrado lo eliminamos
					//si no encontrado, mensaje de error.
					if(encontrado){
						for (int i = posAlumno; i < numAlumnos - 1 ; i++) {
							alumnos[i] = alumnos[i+1];
						}
						
						numAlumnos--;

						
					}else{
						System.out.println("El alumno no existe");
					}
					
				break;
				

			case 3:
				System.out.println("---------------LISTADO ALUMNOS-----------");
				for (int i = 0; i < numAlumnos; i++) {
					System.out.println(alumnos[i]);
				}
				System.out.println("-----------------------------------------");

				break;
				
			}
			
		} while (opcion!=0);
				
		
		
		}
	
	
	public static int menu( String [] opciones){
		int opcion;
		
		do{
			//mostrar menu
			for (int i = 0; i < opciones.length; i++) {
				System.out.println(opciones[i]);
			}
			//leer opcion
			System.out.println("--------------------");
			System.out.println("Elige opcion: ");
			opcion = tec.nextInt(); tec.nextLine();
		}while (opcion<0 || opcion >= opciones.length);
		
		return opcion;
		
	}
	
}
