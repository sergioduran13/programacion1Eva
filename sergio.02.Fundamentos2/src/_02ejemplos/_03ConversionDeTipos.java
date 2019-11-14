package _02ejemplos;

public class _03ConversionDeTipos {

	public static void main(String[] args) {

		// En principio, cuando hago una asignacion el tipo de la variable y el
		// tipo de lo que guardo
		// tiene que ser el mismo

		int num = 3; // Es un int
		int dobleDenum = num * 2; // num*2 es un int
		double division = num / 27.0; // es un double

		// Pero tambien son validas afirmaciones en las que el tipo de la
		// derecha es compatible
		// con el de la izquierda

		int edad = 30;
		int dobleEdad = edad * 2; // mismo tipo
		double tripleEdad = edad * 3; // Tipo compatible

		// Ejemplo de incomtibilidad

		double estatura = 1.83;
		// int dobleEstatura = estatura * 2; //no es compatible

		// Cambio de tipo EXPLICITO (casting)

		double peso = 82.63;
		// int quilos = peso; Tipos incompatibles

		int quilos = (int) peso; // Cambio de tipo explicito

		System.out.println(quilos);

	}

}
