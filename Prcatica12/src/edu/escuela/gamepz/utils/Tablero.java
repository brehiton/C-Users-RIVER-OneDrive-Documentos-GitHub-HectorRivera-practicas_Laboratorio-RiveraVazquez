package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
public class Tablero{
	public static int MAX_SIZE = 10;
	 Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(){}

	public void mostrar(){
		System.out.println("\nlinicio *** Contenido del arreglo en Tablero");
		for (Personaje tmp : personajes ) {
			System.out.println(tmp.Escudo.NULO+" ");
		}

	}
}