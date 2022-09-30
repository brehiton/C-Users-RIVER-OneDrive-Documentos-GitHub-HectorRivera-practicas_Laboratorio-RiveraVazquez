package mx.parc1.soft.parcial.series;

public class Serie{
	public int primos;
	public int primos2;
	public Serie(int primos){
		this.primos = primos;
	}
	public int getPrimos(){
		return primos;
	}
	public boolean primos(int numeros){
		boolean resultado = false;
		if (numeros > 0 && numeros < 100){
			primos = numeros;
		}
		return resultado;

	}
	public int genNumero(){
		return primos2;
	}
}