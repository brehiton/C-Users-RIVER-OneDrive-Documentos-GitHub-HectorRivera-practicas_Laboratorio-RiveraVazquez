package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;
import edu.escuela.gamepz.utils.Tablero;
import java.util.TreeSet;
import java.util.LinkedList;
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
		for (Personaje tmp : datos) {
			System.out.println(tmp);
		}
		TreeSet<Personaje> ts = new TreeSet<>();
		ts.add(datos);
		for (Personaje tmp : ts ) {
			System.out.println(tmp);
		}
		LinkedList<Personaje> linked = new LinkedList<>();
		linked.addAll(ts);
		for (Personaje tmp : linked ) {
			System.out.println(tmp);
		}
	}
}