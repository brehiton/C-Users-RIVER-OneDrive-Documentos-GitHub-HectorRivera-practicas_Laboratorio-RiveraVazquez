package mx.desasof.inmobiliaria.casas;
public class Urbana extends Casas{
	private int bannos;

	public Urbana(String tipo, int hab, float costo, int bannos){
		super(tipo, hab, costo);
		this.bannos = bannos;
	}
	public Urbana(String tipo, int bannos){
		super(tipo);
		this.bannos = bannos;
	}
	public int hashCode(){
		return super.hashCode() * bannos * 23;
	}
	public boolean equals(Object ur){
		if (super.equals(ur) && ur instanceof Urbana){
			return true;
		}
		return false;
	}
	public String toString(){
		return super.toString()+ " "+ bannos; 
	}
}