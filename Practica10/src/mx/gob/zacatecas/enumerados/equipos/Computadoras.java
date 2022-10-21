package mx.gob.zacatecas.enumerados.equipo;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Computadoras{
	private String marca;
	private Tipo tipo;
	private Memoria memoria;

	public Computadoras(String marca, Tipo tipo, Memoria memoria){
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}

	public String toString(){
		return marca+"\t"+ tipo.getType() +"\t"+ memoria.getTipo();
	}

}