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

public class EntradasGrupos extends JFrame {

	private JPanel contentPane;
	private JTextField tfTipoEntrada;
	private JTextField tfIva;
	private JTextField tfPrecioEntrada;
	private JTextField tfDireccion;
	private JTextField tfNombreMuseo;
	private JTextField tfFecha;
	private JTextField tfCif;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradasGrupos frame = new EntradasGrupos();
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
	public EntradasGrupos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 510);
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
		tfNombreMuseo.setText("Museo Diocesano");
		tfNombreMuseo.setColumns(10);
		tfNombreMuseo.setBounds(408, 79, 289, 25);
		contentPane.add(tfNombreMuseo);
		
		tfDireccion = new JTextField();
		tfDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tfDireccion.setText("31 de Agosto Kalea, 46, 20003 Donostia");
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(408, 115, 289, 25);
		contentPane.add(tfDireccion);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfTipoEntrada.setText("Grupos");
		tfTipoEntrada.setBounds(408, 149, 289, 25);
		contentPane.add(tfTipoEntrada);
		tfTipoEntrada.setColumns(10);
		
		tfPrecioEntrada = new JTextField();
		tfPrecioEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrecioEntrada.setText("0");
		tfPrecioEntrada.setColumns(10);
		tfPrecioEntrada.setBounds(408, 187, 289, 25);
		contentPane.add(tfPrecioEntrada);
		
		tfIva = new JTextField();
		tfIva.setHorizontalAlignment(SwingConstants.CENTER);
		tfIva.setText("0");
		tfIva.setColumns(10);
		tfIva.setBounds(408, 223, 289, 25);
		contentPane.add(tfIva);
		
		tfFecha = new JTextField();
		tfFecha.setHorizontalAlignment(SwingConstants.CENTER);
		Date now = new Date();
	    //Set date format as you want
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
	    this.tfFecha.setText(sdf.format(now));
		tfFecha.setBounds(408, 263, 289, 25);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);
		
		
		JTextField tfCantidad = new JTextField();
		tfCantidad.setBounds(408, 299, 289, 25);
		contentPane.add(tfCantidad);
			
		tfCif = new JTextField();
		tfCif.setHorizontalAlignment(SwingConstants.CENTER);
		tfCif.setText("R-2000199-F");
		tfCif.setColumns(10);
		tfCif.setBounds(408, 335, 289, 25);
		contentPane.add(tfCif);
		
		/*
		 * Todos losJlabel Que hay 
		 * 
		 */
		
		JLabel lbTitulo = new JLabel("Entrada Grupos");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTitulo.setBounds(10, 11, 466, 25);
		contentPane.add(lbTitulo);
		
		JLabel lbNombreMuseo = new JLabel("Museo Diocesano");
		lbNombreMuseo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNombreMuseo.setBounds(157, 79, 157, 25);
		contentPane.add(lbNombreMuseo);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDireccion.setBounds(157, 115, 145, 25);
		contentPane.add(lbDireccion);
		
		JLabel lbTipoDeEntrada = new JLabel("Tipo de Entrada: ");
		lbTipoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbTipoDeEntrada.setBounds(157, 151, 145, 25);
		contentPane.add(lbTipoDeEntrada);
		
		JLabel lbPrecio = new JLabel("Precio Entrada: ");
		lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrecio.setBounds(157, 187, 145, 25);
		contentPane.add(lbPrecio);
		
		JLabel lbIva = new JLabel("Iva: ");
		lbIva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbIva.setBounds(157, 225, 145, 25);
		contentPane.add(lbIva);
		
		JLabel lbFecha = new JLabel("Fecha / Hora:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(157, 261, 145, 25);
		contentPane.add(lbFecha);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(157, 301, 145, 25);
		contentPane.add(lbCantidad);
		
		JLabel lbCif = new JLabel("Cif:");
		lbCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCif.setBounds(157, 337, 145, 25);
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
			String cantidad = tfCantidad.getText();
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
		btnConfirmar.setBounds(684, 402, 122, 53);
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
		btnCancelar.setBounds(10, 402, 135, 53);
		contentPane.add(btnCancelar);	
		
	}
}