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
		TreeSet <Personaje> ts = new TreeSet<>();
		for (Personaje tmp : ts) {
			ts.add(tmp);
			System.out.println(tmp);	
		}

		LinkedList<Personaje> linked = new LinkedList<>();
		linked.addAll(ts);
		for (Personaje l : linked ) {
		System.out.println(l);
		}

		System.out.println("----Orden Natural---");
			for (Personaje p :arbol ) {
				System.out.println(p);
			}
		System.out.println("---Orden vida---");
		Collections.sort(lista,new ByVida());
		for (Personaje p :lista ) {
			System.out.println(p);
		}
		ArrayList arr = new ArrayList();
		arr.addAll(lista);
		System.out.println("-----Orden Tmanio----");
		Collections.sort(arr,new BySize());
		for (Personaje p : arr ) {
			System.out.println(p);
		}
	}
}