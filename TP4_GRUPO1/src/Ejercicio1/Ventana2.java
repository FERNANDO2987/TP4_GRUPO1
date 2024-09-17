package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

public class Ventana2 extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	
	   private JTextField nota1Field, nota2Field, nota3Field;  
	    private JComboBox<String> tpsComboBox;  
	    private JTextField promedioField, condicionField; 

	public Ventana2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocation(500, 250);
		setTitle("Ejercicio 2");
		setLayout(null);
		
	     //Notas del estudiante   
        JLabel notasLabel = new JLabel("Notas del estudiante");  
        notasLabel.setBounds(20, 20, 150, 25);  
        add(notasLabel);  
        
        JLabel nota1Label = new JLabel("Nota 1:");  
        nota1Label.setBounds(20, 60, 100, 25);  
        add(nota1Label);  
        
        nota1Field = new JTextField();  
        nota1Field.setBounds(120, 60, 100, 25);  
        add(nota1Field);  
        
        JLabel nota2Label = new JLabel("Nota 2:");  
        nota2Label.setBounds(20, 100, 100, 25);  
        add(nota2Label);  
        
        nota2Field = new JTextField();  
        nota2Field.setBounds(120, 100, 100, 25);  
        add(nota2Field);  
        
        JLabel nota3Label = new JLabel("Nota 3:");  
        nota3Label.setBounds(20, 140, 100, 25);  
        add(nota3Label);  
        
        nota3Field = new JTextField();  
        nota3Field.setBounds(120, 140, 100, 25);  
        add(nota3Field);  
        
        JLabel tpsLabel = new JLabel("TPS:");  
        tpsLabel.setBounds(20, 180, 100, 25);  
        add(tpsLabel);  
        
        String[] opcionesTP = { "Aprobado", "Desaprobado" };  
        tpsComboBox = new JComboBox<>(opcionesTP);  
        tpsComboBox.setBounds(120, 180, 100, 25);  
        add(tpsComboBox);  
        
        JButton calcularButton = new JButton("CALCULAR");  
        calcularButton.setBounds(250, 60, 100, 25);  
        calcularButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                //calcularPromedio();  
            }  
        });  
        add(calcularButton);  
        
        JButton nuevoButton = new JButton("NUEVO");  
        nuevoButton.setBounds(250, 100, 100, 25);  
       // nuevoButton.addActionListener(e -> limpiarCampos());  
        add(nuevoButton);  
        
        JButton salirButton = new JButton("SALIR");  
        salirButton.setBounds(250, 140, 100, 25);  
        salirButton.addActionListener(e -> dispose());  
        add(salirButton);  
        
        // Resultados  
        JLabel resultadosLabel = new JLabel("Notas del Estudiante");  
        resultadosLabel.setBounds(20, 220, 150, 25);  
        add(resultadosLabel);  
        
        JLabel promedioLabel = new JLabel("Promedio:");  
        promedioLabel.setBounds(20, 250, 100, 25);  
        add(promedioLabel);  
        
        promedioField = new JTextField();  
        promedioField.setBounds(120, 250, 100, 25);  
        promedioField.setEditable(false);  
        add(promedioField);  
        
        JLabel condicionLabel = new JLabel("Condición:");  
        condicionLabel.setBounds(20, 280, 100, 25);  
        add(condicionLabel);  
        
        condicionField = new JTextField();  
        condicionField.setBounds(120, 280, 100, 25);  
        condicionField.setEditable(false);  
        add(condicionField);   
    }  
	
	
	
	
	
}
