package _03Ejercicios;

public class _15Notas {

	public static void main(String[] args) {

		int[][] notas = { 
				{ 0, 3, 2, 4, 0 }, 
				{ 2, 3, 4, 2, 2 }, 
				{ 8, 8, 8, 8, 0 }, 
				{ 6, 5, 5, 6, 0 }, 
				{ 1, 3, 2, 5, 0 },
				{ 8, 9, 9, 8, 0 }

		};
		
		String[] alumnos = {"Luis", "Pablo", "Rosa","Ana", "Raul", "Pepe"};
		String[] asignat = {"ED", "PRO", "BD" , "FOL", "SI"};
		imprimirPorAlumno(notas, asignat, alumnos);
		// imprimirPorAsignatura(notas, asignat, alumnos);
		//imprimirMediaAlumno(notas, alumnos);
		//imprimirMediaAsignatura(notas, asignat);
		// System.out.println();
		//imprimirAsignaturaFacil(notas, asignat);
		//imprimirTodoSuspendidoAlumno(notas);
		//imprimirTodoSuspendidoAsignatura(notas);
	}

	public static void imprimirPorAlumno(int[][] notas , String[] asignat , String[] alumnos) {

		System.out.println("Notas por alumno: ");
		System.out.println("=================");

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + alumnos[i] + ":");
			for (int j = 0; j < notas[0].length; j++) {
				//System.out.println("Asignatura " + asignat[j] + ": " + notas[i][j] + " ");
				System.out.format(" - %-3s : %2d %n", asignat[j], notas[i][j]);
			}
			System.out.println("------------");
			System.out.println();

		}

	}

	public static void imprimirPorAsignatura(int[][] notas , String[] asignat , String[] alumnos) {
		System.out.println("Notas por asignatura: ");
		System.out.println("=================");
		for (int j = 0; j < notas[0].length; j++) {
			System.out.println("Asginatura " + asignat[j] + ": ");
			for (int i = 0; i < notas.length; i++) {
				System.out.println("Alumno " + alumnos[i] + ": " + notas[i][j]);
			}
			System.out.println("------------");
			System.out.println();
		}
	}

	public static void imprimirMediaAlumno(int[][] notas, String[] alumnos) {
		for (int i = 0; i < notas.length; i++) {
			double media = 0;

			for (int j = 0; j < notas[0].length; j++) {
				media = media + notas[i][j];

			}
			media = media / (notas[0].length * 1.0);
			System.out.println("Media alumno " + alumnos[i] + ": " + media);
		}
	}

	public static void imprimirMediaAsignatura(int[][] notas, String[]asignat) {

		for (int j = 0; j < notas[0].length; j++) {
			double media = 0;
			for (int i = 0; i < notas.length; i++) {
				media = media + notas[i][j];

			}
			media = media / (notas.length * 1.0);
			System.out.println("Media asignatura " + asignat[j] + ": " + media);
		}

	}

	public static void imprimirAsignaturaFacil(int[][] notas, String[] asignat ) {
		double asignaturaFacil = 0;
		String asignatura = "";
		for (int j = 0; j < notas[0].length; j++) {
			double media = 0;

			for (int i = 0; i < notas.length; i++) {
				media = media + notas[i][j];

			}
			media = media / (notas.length * 1.0);
			if (media > asignaturaFacil) {
				asignaturaFacil = media;
				asignatura = asignat[j];
			}

		}
		System.out.println("Asignatura más facil: " + asignatura);

	}

	public static void imprimirTodoSuspendidoAlumno(int[][] notas) {

		boolean encontrado = false;
		boolean suspendido = false;
		int contador = 0;

		for (int i = 0; i < notas.length && !encontrado; i++) {

			for (int j = 0; j < notas[0].length && !suspendido; j++) {
				if (notas[i][j] >= 5) {
					suspendido = true;
					contador = 0;
				} else {
					contador++;
				}
				if (contador == notas[0].length) {
					encontrado = true;

				}
			}
			suspendido = false;

		}
		if (encontrado) {
			System.out.println("SI,");
		} else {
			System.out.println("NO");
		}
	}

	public static void imprimirTodoSuspendidoAsignatura(int[][] notas) {
		
		boolean encontrado = false;
		boolean suspendido = false;
		int contador = 0;

		for (int j = 0; j < notas[0].length; j++) {
			for (int i = 0; i < notas.length; i++) {

				if (notas[i][j] >= 5) {
					suspendido = true;
					contador = 0;
				} else 
					contador++;
				
				if (contador == notas[0].length) 
					encontrado = true;
				
			}
			suspendido = false;

		}
		if (encontrado) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
