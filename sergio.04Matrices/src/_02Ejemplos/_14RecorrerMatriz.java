package _02Ejemplos;

public class _14RecorrerMatriz {

	public static void main(String[] args) {
		int[][] m = { { 2, 4, 6, 8 }, { 1, 3, 5, 7 }, { 1, 2, 3, 4 } };
		System.out.println("_________________");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("| " + m[i][j] +" ");
				
			}
			System.out.print("|");
			System.out.println();
			System.out.println("_________________");
		}
		System.out.println("------------------");
		
		//COLUMNA A COLUMNA
		
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				System.out.print(m[i][j] +" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
