public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("David", 100);
		Personaje per02 = new Personaje("Bianca");
		Planta plan01 = new Planta("Fabian", 10, 'B');
		Planta plan02 = new Planta("Almendra", 50);
		Planta plan03 = new Planta("Ricardo", 'C');
		Planta plan04 = new Planta("Silvia");
		Zombie zom02 = new Zombie("Armando", 80, false);
		Zombie zom02 = new Zombie("Joselin", true);
		Zombie zom02 = new Zombie("Eduardo");

		Personaje[] personajes = {new Personaje("David", 100), 
								  new Personaje("Bianca"), 
								  new Planta("Fabian", 10, 'B'),
								  new Planta("Almendra", 50), 
								  new Planta("Ricardo", 'C'),
								  new Planta("Silvia"),
								  new Zombie("Armando", 80, false),
								  new Zombie("Joselin", true),
								  new Zombie("Eduardo")}
								  for (Personaje p : personajes ) {
								  	
								  }
	}
}