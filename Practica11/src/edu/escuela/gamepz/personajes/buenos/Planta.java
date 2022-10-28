package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;
public class Planta extends Personaje{
	private Escudo escudo;

	public Planta(String nombre, int vida, Escudo escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}

	public Planta(String nombre, Escudo escudo){
		this(nombre, 3, escudo );
	}

	public Planta(String nombre, int vida){
		this(nombre, vida, Escudo.NULO );
	}

	public Planta(String nombre){
		this(nombre, 3, Escudo.NULO);
	}

	public Escudo escudo(){
		return escudo;
	}

	public String toString(){
		return this.toString() + Escudo.NULO; 
	}

	public void decVida(){
		setVida(vida-escudo.getNivel());
	}

	public void decVida(int dec){
		setVida(vida-escudo.getNivel()*dec);
	}
	public void addVida(){
		setVida(vida-escudo.getNivel());
	}
	public void addVida(int incvida){
		setVida(vida-escudo.getNivel()*incvida);
	}
}