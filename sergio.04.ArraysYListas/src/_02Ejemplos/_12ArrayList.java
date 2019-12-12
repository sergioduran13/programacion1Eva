package _02Ejemplos;

import java.util.ArrayList;

public class _12ArrayList {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<>();
		
		System.out.println(nombres.size());
		
		nombres.add("sergio");
		nombres.add("carlos");
		nombres.add("alberto");
				
		System.out.println(nombres.size());
		System.out.println(nombres);

		//insertar en una posicion
		
		nombres.add( nombres.size() -1 , "duran");
		System.out.println(nombres);
		
		//eliminar
		
		nombres.remove("asdaf");
		System.out.println(nombres.remove("asdaf"));


		
	}

}
