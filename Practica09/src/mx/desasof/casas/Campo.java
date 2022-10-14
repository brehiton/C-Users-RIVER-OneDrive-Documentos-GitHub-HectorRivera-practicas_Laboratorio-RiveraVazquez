package mx.desasof.casas;
public class Campo extends Casas{
	public float piscina;

	
	float[] piscina = new float[1];
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
	public Campo(String tipo,float ancho, float largo){
		super(tipo, 2, 2000000);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
	public int hashCode(){
		return (int)super.hashCode() * piscina[0] * piscina[1] / 5;
	}
	public boolean equals(Object n){
		if (super.equals(n) && n instanceof Casas ){
			return true;
		}
		return false;
	}
	public String toString(){
		return super.toString()+ " "+ piscina[0]+ " "+ piscina; 
	}
}