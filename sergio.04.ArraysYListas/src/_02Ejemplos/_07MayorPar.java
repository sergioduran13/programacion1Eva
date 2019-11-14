package _02Ejemplos;

public class _07MayorPar {
	public static void main(String[] args) {
		int[] edad = { 2, 3, 4, 1, 5, 4, 7, 3, 2, 7, 12 };
		int mayor=0;
		boolean hayMayor = false;
		
		for (int i = 0; i < edad.length && !hayMayor; i++) {
			if(edad[i]>=18){
				mayor = edad[i];
				hayMayor=true;
			}
		}
		if(!hayMayor)
			System.out.println("No hay mayores de edad");
		else if(mayor%2==0)
			System.out.println("La edad del primer mayor es par");
		else
			System.out.println("La edad del primer mayor es impar");
			
		
		
	}

}
