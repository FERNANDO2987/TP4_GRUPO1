package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;  

public class Ventana2 extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	    private JTextField promedioField, condicionField; 
	    private JTextField nota1Field;
	    private JTextField nota2Field;
	    private JTextField nota3Field;
	    private JComboBox<String> tpsComboBox;

	public Ventana2()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400, 400);
		setLocation(500, 250);
		setTitle("Ejercicio 2");
		getContentPane().setLayout(null);
        
        String[] opcionesTP = { "Aprobado", "Desaprobado" };
        
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
        
        JPanel groupBoxTop = new JPanel();
        groupBoxTop.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        groupBoxTop.setBounds(12, 32, 228, 190);
        getContentPane().add(groupBoxTop);
        groupBoxTop.setLayout(null);
        
        JPanel groupBoxDown = new JPanel();
        groupBoxDown.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        groupBoxDown.setBounds(12, 229, 228, 93);
        getContentPane().add(groupBoxDown);
        groupBoxDown.setLayout(null);
        
        JLabel promedioLabel = new JLabel("Promedio:");
        promedioLabel.setBounds(12, 49, 100, 25);
        groupBoxDown.add(promedioLabel);
        
        promedioField = new JTextField();
        promedioField.setBounds(107, 13, 100, 25);
        groupBoxDown.add(promedioField);
        promedioField.setEditable(false);
        
        JLabel condicionLabel = new JLabel("Condición:");
        condicionLabel.setBounds(12, 13, 100, 25);
        groupBoxDown.add(condicionLabel);
        
        condicionField = new JTextField();
        condicionField.setBounds(107, 49, 100, 25);
        groupBoxDown.add(condicionField);
        condicionField.setEditable(false);
        
        JLabel label = new JLabel("Nota 1:");
        label.setBounds(12, 26, 42, 16);
        groupBoxTop.add(label);
        
        JLabel label_1 = new JLabel("Nota 2:");
        label_1.setBounds(12, 65, 58, 25);
        groupBoxTop.add(label_1);
        
        nota1Field = new JTextField();
        nota1Field.setBounds(107, 67, 100, 25);
        groupBoxTop.add(nota1Field);
        
        JLabel label_2 = new JLabel("Nota 3:");
        label_2.setBounds(12, 108, 55, 25);
        groupBoxTop.add(label_2);
        
        nota2Field = new JTextField();
        nota2Field.setBounds(107, 111, 100, 25);
        groupBoxTop.add(nota2Field);
        
        JLabel label_3 = new JLabel("TPS:");
        label_3.setBounds(12, 152, 100, 25);
        groupBoxTop.add(label_3);
        
        nota3Field = new JTextField();
        nota3Field.setBounds(105, 22, 100, 25);
        groupBoxTop.add(nota3Field);
        
        tpsComboBox = new JComboBox<>(opcionesTP);
        tpsComboBox.setBounds(107, 149, 100, 25);
        groupBoxTop.add(tpsComboBox);
        
        
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
