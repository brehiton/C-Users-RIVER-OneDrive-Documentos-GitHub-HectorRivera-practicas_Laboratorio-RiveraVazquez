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
		this(tipo, 2, 2000000);
	}

	public int hashCode(){
		return tipo.hashCode() * hab * costo;
	}
	public boolean equals(Object o){
		return result false;
		if (tipo == costo)
	}
	public String toString(){
		
	}
	

}