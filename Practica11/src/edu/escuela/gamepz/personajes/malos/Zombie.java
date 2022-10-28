package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;
public class Zombie extends Personaje implements Muerto{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}

	public Zombie(String nombre, boolean ataque){
		this(nombre, 3, ataque);
	}

	public Zombie(String nombre){
		this(nombre, 3, false);
	}

	public boolean ataque(){
		return ataque;
	}
	public String toString(){
		return this.toString() + ataque;
	}
	public void decVida(){
		decVida();
	}
	public void decVida(int vida){
		decVida(vida);
		if (ataque == false){
			vida *= 3;
		}else{
			vida *=2;
		}
	}

	public void addVida(){
		addVida();
	}
	public void addVida(int vida){
		addVida(vida);
		if (ataque == true){
			vida *=2;
		}
	}
	public void comer(){
		System.out.println("Come cerebros");
	}

}