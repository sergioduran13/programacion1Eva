package _02ejemplos;

public class _99Horas {

	public static void main(String[] args) {

		int minuto = 0;
		int hora = 0;

		while (minuto < 59 & hora <= 23) {

			while (minuto <= 59) {
				System.out.format("%02d:%02d %n", hora, minuto);
				minuto++;
			}
			
			minuto = 0;
			hora = hora + 1;
		}
	}

}

