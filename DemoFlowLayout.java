import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants; 
import javax.swing.JFrame;

public class DemoFlowLayout {
	private JButton botonEnviar;
	private JTextField caja_txt;
	private JLabel etiqueta;

	public void buildWindow(){
		//Creación de la ventana
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		//Inserción de los componentes
		botonEnviar = new JButton("Enviar");
		caja_txt = new JTextField(12);
		etiqueta = new JLabel("Ingrese su nombre");

		

}
