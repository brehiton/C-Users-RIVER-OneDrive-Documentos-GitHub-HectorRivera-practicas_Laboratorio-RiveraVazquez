package mx.parc1.soft.parcial.series;

public class Serie{
	public int x;
	public int y;
	public Serie(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int genNumero(){
		int n = 0;
		n = (int)(Math.random()*x*10);
		System.out.println(n);
		return x;
	}
	
}