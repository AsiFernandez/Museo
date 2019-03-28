import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class EntradaGratuita extends JFrame {

	private JPanel contentPane;
	private JTextField tfTipoEntrada;
	private JTextField tfHora;
	private JTextField tfIva;
	private JTextField tfPrecioEntrada;
	private JTextField tfDireccion;
	private JTextField tfNombreMuseo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaGratuita frame = new EntradaGratuita();
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
	public EntradaGratuita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 538);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Entrada Gratuita");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTitulo.setBounds(10, 11, 466, 25);
		contentPane.add(lbTitulo);
		
		JLabel lblTipoDeEntrada = new JLabel("Tipo de Entrada: ");
		lblTipoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeEntrada.setBounds(37, 153, 145, 25);
		contentPane.add(lblTipoDeEntrada);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setBounds(233, 153, 145, 25);
		contentPane.add(tfTipoEntrada);
		tfTipoEntrada.setColumns(10);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(37, 263, 145, 25);
		contentPane.add(lbFecha);
		
		JLabel lbHora = new JLabel("Hora ");
		lbHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHora.setBounds(37, 299, 145, 25);
		contentPane.add(lbHora);
		
		tfHora = new JTextField();
		tfHora.setColumns(10);
		tfHora.setBounds(233, 302, 145, 25);
		contentPane.add(tfHora);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(37, 338, 145, 25);
		contentPane.add(lbCantidad);
		
		JSpinner spCantidad = new JSpinner();
		spCantidad.setBounds(233, 338, 145, 25);
		contentPane.add(spCantidad);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfTipoEntrada.setText("");
				
				tfHora.setText("");
				spCantidad.setValue(Integer.valueOf(0));
				SeleccionEntrada seleccionEntrada = new SeleccionEntrada();
				seleccionEntrada.setVisible(true);  
				dispose();
				
			}
		});
		btnCancelar.setBounds(10, 456, 89, 32);
		contentPane.add(btnCancelar);
				
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String tEntrada = tfTipoEntrada.getText();
			
				 
			}
		});
		btnConfirmar.setBounds(335, 456, 107, 32);
		contentPane.add(btnConfirmar);
		
		JFormattedTextField ftfFecha = new JFormattedTextField();
		ftfFecha.setBounds(233, 263, 145, 25);
		contentPane.add(ftfFecha);
		
		JLabel lbIva = new JLabel("Iva: ");
		lbIva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbIva.setBounds(37, 227, 145, 25);
		contentPane.add(lbIva);
		
		tfIva = new JTextField();
		tfIva.setColumns(10);
		tfIva.setBounds(233, 227, 145, 25);
		contentPane.add(tfIva);
		
		JLabel lbCif = new JLabel("Cif:");
		lbCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCif.setBounds(37, 374, 145, 25);
		contentPane.add(lbCif);
		
		JLabel lbPrecio = new JLabel("Precio Entrada: ");
		lbPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrecio.setBounds(37, 189, 145, 25);
		contentPane.add(lbPrecio);
		
		tfPrecioEntrada = new JTextField();
		tfPrecioEntrada.setColumns(10);
		tfPrecioEntrada.setBounds(233, 191, 145, 25);
		contentPane.add(tfPrecioEntrada);
		
		JLabel lbNumCif = new JLabel("(FALTA NUMERO CIF)");
		lbNumCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNumCif.setBounds(233, 374, 195, 25);
		contentPane.add(lbNumCif);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDireccion.setBounds(37, 117, 145, 25);
		contentPane.add(lbDireccion);
		
		tfDireccion = new JTextField();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(233, 119, 145, 25);
		contentPane.add(tfDireccion);
		
		JLabel lbNombreMuseo = new JLabel("Nombre del Museo: ");
		lbNombreMuseo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNombreMuseo.setBounds(37, 81, 157, 25);
		contentPane.add(lbNombreMuseo);
		
		tfNombreMuseo = new JTextField();
		tfNombreMuseo.setColumns(10);
		tfNombreMuseo.setBounds(233, 83, 145, 25);
		contentPane.add(tfNombreMuseo);
		
			
			
		

		
			
	}
}
