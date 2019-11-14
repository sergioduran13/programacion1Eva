package _02ejemplos;

import java.util.Scanner;

public class _10LeerNotaDoWhile {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int num;
		int media = 0;
		do {
			System.out.println("Nota (0 a 10)");
			num= tec.nextInt();
			System.out.println(media);
		} while (num<0 || num>10);

	}

}
