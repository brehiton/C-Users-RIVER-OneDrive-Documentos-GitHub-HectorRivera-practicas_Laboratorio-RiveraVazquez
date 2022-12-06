package ex.ordinario.eval.acciones;
import java.util.ArrayList;
import ex.ordinario.eval.vehiculos.*;
import javax.swing.JTextField;
import javax.swing.JTextArea;
public class Procesos{
	ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
	private Procesos(){}

	private void llenaTxArea(JTextArea txContenido){
		txContenido = " ";
	}

	public void addTerrestre(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField llantas){
	}

	public void addAcuatico(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField remos){
	}


	public void sortMarca(JTextArea txContenido){
		//ordenar PorMarca
		llenaTxArea(txContenido);
	}

	public void sortModelo(JTextArea txContenido){
		//ordenar PorModelo
		llenaTxArea(txContenido);
	}

	public void sortCosto(JTextArea txContenido){
		//ordenar PorCosto
		llenaTxArea(txContenido);
	}
}