public class Casas{
	private String tipo;
	private int hab;
	private float costo;

	public Casas(String tipo, int hab, float costo){
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	}
	public Casas(String tipo, int hab){
		this(tipo, 2, 2000000f);
	}

	public int hashCode(){
		return tipo.hashCode() * hab * 2000000f;
	}
	public boolean equals(Object o){
		Casas c = (Casas)o;
		if (tipo.equals(tipo) && costo == costo){

		}
		return true;
	}
	public String toString(){
		return tipo + "\t" + hab + "\t" + costo;
	}
	

}