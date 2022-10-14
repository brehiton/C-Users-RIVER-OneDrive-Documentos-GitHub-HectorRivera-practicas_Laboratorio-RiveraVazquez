public class Urbana extends Casas{
	private int bannos;

	public Urbana(String tipo, int hab, float costo, int bannos){
		super(tipo, hab, costo);
		this.bannos = bannos;
	}
	public Urbana(String tipo, int bannos){
		this(tipo, bannos);
	}
	public int hashCode(Object ur){
		Urbana ur = (Urbana)o;
		return super.tipo.hashCode() * bannos * 23;
	}
	public boolean equals(){
		return super.equals() +  
	}
}