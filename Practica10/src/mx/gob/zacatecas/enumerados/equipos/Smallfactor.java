package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Smallfactor extends Computadoras{
	private boolean nvrm;

	public Smallfactor(String marca, Tipo tipo, Memoria memoria, boolean nvrm){
		super(marca, tipo, memoria);
		this.nvrm = nvrm;
	}
	public boolean getNvram(){
		return nvrm;
	}
}