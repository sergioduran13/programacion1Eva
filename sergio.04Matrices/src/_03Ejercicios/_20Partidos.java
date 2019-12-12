package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _20Partidos {

	public static void main(String[] args) {

		// Equipos de liga de futbol
		String[] equipos = { "1dam", "2dam", "1smr", "2smr", "1vdj", "2vdj" };

		// Partidos disputados { local, visitante}
		String[][] partidos = { 
				{ "1dam", "1smr" }, 
				{ "2dam", "1smr" }, 
				{ "1smr", "2smr" }, 
				{ "2smr", "1smr" },
				{ "1dam", "2smr" }, 
				{ "2dam", "2smr" },

		};
		ArrayList<String> local = new ArrayList<>();
		ArrayList<String> visitante = new ArrayList<>();

		for (int i = 0; i < partidos.length; i++) {
				local.add(partidos[i][0]);
			
				visitante.add(partidos[i][1]);
		}

		// Mostrar que equipos no han jugado todavia en casa
		System.out.println("LOCALES: ");

		for (int i = 0; i < equipos.length; i++) {
			if (!local.contains(equipos[i])) {
				System.out.println(equipos[i]);
			}
		}
System.out.println("------------------------");
		// Mostrar que equipos no han jugado todavia fuera
		System.out.println("VISITANTES:");

		for (int i = 0; i < equipos.length; i++) {
			if (!visitante.contains(equipos[i])) {
				System.out.println(equipos[i]);
			}
		}

		//MOSTRAR QUE PARTIDOS FALTAN POR JUGAR
		System.out.println("----------------");
		System.out.println("***PARTIDOS QUE FALTAN***");
		
		ArrayList<String> partidosJugados = new ArrayList<>();
		for (int i = 0; i < partidos.length; i++) {
			partidosJugados.add("");
		}
		
		
	}

}
