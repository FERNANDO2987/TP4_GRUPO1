package Ejercicio1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;   
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

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
		
		// Segundo panel para seleccionar especialidades  
        JPanel panelEspecialidad = new JPanel();  
        panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));  
        panelEspecialidad.setBounds(12, 100, 408, 120);  
        getContentPane().add(panelEspecialidad);  
        
        // Usar GridBagLayout para alinear los JCheckBox  
        panelEspecialidad.setLayout(new GridBagLayout());  
        GridBagConstraints gbc = new GridBagConstraints();  
        gbc.insets = new Insets(5, 5, 5, 5); 

        JLabel lblEligeEspecialidad = new JLabel("Elige una especialidad:");  
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.anchor = GridBagConstraints.CENTER;  
        panelEspecialidad.add(lblEligeEspecialidad, gbc);  

        JCheckBox chkProgramacion = new JCheckBox("Programación");  
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        gbc.anchor = GridBagConstraints.WEST;  
        panelEspecialidad.add(chkProgramacion, gbc);  

        JCheckBox chkAdministracion = new JCheckBox("Administración");  
        gbc.gridx = 1;  
        gbc.gridy = 2;  
        gbc.anchor = GridBagConstraints.WEST; 
        panelEspecialidad.add(chkAdministracion, gbc);  

        JCheckBox chkDisenoGrafico = new JCheckBox("Diseño Gráfico");  
        gbc.gridx = 1;  
        gbc.gridy = 3;  
        gbc.anchor = GridBagConstraints.WEST;  
        panelEspecialidad.add(chkDisenoGrafico, gbc);  

        // campo de texto para ingresar horas  
        JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");  
        lblHoras.setBounds(12, 230, 250, 25);  
        getContentPane().add(lblHoras);  

        JTextField txtHoras = new JTextField();  
        txtHoras.setBounds(250, 230, 100, 25);  
        getContentPane().add(txtHoras);  

        //Boton Aceptar  
        JButton btnAceptar = new JButton("Aceptar");  
        btnAceptar.setBounds(250, 260, 100, 25);  
        getContentPane().add(btnAceptar);  

        btnAceptar.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                String sistemaOperativo = null;  
                if (rdbtnMac.isSelected()) {  
                    sistemaOperativo = "Mac";  
                } else if (rdbtnLinux.isSelected()) {  
                    sistemaOperativo = "Linux";  
                } else if (rdbtnWindows.isSelected()) {  
                    sistemaOperativo = "Windows";  
                }  

                String especialidades = "";  
                if (chkProgramacion.isSelected()) {  
                    especialidades += "Programación ";  
                }  
                if (chkAdministracion.isSelected()) {  
                    especialidades += "Administración ";  
                }  
                if (chkDisenoGrafico.isSelected()) {  
                    especialidades += "Diseño Gráfico ";  
                }  

                String horas = txtHoras.getText();  

                String mensaje = sistemaOperativo +"-"+especialidades +"-" + horas;  

                JOptionPane.showMessageDialog(Ventana3.this, mensaje);
            }
        });
    } 
}
