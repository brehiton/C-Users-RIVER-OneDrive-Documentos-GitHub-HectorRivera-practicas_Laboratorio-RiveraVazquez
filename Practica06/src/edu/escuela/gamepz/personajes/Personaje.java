package edu.escuela.gamepz.personajes;

public class Personaje{
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}
	public int getEdad(){
		return edad;
	}

	public void setNombre(String nombre, int edad){
		this.nombre = nombre;
		if (nombre.length() > 5 && nombre.length() <= 25);
		System.out.println(nombre.length());
	}

	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO" + nombre);
	}
	public boolean setEdad(int years){
		boolean result = false;
		if (years > 0 && years <121 ){
			edad = years;
			result = true;
		}
		return result;
	}
}