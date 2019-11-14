package _02Ejemplos;

public class _04ValorVsReferencia {

	public static void duplicar(int n){
	n = n * 2;
	}
	
	public static void triplicar(int[]n){
		n[0] = n[0] * 3;
		n[1] = n[1] * 3;
		n[2] = n[2] * 3;

		
	}
	
	public static void main(String[] args) {
		int a = 1;
		System.out.println("Antes de duplicar: "+ a);
		
		duplicar(a);
		System.out.println("Despues de duplicar: " + a );
		System.out.println("--------------------");
		
		int[]b = {1,1,1,};
		System.out.println("Antes de triplicar: "+ b[0] + ","+b[1] + ","+b[2] + ",");
		triplicar(b);
		System.out.println("Despues de triplicar: "+ b[0] + ","+b[1] + ","+b[2] + ",");
	}

}
