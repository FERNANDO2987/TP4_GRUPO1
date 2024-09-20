package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;  

public class Ventana2 extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	
	   private JTextField nota1Field, nota2Field, nota3Field;  
	    private JComboBox<String> tpsComboBox;  
	    private JTextField promedioField, condicionField; 

	public Ventana2()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400, 400);
		setLocation(500, 250);
		setTitle("Ejercicio 2");
		getContentPane().setLayout(null);
        
        JLabel nota1Label = new JLabel("Nota 1:");  
        nota1Label.setBounds(20, 60, 100, 25);  
        getContentPane().add(nota1Label);  
        
        nota1Field = new JTextField();  
        nota1Field.setBounds(120, 60, 100, 25);  
        getContentPane().add(nota1Field);  
        
        JLabel nota2Label = new JLabel("Nota 2:");  
        nota2Label.setBounds(20, 100, 100, 25);  
        getContentPane().add(nota2Label);  
        
        nota2Field = new JTextField();  
        nota2Field.setBounds(120, 100, 100, 25);  
        getContentPane().add(nota2Field);  
        
        JLabel nota3Label = new JLabel("Nota 3:");  
        nota3Label.setBounds(20, 140, 100, 25);  
        getContentPane().add(nota3Label);  
        
        nota3Field = new JTextField();  
        nota3Field.setBounds(120, 140, 100, 25);  
        getContentPane().add(nota3Field);  
        
        JLabel tpsLabel = new JLabel("TPS:");  
        tpsLabel.setBounds(20, 180, 100, 25);  
        getContentPane().add(tpsLabel);  
        
        String[] opcionesTP = { "Aprobado", "Desaprobado" };
        tpsComboBox = new JComboBox<>(opcionesTP);  
        tpsComboBox.setBounds(120, 180, 100, 25);  
        getContentPane().add(tpsComboBox);  
        
        JButton calcularButton = new JButton("CALCULAR");  
        calcularButton.setBounds(250, 60, 100, 25);  
        calcularButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                calcularPromedio();  
            }  
        });  
        getContentPane().add(calcularButton);  
        
        JButton nuevoButton = new JButton("NUEVO");  
        nuevoButton.setBounds(250, 100, 100, 25);  
        nuevoButton.addActionListener(e -> limpiarCampos());  
        getContentPane().add(nuevoButton);  
        
        JButton salirButton = new JButton("SALIR");  
        salirButton.setBounds(250, 140, 100, 25);  
        salirButton.addActionListener(e -> dispose());  
        getContentPane().add(salirButton);
        
        JLabel promedioLabel = new JLabel("Promedio:");  
        promedioLabel.setBounds(20, 250, 100, 25);  
        getContentPane().add(promedioLabel);  
        
        promedioField = new JTextField();  
        promedioField.setBounds(120, 250, 100, 25);  
        promedioField.setEditable(false);  
        getContentPane().add(promedioField);  
        
        JLabel condicionLabel = new JLabel("Condición:");  
        condicionLabel.setBounds(20, 280, 100, 25);  
        getContentPane().add(condicionLabel);  
        
        condicionField = new JTextField();  
        condicionField.setBounds(120, 280, 100, 25);  
        condicionField.setEditable(false);  
        getContentPane().add(condicionField);   
        
        JPanel groupBoxTop = new JPanel();
        groupBoxTop.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        groupBoxTop.setBounds(12, 32, 228, 190);
        getContentPane().add(groupBoxTop);
        
        JPanel groupBoxDown = new JPanel();
        groupBoxDown.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        groupBoxDown.setBounds(12, 229, 228, 87);
        getContentPane().add(groupBoxDown);
    }  
	
	private void calcularPromedio() {  
        try {  
            double nota1 = Double.parseDouble(nota1Field.getText());  
            double nota2 = Double.parseDouble(nota2Field.getText());  
            double nota3 = Double.parseDouble(nota3Field.getText());  
            String tps = (String) tpsComboBox.getSelectedItem();  

            double promedio = (nota1 + nota2 + nota3) / 3;  
            String condicion;  

            if (tps.equals("Desaprobado")) {  
                condicion = "Libre";  
            } else if (nota1 < 6 || nota2 < 6 || nota3 < 6) {  
                condicion = "Libre";  
            } else if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8) {  
                condicion = "Promoción";  
            } else {  
                condicion = "Regular";  
            }  

            promedioField.setText(String.format("%.2f", promedio));  
            condicionField.setText(condicion);  
        } catch (NumberFormatException e) {  
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);  
        }  
    }  

    private void limpiarCampos() {  
        nota1Field.setText("");  
        nota2Field.setText("");  
        nota3Field.setText("");  
        promedioField.setText("");  
        condicionField.setText("");  
        tpsComboBox.setSelectedIndex(0);
    }
}
