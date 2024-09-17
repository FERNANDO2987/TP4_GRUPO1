package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ventana1 extends JFrame{

    private static final long serialVersionUID = 1L;
    private JTextField TxtNombre;
    private JTextField TxtApellido;
    private JTextField TxtTelefono;
    private JTextField TxtFechaNacimiento;
    private String datos;

    public Ventana1()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocation(500, 250);
        setTitle("Ejercicio 1");
        getContentPane().setLayout(null);
        
        TxtNombre = new JTextField();
        TxtNombre.setBounds(189, 47, 116, 22);
        getContentPane().add(TxtNombre);
        TxtNombre.setColumns(10);
        
        TxtApellido = new JTextField();
        TxtApellido.setBounds(189, 87, 116, 22);
        getContentPane().add(TxtApellido);
        TxtApellido.setColumns(10);
        
        TxtTelefono = new JTextField();
        TxtTelefono.setBounds(189, 127, 116, 22);
        getContentPane().add(TxtTelefono);
        TxtTelefono.setColumns(10);
        
        TxtFechaNacimiento = new JTextField();
        TxtFechaNacimiento.setBounds(189, 166, 116, 22);
        getContentPane().add(TxtFechaNacimiento);
        TxtFechaNacimiento.setColumns(10);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(63, 50, 56, 16);
        getContentPane().add(lblNombre);
        
        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(63, 90, 56, 16);
        getContentPane().add(lblApellido);
        
        JLabel lblTelefono = new JLabel("Tel\u00E9fono");
        lblTelefono.setBounds(63, 130, 56, 16);
        getContentPane().add(lblTelefono);
        
        JLabel lblFecha = new JLabel("Fecha Nac.");
        lblFecha.setBounds(63, 169, 72, 16);
        getContentPane().add(lblFecha);
        
        JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
        lblLosDatosIngresados.setBounds(29, 266, 179, 16);
        getContentPane().add(lblLosDatosIngresados);
        
        JLabel label = new JLabel("");
        label.setBounds(39, 295, 286, 45);
        getContentPane().add(label);
        
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(258, 219, 97, 25);
        getContentPane().add(btnMostrar);
        
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                datos = TxtNombre.getText() + " " + TxtApellido.getText() + " " + TxtTelefono.getText() + " " + TxtFechaNacimiento.getText();
                label.setText(datos);
            }
        });
    }
}


