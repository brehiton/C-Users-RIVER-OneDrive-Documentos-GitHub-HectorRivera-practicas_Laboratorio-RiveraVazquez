package edu.escuela.gamepz.prueba;
import edu.escuela.gamepz.personajes.*;

public class PruebaPersonaje{
	public static void main(String[] args){
	//modificando
	Personaje per01 = new Personaje("Almendra", 200);
	Personaje per02 = new Personaje("Ricardo", 10);
	Personaje per03 = new Personaje("Bianca", 1);
	Personaje per04 = new Personaje("Leonel", -10);
	Personaje per05 = new Personaje("Hector", 500);

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

	per07.setEdad(((int)(Math.random()*1000)));
	per09.setEdad(((int)(Math.random()*1000)));
	System.out.println("- - -");

	per06.setNombre("Francisco Xavier Zepeda Flores");
	per08.setNombre("Dayana");
	per10.setNombre("Axel Fabian Eduardo David");

	System.out.println(per01.getDetalle());
	System.out.println(per02.getDetalle());
	System.out.println(per03.getDetalle());
	System.out.println(per04.getDetalle());
	System.out.println(per05.getDetalle());
	}
	
}