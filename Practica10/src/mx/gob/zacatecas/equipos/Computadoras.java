package mx.gob.zacatecas.equipo;
import mx.gob.zacatecas.utileria
public class Computadoras{
	private String marca;
	private Tipo tipo;
	private Memoria memoria;

	public Computadora(String marca, Tipo tipo, Memoria memoria){
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}

	public String toString(){
		return tipo +""+ vel +""+ pines + ""+ marca;
	}
}