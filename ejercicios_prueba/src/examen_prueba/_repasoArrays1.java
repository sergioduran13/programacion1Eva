package examen_prueba;

public class _repasoArrays1 {
	
	public static int calcularDesnivelPositivo(int[] altitud){
		
		int resultado = 0;
		for (int i = 0; i < (altitud.length -1) ; i++) {
			if(altitud[i] < altitud[i+1]){
				resultado = resultado + (altitud[i+1] - altitud[i]);
			}
			
		}	

		return resultado;
	}

	public static boolean hayDescensosPeligrosos(int[] altitud){
		boolean descensoPeligroso = false;
		for (int i = 0; i < (altitud.length-1) && !descensoPeligroso; i++) {
			if((altitud[i]-altitud[i+1])>=60)
				descensoPeligroso = true;
			}
		
		
		return descensoPeligroso;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] altitud = {90, 110, 110, 220, 210, 140, 140, 110, 150, 200, 170, 180, 130, 150, 110, 170, 150, 160, 120, 130, 170, 90};

		int resultado = calcularDesnivelPositivo(altitud);
				
		
		System.out.println(resultado);
		System.out.println(hayDescensosPeligrosos(altitud));
		
		
	}

}
