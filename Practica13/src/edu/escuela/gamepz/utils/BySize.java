package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
import java.util.Comparator;
public abstract class BySize implements Comparator<Personaje>{
	
	public int compareTo(Personaje p1, Personaje p2){
		if (p1.getSize() != p2.getSize()){
			return (p1.getSize()<p2.getSize()) ? -1 : 1; 
		}
		if (p1.getNombre() != p2.getNombre() ){
			return (p1.getNombre().compareTo(p2.getNombre()));
		}
		return (p2.getVida()>p1.getVida()) ? -1 : 1;
	}
	
}