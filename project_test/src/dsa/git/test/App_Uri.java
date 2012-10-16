package dsa.git.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App_Uri {

	int id;
	public App_Uri() {
		// TODO Auto-generated constructor stub
		id = 0;
	}

	public Container crearComponentesVentana(){
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(3,1));	
		JPanel panel2=new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.add(new JLabel("Nombre:"));
		panel2.add(new JTextField(30));	
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.add(new JLabel("Apellidos:"));	
		panel3.add(new JTextField(50));	
		JPanel panel4=new JPanel();	
		panel4.add(new JButton("Insertar"));
		panel1.add(panel2);
		panel1.add(panel3);
		panel1.add(panel4);	
		return(panel1);	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App_Uri uri = new App_Uri();
		uri.id = 20;
		JFrame ventana = new JFrame("Ventana Prueba");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(uri.crearComponentesVentana());
		ventana.pack();
		ventana.setVisible(true);
	}

}
