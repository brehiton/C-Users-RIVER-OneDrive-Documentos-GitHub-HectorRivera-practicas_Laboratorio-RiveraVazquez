package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import edu.escuela.gamepz.utils.*;
public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
		};
		TreeSet <Personaje> arbol = new TreeSet<>();
		for (Personaje tmp : arbol) {
			arbol.add(tmp);
			System.out.println(tmp);	
		}

		LinkedList<Personaje> lista = new LinkedList<>();
		lista.addAll(arbol);
		for (Personaje l : lista ) {
		System.out.println(l);
		}

		System.out.println("----Orden Natural---");
			for (Personaje p :arbol ) {
				arbol.add(p);
			}
		System.out.println("---Orden vida---");
		Collections.sort(lista,new ByVida());
		for (Personaje p :lista ) {
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList();
		arr.addAll(lista);
		System.out.println("-----Orden Tmanio----");
		Collections.sort(arr,new BySize());
		for (Personaje p : arr ) {
			System.out.println(p);
		}
	}
}