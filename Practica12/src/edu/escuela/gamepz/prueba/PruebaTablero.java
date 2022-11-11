package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.utils.*;
public class PruebaTablero{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("David", 100),
			new Zombie("Bianca"),
			new Planta("Fabian", 10, Escudo.MEDIO),
			new Planta("Almendra", 50),
			new Planta("Ricardo", Escudo.BAJO),
			new Planta("Silvia"),
			new Zombie("Armando", 80, false),
			new Zombie("Joselin", true),
			new Zombie("Eduardo")};

		for (Personaje tmp : datos ) {
			int n = (int)(Math.random()*20-5);
			try{
			Tablero.insertar(tmp,n);
			} catch (PersException pe){
				System.out.println(pe+" "+n);
			}
		}
		Tablero.mostrar();
		for (int i = 0; i < Tablero.MAX_SIZE;i++){ 
			int pos = (int)(Math.random()*20-5);
			try{
				Tablero.borrar(pos);
			} catch (PersException e){
				System.err.println(e.getMessage()+" "+e.getPos());
			}
		}
		Tablero.mostrar();
	}
}