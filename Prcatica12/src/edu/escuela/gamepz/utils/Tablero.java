package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
public class Tablero{
	public static int MAX_SIZE = 10;
	public static Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(){}

	public void mostrar(){
		int count = 1;
		System.out.println("\nlinicio *** Contenido del arreglo en Tablero");
		for (Personaje tmp : personajes ) {
			if(tmp == null ){
				System.out.println(count+"---------");
			}
			else{
				System.out.println(count+" "+tmp);
			}
			count += 1;
		}

	}
}