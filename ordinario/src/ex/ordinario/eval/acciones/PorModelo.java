package ex.ordinario.eval.acciones;
import java.util.Comparator;
import ex.ordinario.eval.vehiculos.*;

public class PorModelo implements Comparator<Vehiculo>{
	public int compare(Vehiculo v1, Vehiculo v2){
		if (v1.getModelo() != v2.getModelo()){
			return (v2.getModelo()>v1.getModelo())?(1):(-1);
		}
		if (v1.getMarca().compareTo(v2.getMarca()) != 0){
			return (v1.getMarca().compareTo(v2.getMarca()));
		}
		return (v2.getCosto()>v1.getCosto())?(1):(-1);
	}
}