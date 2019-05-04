package Calculadora;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcularIva extends JFrame implements ActionListener{
	private JLabel mensaje_1;
	private JLabel mensaje_2;
	private JButton boton;
	private JTextField caja_1;
	//private JTextField caja_2;
	private JComboBox iva;
	private String selectIva;
	
	

	public CalcularIva() {
		super();
		configurarVentana();
		crearComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("CalcularIva.exe");
		this.setSize(400,250);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		mensaje_1 = new JLabel();
		mensaje_1.setText("ingrese su valor");
		mensaje_1.setBounds(50,10, 150, 50);
		mensaje_1.setForeground(Color.darkGray);
		this.add(mensaje_1);
		
		mensaje_2 = new JLabel();
		mensaje_2.setText("indique el porciento de iva");
		mensaje_2.setBounds(180,10, 150, 50);
		mensaje_2.setForeground(Color.darkGray);
		this.add(mensaje_2);
		
		caja_1 = new JTextField();
		caja_1.setBounds(50,50,100,30);
		this.add(caja_1);
		
		//caja_2 = new JTextField();
		//caja_2.setBounds(180,50,150,30);
		//this.add(caja_2);
		
		boton =new JButton();
		boton.setText(" Calcular ");
		boton.setBounds(180,90, 100, 30);
		boton.addActionListener(this);
		this.add(boton);
		
		
		String[] ivaList= new String[] {"Iva","16","8"};
		JComboBox<String> iva=new JComboBox<>(ivaList);
		iva.setBounds(180,50,150,30);
		iva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectIva = iva.getItemAt(iva.getSelectedIndex());
			}
		});
		this.add(iva);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String valorA = caja_1.getText();
		//String valorB = caja_2.getText();
		try {
			float total=Float.valueOf(valorA)*(Float.valueOf(selectIva)/100);
			total=total+Float.valueOf(valorA);
			String resultado = String.valueOf(total);
			JOptionPane.showMessageDialog(this, "El valor con iva es: "+resultado);
	
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(this, "datos no validos");
		}
	}
	public static void main(String []arg) {
		CalcularIva ventana = new CalcularIva();
		ventana.setVisible(true);
		
	}
}