package ex.ordinario.eval.vehiculos;
import java.util.Comparator;
public class Vehiculo implements Comparator<Vehiculo>{
	private String marca;
	private int modelo;
	private float costo;

	public Vehiculo(String marca, int modelo, float costo){
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
	}

	public String toString(){
		return marca +"\t"+ modelo +"\t"+ costo;
	}
	public String getMarca(){
		return marca;
	}
	public int getModelo(){
		return modelo;
	}
	public float getCosto(){
		return costo;
	}
	public int compare(Vehiculo v1, Vehiculo v2){
		if ((v1.marca.compareTo(v2.marca)) != 0){
			return (v1.marca.compareTo(v1.marca));
		}
		if (v1.modelo != v2.modelo){
			return (v2.modelo>v1.modelo)?(1):(-1);
		}
		return (v2.costo > v1.costo)?(1):(-1);
	}
}