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
			} catch (PersException e){
				System.out.println(e+" "+n);
			}
		}
		Tablero.borrar();
		for (i = 0; i < Tablero.MAX_SIZE;pos = (Math.random()*20-5)) 
			System.out.println(pos.borrar());
		}
		
	}
}