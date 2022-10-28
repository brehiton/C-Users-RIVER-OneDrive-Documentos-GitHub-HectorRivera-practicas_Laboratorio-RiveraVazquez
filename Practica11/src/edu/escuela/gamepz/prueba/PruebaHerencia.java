package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("David", 100);
		Personaje per02 = new Personaje("Bianca");
		Planta plan01 = new Planta("Fabian", 10, 'B');
		Planta plan02 = new Planta("Almendra", 50);
		Planta plan03 = new Planta("Ricardo", 'C');
		Planta plan04 = new Planta("Silvia");
		Zombie zom01 = new Zombie("Armando", 80, false);
		Zombie zom02 = new Zombie("Joselin", true);
		Zombie zom03 = new Zombie("Eduardo");

		Personaje[] personajes = {per01,per02,plan01,plan02,plan03,plan04,zom01,zom02,zom03};
			int count = 0;
			int n = 0;
		for (Personaje tmp : personajes) {
			System.out.println(tmp.toString());
			int x = (int)(Math.random()*100);
			if(tmp instanceof Planta){
				System.out.println("Soy planta " + ((Planta)tmp).escudo());
				tmp.addVida(x);
			}

			if (tmp instanceof Zombie) {
				System.out.println("Soy zombie " + ((Zombie)tmp).ataque());
				tmp.decVida(x);
			}
			System.out.println(x);
			System.out.println(tmp.toString());
 			System.out.println("***** Objeto " + n + " *****");
 			n += 1;			
		}

	}
}