package _02Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _13MantenimientoDeAlumnos2_V2 {

	static Scanner tec = new Scanner(System.in);
	static final int MAX_ALUMNOS = 24;

	public static void main(String[] args) {

		String[] opcionesMenu = { "1.- Añadir alumno", "2.- Eliminar alumno", "3.- Listado alumnos", "0.- Salir" };

		// Para almacenar alumnos
		ArrayList<String> alumnos = new ArrayList<>();

		int numAlumnos = alumnos.size();

		// mostar el menu y hacer lo que el usuario elija

		int opcion;

		do {
			opcion = menu(opcionesMenu);
			switch (opcion) {
			case 1:
				System.out.println("Nombre: ");
				String nombre = tec.nextLine();

				// Añadir el alumno
				if (numAlumnos == MAX_ALUMNOS) {
					System.out.println("El grupo esta lleno");
				} else {
					alumnos.add(nombre);
				}

				break;

			case 2:

				System.out.println("Alumno a eliminar: ");
				nombre = tec.nextLine();


				if (!alumnos.remove(nombre)) {
					System.out.println("No existe ese alumno");
				}
				
				//ELIMINAR TODOS LOS SERGIOS
				
				while(alumnos.remove("Sergio"))
					
					
				break;

			case 3:
				System.out.println("---------------LISTADO ALUMNOS-----------");
				
				//RECORRER EL ARRAYLIST Y MOSTRAR
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println(alumnos.get(i));
				}
				System.out.println("-----------------------------------------");
				
				
				//FOR EACH
				for (String nombreListado : alumnos) {
					System.out.println(nombreListado);
				}
			
				//ITERATOR
				Iterator<String> it = alumnos.iterator();
				while(it.hasNext()){
					String nombreListado = it.next();
					System.out.println(nombreListado);
				}
				
				
				
				break;

			}

		} while (opcion != 0);

	}

	public static int menu(String[] opciones) {
		int opcion;

		do {
			// mostrar menu
			for (int i = 0; i < opciones.length; i++) {
				System.out.println(opciones[i]);
			}
			// leer opcion
			System.out.println("--------------------");
			System.out.println("Elige opcion: ");
			opcion = tec.nextInt();
			tec.nextLine();
		} while (opcion < 0 || opcion >= opciones.length);

		return opcion;

	}

}
