package _02ejemplos.excepcionesDeUsuario;

import java.lang.reflect.Constructor;

import _02ejemplos.tiempo.Tiempo;

public class Periodo {

	private Tiempo inicio;
	private Tiempo fin;

	public Periodo(Tiempo inicio, Tiempo fin) throws PeriodoIncorrectoException{
		if(inicio.compareTo(fin) >= 0){
			throw new PeriodoIncorrectoException("El inicio tiene que ser menor al fin");
		}
		
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public String toString(){
		return inicio.toString() + " - " + fin.toString();
	}

}