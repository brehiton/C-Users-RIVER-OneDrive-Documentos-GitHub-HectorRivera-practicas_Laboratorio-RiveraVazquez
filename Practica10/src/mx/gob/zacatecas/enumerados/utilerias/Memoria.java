package mx.gob.zacatecas.enumerados.utilerias;
public enum Memoria{
	DDR("memoriaRam", 1666f, 30),
	DDR2("laptop", 240f, 35),
	DDR3("laptop", 33f, 40),
	DDR4("gamer", 166f, 40);
	
	String tipo;
	int vel;
	float pines;
	private Memoria(String tipo, float pines, int vel){
		this.tipo = tipo;
		this.vel = vel;
		this.pines = pines;
	}

	public String getTipo(){
		return tipo;
	}
	public int getVel(){
		return vel;
	}
	public float getPines(){
		return pines;
	}

}