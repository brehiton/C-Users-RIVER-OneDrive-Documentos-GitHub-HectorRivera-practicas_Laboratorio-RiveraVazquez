package edu.escuela.gamepz.utils;
public enum Escudo{
	SUPER(0),
	MEDIO(1),
	BAJO(2),
	NULO(3);
	private int valor;
	private Escudo(int valor){
		this.valor = valor;
	}
}