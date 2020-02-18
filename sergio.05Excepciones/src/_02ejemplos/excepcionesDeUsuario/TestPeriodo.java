package _02ejemplos.excepcionesDeUsuario;

import java.util.Scanner;

import _02ejemplos.tiempo.Tiempo;

public class TestPeriodo {

	public static void main(String[] args) {
		Scanner tec= new Scanner(System.in);
		boolean ok = false;
		do{
			try{
		System.out.println("Inicio del periodo: ");
		String sInicio = tec.next();
		
		System.out.println("Fin del periodo: ");
		String sFin = tec.next();
		
		Tiempo t1 = new Tiempo(sInicio);
		Tiempo t2 = new Tiempo(sFin);

		Periodo p1 = new Periodo( t1 , t2);
		System.out.println(p1);
		ok=true;
	} catch(PeriodoIncorrectoException e){
		System.out.println(e.getMessage());
		System.out.println("Vuelve a intentarlo");
	}
	}while(!ok);

}
}