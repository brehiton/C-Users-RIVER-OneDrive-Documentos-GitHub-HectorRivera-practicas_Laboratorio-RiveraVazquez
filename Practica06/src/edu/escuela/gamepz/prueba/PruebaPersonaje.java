package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.*;

public class PruebaPersonaje{
	public static void main(String[] args){
	Personaje alumno = new Personaje("Kal El",0);
	alumno.saludar();
	System.out.println("Nombre: "+ alumno.getNombre()+ "Edad: "+ alumno.getEdad());
	System.out.println("Modificando el nombre" + alumno.getNombre());
	alumno.setNombre("Michael jordan");
	alumno.saludar();
	//modificando
	Personaje per01 = new Personaje("Almendra",200);
	Personaje per02 = new Personaje("Ricardo",10);
	Personaje per03 = new Personaje("Bianca",1);
	Personaje per04 = new Personaje("Leonel",-10);
	Personaje per05 = new Personaje("Hector",500);
	System.out.println(per01.getDetalle());
	System.out.println(per02.getDetalle());
	System.out.println(per03.getDetalle());
	System.out.println(per04.getDetalle());
	System.out.println(per05.getDetalle());
	Personaje per06 = per05;
	Personaje per07 = per04;
	Personaje per08 = per03;
	Personaje per09 = per02;
	Personaje per10 = per01;

	if (!alumno.setEdad(30)){
		System.out.println("Edad sin cambios");
		}
		System.out.println("Nombre: "+ alumno.getNombre()+ "Edad:"+ alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if (!alumno.setEdad(130)){
		System.out.println("Edad sin cambio");
		}
		System.out.println("Nombre:"+ alumno.getNombre()+"Edad:"+ alumno.getEdad());
	}
}