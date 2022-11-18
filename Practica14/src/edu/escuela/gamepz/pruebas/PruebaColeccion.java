package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Collection;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class PruebaColeccion{
	public static void main(String[] args) {
		// paso 2
		String path = System.getProperty("user.home");
		// paso 3
		Scanner s = new Scanner(System.in); 

		String fname = "";
		System.out.println("Escribe el nombre del archivo: ");
		fname = s.nextLine();

		path += s.nextLine();
		// paso 4
		File f = new File(path);
		if (f.exists()) {
			System.out.println("El archivo existe: ");
			System.exit(int);//se termina
		}
		// paso 5
		if (f.isDirectory()) {
			System.out.println("Si f es un directorio: ");
			} 
		 	return System.exit(int);// se termina

		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
		};//datos


		TreeSet<Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<>();

		for (Personaje tmp : datos ) {

			arbol.add(tmp);
			lista.add(tmp);
		}

		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p:arbol){
			System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p:lista){
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
			System.out.println(p);
		}
		
	} //main
	// paso 6
	private static void guardarDatos(File f, TreeSet arbol){

		/*try{
			FileOutputStream f = new FileOutputStream("datArbol.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			for (TreeSet tmp : f ) {
				System.out.println(tmp);
			}
			s.writeObject(d);
			s.close();
		} catch (IOException e) {
			e.printStackTrace ();
		}*/
	}// metodo1
	// paso 7
	private static void mostrarContenido(File f){
		for (String tmp: f.list() ) {
			System.out.println(tmp);
		}
	}

}//clase