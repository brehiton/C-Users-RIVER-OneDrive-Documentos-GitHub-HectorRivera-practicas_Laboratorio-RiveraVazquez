package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
import java.util.Comparator;
public abstract class ByVida implements Comparator<Personaje>{
	
	public int compareTo(Personaje b1, Personaje b2){
		if (b2.getVida() != b1.getVida()){
			return (b1.getVida()>b2.getVida()) ? -1 : 1;
		}
		if (b1.getNombre() != b2.getNombre() ){
			return (b1.getNombre().compareTo(b2.getNombre()));
		}
		return (b2.getSize()<b1.getSize()) ? -1 : 1 ;	
	}
}