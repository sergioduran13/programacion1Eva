package examen_prueba;

public class _repasoArrays2 {

	public static int porPrimerElementoConCaracteristica(int v[]){
		int resultado = -1;
		int suma = 0;
		
		for (int i = 0; i < v.length && suma == 0; i++) {
			for (int j = i +1; j < v.length; j++) {
				suma= suma + v[j];
			}
			
			if(v[i] == suma){
				resultado = i;
			} else{
				suma = 0;
			}
		
		}
		
		return resultado;
		
		
	}
	
	public static void main(String[] args) {
		
		
		int[] v = {10, 20, 25, 28, 10, 5, 5, -1, 1};
		
		System.out.println(porPrimerElementoConCaracteristica(v));
		

	}

}
