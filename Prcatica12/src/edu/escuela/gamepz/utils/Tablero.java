package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;
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
		System.out.println("Fin *** Contenido del arreglo en el Tablero\n");

	}
	public static void insertar(Personaje p, int pos) throws PersException{
		if(pos < 0 || pos > MAX_SIZE){
			throw new PersException("Indice fuera de rango",pos);
		}
		personajes[pos] = p;

	}
	public static void borrar(int pos) throws PersException{
		if (pos < 0 || pos >MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
		}
		if (personajes == null){
			throw new PersException("Si personaje para borrar",pos);
		}
		personajes[pos] = null;
	}
}