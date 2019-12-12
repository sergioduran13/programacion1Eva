package _03Ejercicios;

public class _16Ventas {

	public static void main(String[] args) {
		
		int[][] ventas = {
				{100, 25, 33, 89, 23, 90, 87, 6, 5, 233},
				{28, 765, 65, 77, 987, 55, 4, 66, 4, 8},
		};
		
		double[]precio = {125.2, 234.4, 453.9,125.2, 234.4, 453.9,125.2, 234.4, 453.9,0 };
		distribuidorMayorVenta(ventas);
		informeComisiones(ventas, precio);
		
	}
	
	public static void distribuidorMayorVenta(int[][]ventas){
		int sumaVendedor=0;
		int mayorVendedor = 0;
		
		for (int i = 0; i < ventas.length; i++) {
			int suma = 0;

			for (int j = 0; j < ventas[0].length; j++) {
				suma = suma + ventas[i][j];
			}
			
			if(suma > sumaVendedor){
				sumaVendedor = suma;
				mayorVendedor = i;
			}
		}
		System.out.println("Mayor vendedor es: " + (mayorVendedor+1));
		
	}
	
	public static void productoMasVendido(int[][] ventas){
		
		int mejor = -1;
		int mayorSuma = -1;
		for (int i = 0; i < ventas[0].length; i++) {
			int suma = 0;
			for (int j = 0; j < ventas.length; j++) {
				suma = suma + ventas[i][j];
			
			if(suma>mayorSuma){
				mayorSuma= suma;
				mejor = j;
			}
			}
		}
	}
	
	public static void informeComisiones(int[][]ventas, double[] precio){
		for (int i = 0; i < ventas.length; i++) {
			double haVendido = 0;
			for (int j = 0; j < ventas[0].length; j++) {
				haVendido = haVendido + ventas[i][j] * precio[j];
			}
			
			double porcentajeComision=0;
			if(haVendido > 70000){
				porcentajeComision = 8;
			} else if(haVendido > 30000){
				porcentajeComision = 5;
			}
			
			System.out.format("Distribuidor %d - Ventas: %.2f - %%Comision: %.2f -Comision: %.2f%n", i, haVendido, porcentajeComision, haVendido*porcentajeComision/100);
		}
		
	}
	
}
