package mx.parc1.soft.parcial.series;

public class Serie{
	public int primos;
	public Serie(int primos){
		this.primos = primos;
	}
	
	public boolean getPrimos(int numeros){
		boolean result = false;
		if (numeros > 0 && numeros <100){
			primos = numeros; 
			result = true;
		}
		return result;
	}
	public int genNumero(){
		
	}
}