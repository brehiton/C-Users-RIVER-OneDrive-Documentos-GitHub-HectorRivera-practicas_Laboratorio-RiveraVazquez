package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
public class Letra implements Runnable{
	private char letra;
	private JLabel etq;
	public Letra(JLabel etq, char letra){
		this.etq = etq;
		this.letra = letra;
	}
	public void run(){
		String cadena = etq.getText();

		for (int i = 0; i<= 50 ;i++ ) {
			cadena.charAt(0);
			etq.setText(etq.getText() + cadena);
			int rand = (int)(Math.random()*1000);
			try{
				Thread.sleep(rand);
			}catch(InterruptedException ie){

			}
		}
		etq.setText(cadena+"Finalizado");
	}
}