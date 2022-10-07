public class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	}

	public Zombie(String nombre, int vida, boolean ataque){
		this(nombre, 3, ataque);
	}

	public Zombie(String nombre, int vida, boolean ataque){
		this(nombre, 3, false)
	}

	public boolean ataque(){

	}
}