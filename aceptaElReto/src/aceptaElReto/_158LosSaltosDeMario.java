package aceptaElReto;

import java.util.Scanner;

public class _158LosSaltosDeMario {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int cont = tec.nextInt();
		for (int i = 0; cont > i; i++) {
			
			int cont2 = tec.nextInt() -1;
			int arriba=0;
			int abajo=0;
			int num;
			int num2;
			num = tec.nextInt();
			
			for (int x = 0; x<cont2; x++) {
				num2 = tec.nextInt();
				if (num>num2){
					abajo++;
					num= num2;
				}else if (num<num2){
					arriba++;
					num= num2;

				}
				
			}
			System.out.println(arriba);
			System.out.println(abajo);
			
		}

	}

}
