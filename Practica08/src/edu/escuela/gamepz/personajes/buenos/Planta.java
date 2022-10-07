package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
public class Planta extends Personaje{
	private char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}

	public Planta(String nombre, char escudo){
		this(nombre, 3, escudo );
	}

	public Planta(String nombre, int vida){
		this(nombre, vida, 'A' );
	}

	public Planta(String nombre){
		this(nombre, 3, 'A');
	}

	public char escudo(){
		return escudo;
	}

	public String getDetalle(){
		super.getDetalle(); 
	}

	public void decVida(){
		super.decVida() *= 2;
	}

	public void decVida(int resta){
		resta = (int)(Math.random()*99);
		vida -= resta;
	}
}