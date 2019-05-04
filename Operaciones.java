package Calculadora;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operaciones extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja_1;
	private JTextField caja_2;
	public Operaciones() {
		super();
		configurarVentana();
		crearComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Operaciones.exe");
		this.setSize(500,250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		mensaje = new JLabel();
		mensaje.setText("ingrese sus valores");
		mensaje.setBounds(50,50, 150, 50);
		mensaje.setForeground(Color.BLUE);
		this.add(mensaje);
		
		caja_1 = new JTextField();
		caja_1.setBounds(50,90,100,30);
		this.add(caja_1);
		
		caja_2 = new JTextField();
		caja_2.setBounds(180,90,100,30);
		this.add(caja_2);
		
		boton =new JButton();
		boton.setText(" Adicion ");
		boton.setBounds(180,50, 100, 30);
		boton.addActionListener(this);
		this.add(boton);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String valorA = caja_1.getText();
		String valorB = caja_2.getText();
		try {
			float total=Float.valueOf(valorA)+Float.valueOf(valorB);
			String resultado = String.valueOf(total);
			JOptionPane.showMessageDialog(this, "El valor es: "+resultado);
	
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(this, "datos no validos");
		}
	}
	public static void main(String []arg) {
		Operaciones ventana = new Operaciones();
		ventana.setVisible(true);
		
	}
}