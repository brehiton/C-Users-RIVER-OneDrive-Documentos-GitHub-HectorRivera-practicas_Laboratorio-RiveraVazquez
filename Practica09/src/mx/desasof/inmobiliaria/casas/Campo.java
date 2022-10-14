package mx.desasof.inmobiliaria.casas;
public class Campo extends Casas{
	float[] piscinas = new float[2];
	private float piscina;

	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscinas[0] = ancho;
		piscinas[1] = largo;
	}
	public Campo(String tipo, float ancho, float largo){
		super(tipo);
		piscinas[0] = ancho;
		piscinas[1] = largo;
	}
	public int hashCode(){
		return (int)(super.hashCode() * piscinas[0] * piscinas[1] / 5);
	}
	public boolean equals(Object n){
		if (super.equals(n) && n instanceof Campo ){
			return true;
		}
		return false;
	}
	public String toString(){
		return super.toString()+ " "+ piscinas[0]+ " "+ piscinas[1]; 
	}
}