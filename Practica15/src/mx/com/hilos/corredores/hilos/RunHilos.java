import javax.swing.JLabel;
import javax.swing.JTextField;
public class RunHilos{
	public void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
		char ch1 = txt1.getText().charAt(0);
		char ch2 = txt2.getText().charAt(0);

		if(txt1.getText().length() > 0 || txt1.getText().charAt(0) == " "){
			txt1.getText() = ch1;
		} else{
			txt1 = 'E';
		}
		if(ch2 == null || ch1.length() == null){
			ch2 = 'M';
		}
		String salida1 = String.valueOf(ch1);
		String salida2 = String.valueOf(ch2);
	}
}