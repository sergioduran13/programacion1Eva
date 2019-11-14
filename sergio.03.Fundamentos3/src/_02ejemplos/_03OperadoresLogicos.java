package _02ejemplos;

public class _03OperadoresLogicos {

	public static void main(String[] args) {

		int p= 20;
		int m = 17;
		int v = 30;
		
		//Todos mayores edad
		System.out.println(p >= 18 && m >=18 && v >=18);
		
		//alguno mayor?
		System.out.println(p >= 18 || m >=18 || v >=18);

		//lo contrario de arriba
		System.out.println(p < 18 && m <18 && v < 18);
		System.out.println(!(p >= 18 || m >=18 || v >=18));
		
		//Solo uno de ellos es mayor de edad
		
		System.out.println(p >= 18 ^ m >=18 );
		System.out.println(p >=18 && p<18 || m <18 && p>=18);
		

		
	}

}
