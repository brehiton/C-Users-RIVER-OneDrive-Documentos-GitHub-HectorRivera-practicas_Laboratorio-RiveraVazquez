package ex.ordinario.eval.vehiculos;
public class Vehiculo implements Comparable<Vehiculo>{
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
	public int compareTo(Vehiculo v1){
		if ((this.marca.compareTo(v1.marca)) != 0){
			return (this.marca.compareTo(v1.marca));
		}
		if (this.modelo == modelo){
			return (this.modelo>v1.modelo)?(1):(-1);
		}
		return (this.costo > v1.costo)?(1):(-1);
	}

}