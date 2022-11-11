package edu.escuela.gamepz.utils;
import java.util.Comparator;
public abstract class BySize implements Comparator<Personaje>{
	
	public int compareTo(Personaje p1, Personaje p2){
		if (p1.getSize() =! p2.getSize()){
			return (p1.getSize()<p2.getSize()) ? -1 : 1; 
		}
		return 1;
	}
}