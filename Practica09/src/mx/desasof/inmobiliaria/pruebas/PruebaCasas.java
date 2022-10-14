package mx.desasof.pruebas;
import mx.desasof.inmobiliaria.casas.*;
public class PruebaCasas{
	public static void main(String[] args) {
		Casas[] casas = new Casas[9];
		casas[0] = new Casas("Estandar", 3, 3000000);
		casas[1] = new Campo("Cazador", 3.5f, 10f);
		casas[2] = new Urbana("Residencia", 3, 2500000 ,2);
		casas[3] = new Casas("Estandar", 3, 3000000);
		casas[4] = new Campo("Cazador", 3.5f, 10);
		casas[5] = new Urbana("Residencia", 3, 2500000 ,2);
		casas[6] = new Casas("Estandar");
		casas[7] = new	Campo("Cazador", 4, 15000, 3f, 5f);
		casas[8] = new Urbana("Residencia", 5);

		int i = 0;
		while (i < Casas.length()){
			for (Casas c : casas){
				if (c == casas[i]){
					System.out.println(c+" son el mismo objeto"+casas[i]);
					System.out.println("= = = = = ");
					break;
				}
				if (c.equals(casas[i])){
					System.out.println(c+"Son iguales "+ casas[i]);
					System.out.println("e e e e e");
					break;
				}
					System.out.println(c+"Son Diferentes "+ casas[i]);
					System.out.println("! ! ! ! !");
			}// for
				i++;
		}// while
	}
}