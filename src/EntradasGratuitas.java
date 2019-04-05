import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class EntradasGratuitas extends JFrame {

	private JPanel contentPane;
	private JTextField tfTipoEntrada;
	private JTextField tfIva;
	private JTextField tfPrecioEntrada;
	private JTextField tfDireccion;
	private JTextField tfNombreMuseo;
	private JTextField tfFecha;
	private JTextField tfCif;
	private JTextField tfCantidad;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradasGratuitas frame = new EntradasGratuitas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntradasGratuitas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 505);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*
		 * Todos Los TextField que hay
		 */
		tfNombreMuseo = new JTextField();
		tfNombreMuseo.setHorizontalAlignment(SwingConstants.CENTER);
		tfNombreMuseo.setText("D´Museoa Museo Diocesano");
		tfNombreMuseo.setColumns(10);
		tfNombreMuseo.setBounds(303, 70, 390, 25);
		contentPane.add(tfNombreMuseo);
		
		tfDireccion = new JTextField();
		tfDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tfDireccion.setText("31 de Agosto Kalea, 46, 20003 Donostia");
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(303, 106, 390, 25);
		contentPane.add(tfDireccion);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfTipoEntrada.setText("Gratis");
		tfTipoEntrada.setBounds(303, 140, 390, 25);
		contentPane.add(tfTipoEntrada);
		tfTipoEntrada.setColumns(10);
		
		tfPrecioEntrada = new JTextField();
		tfPrecioEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrecioEntrada.setText("0");
		tfPrecioEntrada.setColumns(10);
		tfPrecioEntrada.setBounds(303, 178, 390, 25);
		contentPane.add(tfPrecioEntrada);
		
		tfIva = new JTextField();
		tfIva.setHorizontalAlignment(SwingConstants.CENTER);
		tfIva.setText("0");
		tfIva.setColumns(10);
		tfIva.setBounds(303, 214, 390, 25);
		contentPane.add(tfIva);
		
		tfFecha = new JTextField();
		tfFecha.setHorizontalAlignment(SwingConstants.CENTER);
		Date now = new Date();
	    //Set date format as you want
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
	    this.tfFecha.setText(sdf.format(now));
		tfFecha.setBounds(303, 254, 390, 25);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);
			
		tfCif = new JTextField();
		tfCif.setHorizontalAlignment(SwingConstants.CENTER);
		tfCif.setText("R-2000199-F");
		tfCif.setColumns(10);
		tfCif.setBounds(303, 326, 390, 25);
		contentPane.add(tfCif);
		
		tfCantidad = new JTextField();
		tfCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		tfCantidad.setColumns(10);
		tfCantidad.setBounds(303, 290, 390, 25);
		contentPane.add(tfCantidad);
		
		/*
		 * Todos losJlabel Que hay 
		 * 
		 */
		
		JLabel lbTitulo = new JLabel("Entrada Gratuita");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTitulo.setBounds(10, 11, 466, 25);
		contentPane.add(lbTitulo);
		
		JLabel lbNombreMuseo = new JLabel("Nombre del Museo: ");
		lbNombreMuseo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNombreMuseo.setBounds(100, 68, 157, 25);
		contentPane.add(lbNombreMuseo);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDireccion.setBounds(100, 104, 145, 25);
		contentPane.add(lbDireccion);
		
		JLabel lbTipoDeEntrada = new JLabel("Tipo de Entrada: ");
		lbTipoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbTipoDeEntrada.setBounds(100, 140, 145, 25);
		contentPane.add(lbTipoDeEntrada);
		
		JLabel lbPrecio = new JLabel("Precio Entrada: ");
		lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrecio.setBounds(100, 176, 145, 25);
		contentPane.add(lbPrecio);
		
		JLabel lbIva = new JLabel("Iva: ");
		lbIva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbIva.setBounds(100, 214, 145, 25);
		contentPane.add(lbIva);
		
		JLabel lbFecha = new JLabel("Fecha / Hora:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(100, 250, 145, 25);
		contentPane.add(lbFecha);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(100, 290, 145, 25);
		contentPane.add(lbCantidad);
		
		JLabel lbCif = new JLabel("Cif:");
		lbCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCif.setBounds(100, 326, 145, 25);
		contentPane.add(lbCif);
		
		/*
		 * Botones De Aceptar Y Cancelar con sus funcionalidades
		 */
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String museo = tfNombreMuseo.getText();
			String direccion = tfDireccion.getText();
			String tEntrada = tfTipoEntrada.getText();
			Double precioEntrada = Double.parseDouble(tfPrecioEntrada.getText());
			Double iva = Double.parseDouble(tfIva.getText());
			//leer date de JTextField
			String startDate = tfFecha.getText().toString();
			//Deja de leer la fecha
			String cantidad =  tfCantidad.getText();
			String cif = tfCif.getText();
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/museo","root" , "root");			
				String query = " insert into entradas (nombreMuseo, direccion, tipo, precio, iva, fecha, cantidad, cif)"
				        + " values (?, ?, ?, ?, ?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedSt = con.prepareStatement(query);
				      preparedSt.setString (1, museo);
				      preparedSt.setString (2, direccion);
				      preparedSt.setString (3, tEntrada);
				      preparedSt.setDouble (4, precioEntrada);
				      preparedSt.setDouble (5, iva);
				      preparedSt.setString (6, startDate);
				      preparedSt.setString (7, cantidad);
				      preparedSt.setString (8, cif );

				      // execute the preparedstatement
				      preparedSt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
				 
			}
		});
		btnConfirmar.setBounds(665, 385, 145, 54);
		contentPane.add(btnConfirmar);
		//Fin boton Confirmar
		
		//Inicio boton Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionDeEntrada seleccionEntrada = new SeleccionDeEntrada();
				seleccionEntrada.setVisible(true);  
				dispose();
			}
		});
		btnCancelar.setBounds(10, 385, 145, 54);
		contentPane.add(btnCancelar);	
		
		
		
	}
}
