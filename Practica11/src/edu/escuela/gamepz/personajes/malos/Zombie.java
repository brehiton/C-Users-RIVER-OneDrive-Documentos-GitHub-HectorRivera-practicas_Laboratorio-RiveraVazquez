package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.*;
public class Zombie extends Personaje{
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
		this.decVida();
	}
	public void decVida(int vida){
		this.decVida(vida);
		if (ataque == false){
			vida *= 3;
		}else{
			vida *=2;
		}
	}

	public void addVida(){
		this.addVida();
	}
	public void addVida(int vida){
		this.addVida(vida);
		if (ataque == true){
			vida *=2;
		}
	}

}