package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class VentanaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea texto;
	private JButton boton1, boton2, boton3;
	
	public VentanaPrincipal() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 250);
		setLocation(700, 250);
		setTitle("Pantalla Principal");
		setLayout(null);
		
		texto = new JTextArea();
		texto.setText("Grupo N°1");
		texto.setBounds(30, 20, 100, 30);
		texto.setBackground(null);
		
		getContentPane().add(texto);
		
		boton1 = new JButton();
		boton1.setText("Ejercicio 1");
		boton1.setBounds(150, 70, 100, 30);
		boton1.addActionListener(new eventoBoton());
		
		getContentPane().add(boton1);
		
		boton2 = new JButton();
		boton2.setText("Ejercicio 2");
		boton2.setBounds(150, 110, 100, 30);
		boton2.addActionListener(new eventoBoton2());
		
		getContentPane().add(boton2);
		
		boton3 = new JButton();
		boton3.setText("Ejercicio 3");
		boton3.setBounds(150, 150, 100, 30);
		boton3.addActionListener(new eventoBoton3());
		
		getContentPane().add(boton3);
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(estado);
	}
}

class eventoBoton implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {

		Ventana1 e1 = new Ventana1();
		e1.setVisible(true);
		
	}
}


class eventoBoton2 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {

		Ventana2 e1 = new Ventana2();
		e1.setVisible(true);
		
	}
}

class eventoBoton3 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {

		Ventana3 e1 = new Ventana3();
		e1.setVisible(true);
		
	}
}

