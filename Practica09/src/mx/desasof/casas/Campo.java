package mx.desasof.casas;
public class Campo extends Casas{
	private float piscina;

	
	float[] piscina = new float[1];
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
	public Campo(String tipo,float ancho, float largo){
		super(tipo, 2, 2000000f);
	}
	public int hashCode(){
		return super.hashCode() * ancho * largo / 5;
	}
	public boolean equals(Object n){
		if (super.equals() ){

		}
	}
	public String toString(){
		return super.toString()
	}
}