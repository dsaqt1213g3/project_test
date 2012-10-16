package dsa.git.test;

import java.awt.Container;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App_Uri {

	int id;
	JButton b;
	JLabel l;
	public App_Uri() {
		// TODO Auto-generated constructor stub
		id = 0;
	}

	public Container crearComponentesVentana(){
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(3,1));	
		JPanel panel2=new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		l = new JLabel("Nombre:");		
		panel2.add(l);
		
		panel2.add(new JTextField(30));	
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.add(new JLabel("Apellidos:"));	
		panel3.add(new JTextField(50));	
		JPanel panel4=new JPanel();	
		
		b = new JButton("Insertar");
		ActionListener a = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==b) {
					
		            l.setText("Boton Pulsado");
		        }
			}
		};
		b.addActionListener(a);
		
		panel4.add(b);
		
		panel1.add(panel2);
		panel1.add(panel3);
		panel1.add(panel4);	
		return(panel1);	
	}
	
	public boolean action( Event evt,Object obj ) {
		if( evt.target.equals( b ) )
            l.setText("se ha pulsado el boton 1");
		
        return true;
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
		ventana.createImage(20, 20);
		ventana.setVisible(true);
	}

}
