//practica03
public class Personaje{
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad = 0;
	}
	public int getEdad(){
		return edad;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO" + nombre);
	}
	public boolean setEdad(int years){
		boolean result = false;
		//valido 1 a 120
		if (years > 0 && years <121 ){
			edad = years;
			result = true;
		}
}