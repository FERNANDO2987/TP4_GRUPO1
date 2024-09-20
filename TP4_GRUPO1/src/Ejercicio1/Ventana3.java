package Ejercicio1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Ventana3 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public Ventana3()
    {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(454, 400);
		setLocation(500, 250);
		setTitle("Ejercicio 3");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 31, 408, 52);
		getContentPane().add(panel);
		
		JLabel lblElijeElSistema = new JLabel("Elije el sistema operativo");
		panel.add(lblElijeElSistema);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		panel.add(rdbtnLinux);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		panel.add(rdbtnWindows);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnLinux);
		group.add(rdbtnMac);
		group.add(rdbtnWindows);
	  
    } 
}
