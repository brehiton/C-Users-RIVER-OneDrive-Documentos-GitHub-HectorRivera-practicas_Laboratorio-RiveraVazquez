package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.equipos.*;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class PruebaComputadora{
	public static void main(String[] args) {
		Computadoras c1 = new Computadoras("Hp",Tipo.SERVER, Memoria.DDR);
		Computadoras c2 = new Computadoras("Asus", Tipo.WORKSTATION, Memoria.DDR2);
		Smallfactor s3 = new Smallfactor("LG", Tipo.DESKTOP, Memoria.DDR3, true);
		Smallfactor s4 = new Smallfactor("Motorola", Tipo.LAPTOP, Memoria.DDR4, false);

		Computadoras[] compus = {c1,c2,s3,s4};
		for (Computadoras tmp : compus ) {
			System.out.println(tmp);
		}
	}
}