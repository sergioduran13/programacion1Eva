package _03ejercicios;

import java.util.Arrays;

public class _09Tocayos {
	public static void main(String[] args) {

		String[] lista1 = { "miguel", "josé", "ana", "maría" };
		String[] lista2 = { "ana", "josé", "luján", "juan", "josé", "pepa", "ángela", "sofía", "andrés", "bartolo" };

		boolean tocayo = false;
		int total = 0;
		for (int i = 0; i < lista1.length; i++) {
			for (int j = 0; j < lista2.length && !tocayo; j++) {
				if (lista1[i].equals(lista2[j])) {
					tocayo = true;
					System.out.println(lista1[i] + " tiene tocayo en el segundo grupo.");
					total++;
				}
			}
			tocayo = false;
		}
		System.out.println("TOTAL: " + total + " personas del primer grupo tienen tocayo");
	}
}
