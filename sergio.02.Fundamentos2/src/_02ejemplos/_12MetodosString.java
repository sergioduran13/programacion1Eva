package _02ejemplos;

public class _12MetodosString {

	public static void main(String[] args) {
		String texto1 = "Miguel Lopez Garcia T";
		String texto2 = "Sergio Duran";

		//Algunos metodos clase string
		//----------------------------
		
		//Longitud de un String xxxxx.length();
		int l = texto1.length();
		System.out.println(texto1 + " tiene tamaño " + l );
		System.out.println(texto2 + " tiene tamaño " + texto2.length() );

		
		//Pasar a mayusculas y minusculas xxxxx.toUpperCase();  y xxxx.toLowerCase();
		
		System.out.println(texto1.toUpperCase());
		System.out.println(texto1.toLowerCase());

		//Averiguar que caracter en determinada posicion char xxxx = xxx.charAt(posicion);
		
		char inicial = texto1.charAt(0); //'M'
		char ultimo = texto1.charAt(11);    // 'z'
		System.out.println(inicial + " " + ultimo);
		
		ultimo = texto1.charAt(texto1.length()-1);
		System.out.println(ultimo);
		
		//Buscar un caracter dentro del String xxxxx.indexOf('a');
		
		int primeraA = texto1.indexOf('a');
		System.out.println("Primera a en posicion "+ primeraA);
		
		int primeraW = texto1.indexOf('W');
		System.out.println("Primera a en posicion "+ primeraW);
		
		//Texto contiene alguna t?
		
		if(texto1.indexOf('t') != -1)
			System.out.println(texto1 + " contiene alguna t");
		else
			System.out.println(texto1+" no contiene t");
		
		
		//texto1 contiene alguna t o T?
		
		if(texto1.toUpperCase().indexOf('T') != -1)
			System.out.println(texto1 + " contiene alguna T");
		else
			System.out.println(texto1+" no contiene T");
		
		//Buscar ultima aparacion de un caracter xxxxx.lastIndexOf(caracter);
		
		System.out.println(texto1.lastIndexOf('a'));
		
		//Buscar un texto dentro del String
		//¿En que posicion aparece "Lopez"?
		
		System.out.println(texto1.indexOf("Lopez"));
		
		//Quitar espacios de los extremos xxxx.trim()
		
		String texto3 = "   casa casa   ";
		System.out.println("-"+ texto3.trim()+"-");
		System.out.println(texto3);
		
		//Reemplazar unos caracteres por otros xxxx.replaceAll
		
		texto3 = texto3.replaceAll("a", "o");
		System.out.println(texto3);
		
		//Obtener una subcadena(un trozo) xxxxx.substring(desde posicion, hasta posicion);
		
		String texto4 = "Armando".substring(2, 6);
		System.out.println(texto4);
		
		//Desde posicion hasta el final
		System.out.println("Armando".substring(2));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
