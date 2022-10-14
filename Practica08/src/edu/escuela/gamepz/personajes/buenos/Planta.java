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
		return super.getDetalle() + escudo; 
	}

	public void decVida(){
		if (escudo == 'A'){
			super.decVida(2);
		} else {
			super.decVida();
		}
	}

	public void decVida(int dec){
		if (escudo == 'A'){
			super.decVida(dec*2);
		}
		else {
			super.decVida();
		}
	}
	public void addVida(){
		if (escudo == 'A'){
			super.addVida();
		}
		else{
			super.decVida();
		}
	}
	public void addVida(int incvida){
		super.addVida(incvida);
		if (escudo == 'A'){
			incvida *=2;
		}
	}
}