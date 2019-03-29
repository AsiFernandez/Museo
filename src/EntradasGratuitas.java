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
	private JTextField tfHora;
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
		setBounds(100, 100, 502, 538);
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
		tfNombreMuseo.setBounds(233, 83, 243, 25);
		contentPane.add(tfNombreMuseo);
		
		tfDireccion = new JTextField();
		tfDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tfDireccion.setText("31 de Agosto Kalea, 46, 20003 Donostia");
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(233, 119, 243, 25);
		contentPane.add(tfDireccion);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfTipoEntrada.setText("Gratis");
		tfTipoEntrada.setBounds(233, 153, 243, 25);
		contentPane.add(tfTipoEntrada);
		tfTipoEntrada.setColumns(10);
		
		tfPrecioEntrada = new JTextField();
		tfPrecioEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		tfPrecioEntrada.setText("0€");
		tfPrecioEntrada.setColumns(10);
		tfPrecioEntrada.setBounds(233, 191, 243, 25);
		contentPane.add(tfPrecioEntrada);
		
		tfIva = new JTextField();
		tfIva.setHorizontalAlignment(SwingConstants.CENTER);
		tfIva.setColumns(10);
		tfIva.setBounds(233, 227, 243, 25);
		contentPane.add(tfIva);
		
		tfFecha = new JTextField();
		tfFecha.setHorizontalAlignment(SwingConstants.CENTER);
		Date now = new Date();
	    //Set date format as you want
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
	    this.tfFecha.setText(sdf.format(now));
		tfFecha.setBounds(233, 267, 243, 25);
		contentPane.add(tfFecha);
		tfFecha.setColumns(10);
		
		tfHora = new JTextField();
		tfHora.setHorizontalAlignment(SwingConstants.CENTER);
		Date now2 = new Date();
	    //Set date format as you want
	    SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss"); 
	    this.tfHora.setText(stf.format(now2));
		tfHora.setColumns(10);
		tfHora.setBounds(233, 302, 243, 25);
		contentPane.add(tfHora);
		
		JSpinner spCantidad = new JSpinner();
		spCantidad.setBounds(233, 338, 243, 25);
		contentPane.add(spCantidad);
			
		tfCif = new JTextField();
		tfCif.setHorizontalAlignment(SwingConstants.CENTER);
		tfCif.setText("R-2000199-F");
		tfCif.setColumns(10);
		tfCif.setBounds(233, 374, 243, 25);
		contentPane.add(tfCif);
		
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
		lbNombreMuseo.setBounds(37, 81, 157, 25);
		contentPane.add(lbNombreMuseo);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDireccion.setBounds(37, 117, 145, 25);
		contentPane.add(lbDireccion);
		
		JLabel lbTipoDeEntrada = new JLabel("Tipo de Entrada: ");
		lbTipoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbTipoDeEntrada.setBounds(37, 153, 145, 25);
		contentPane.add(lbTipoDeEntrada);
		
		JLabel lbPrecio = new JLabel("Precio Entrada: ");
		lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrecio.setBounds(37, 189, 145, 25);
		contentPane.add(lbPrecio);
		
		JLabel lbIva = new JLabel("Iva: ");
		lbIva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbIva.setBounds(37, 227, 145, 25);
		contentPane.add(lbIva);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(37, 263, 145, 25);
		contentPane.add(lbFecha);
		
		JLabel lbHora = new JLabel("Hora ");
		lbHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHora.setBounds(37, 299, 145, 25);
		contentPane.add(lbHora);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(37, 338, 145, 25);
		contentPane.add(lbCantidad);
		
		JLabel lbCif = new JLabel("Cif:");
		lbCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCif.setBounds(37, 374, 145, 25);
		contentPane.add(lbCif);
		
		/*
		 * Botones De Aceptar Y Cancelar con sus funcionalidades
		 */
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String tEntrada = tfTipoEntrada.getText();
			
				 
			}
		});
		btnConfirmar.setBounds(335, 456, 107, 32);
		contentPane.add(btnConfirmar);
		//Fin boton Confirmar
		
		//Inicio boton Cancelar
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spCantidad.setValue(Integer.valueOf(0));
				SeleccionDeEntrada seleccionEntrada = new SeleccionDeEntrada();
				seleccionEntrada.setVisible(true);  
				dispose();
			}
		});
		btnCancelar.setBounds(10, 456, 89, 32);
		contentPane.add(btnCancelar);	
		
	}
}
