import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntradaNormal extends JFrame {

	private JPanel contentPane;
	private JTextField tfTipoEntrada;
	private JTextField tfHora;
	private JTextField tfIva;
	private JTextField tfPrecioEntrada;
	private JTextField tfDireccion;
	private JTextField tfNombreMuseo;
	private JTextField tfFecha;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaNormal frame = new EntradaNormal();
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
	public EntradaNormal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTipoEntrada = new JLabel("Tipo de Entrada: ");
		lbTipoEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbTipoEntrada.setBounds(30, 157, 145, 25);
		contentPane.add(lbTipoEntrada);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setColumns(10);
		tfTipoEntrada.setBounds(226, 157, 145, 25);
		contentPane.add(tfTipoEntrada);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(30, 267, 145, 25);
		contentPane.add(lbFecha);
		
		tfFecha = new JTextField();
		tfFecha.setColumns(10);
		tfFecha.setBounds(226, 271, 145, 25);
		contentPane.add(tfFecha);
		
		JLabel lbHora = new JLabel("Hora ");
		lbHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHora.setBounds(30, 303, 145, 25);
		contentPane.add(lbHora);
		
		tfHora = new JTextField();
		tfHora.setColumns(10);
		tfHora.setBounds(226, 306, 145, 25);
		contentPane.add(tfHora);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(30, 342, 145, 25);
		contentPane.add(lbCantidad);
		
		JSpinner spCantidad = new JSpinner();
		spCantidad.setBounds(226, 342, 145, 25);
		contentPane.add(spCantidad);
		
		JLabel lbIva = new JLabel("Iva: ");
		lbIva.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbIva.setBounds(30, 231, 145, 25);
		contentPane.add(lbIva);
		
		tfIva = new JTextField();
		tfIva.setColumns(10);
		tfIva.setBounds(226, 231, 145, 25);
		contentPane.add(tfIva);
		
		JLabel lbCif = new JLabel("Cif:");
		lbCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCif.setBounds(30, 378, 145, 25);
		contentPane.add(lbCif);
		
		JLabel lbNumCif = new JLabel("(FALTA NUMERO CIF)");
		lbNumCif.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNumCif.setBounds(226, 378, 195, 25);
		contentPane.add(lbNumCif);
		
		JLabel lbPrecioEntrada = new JLabel("Precio Entrada: ");
		lbPrecioEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrecioEntrada.setBounds(30, 193, 145, 25);
		contentPane.add(lbPrecioEntrada);
		
		tfPrecioEntrada = new JTextField();
		tfPrecioEntrada.setColumns(10);
		tfPrecioEntrada.setBounds(226, 195, 145, 25);
		contentPane.add(tfPrecioEntrada);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDireccion.setBounds(30, 121, 145, 25);
		contentPane.add(lbDireccion);
		
		tfDireccion = new JTextField();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(226, 123, 145, 25);
		contentPane.add(tfDireccion);
		
		JLabel lbNombreMuseo = new JLabel("Nombre del Museo: ");
		lbNombreMuseo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNombreMuseo.setBounds(30, 85, 157, 25);
		contentPane.add(lbNombreMuseo);
		
		tfNombreMuseo = new JTextField();
		tfNombreMuseo.setColumns(10);
		tfNombreMuseo.setBounds(226, 87, 145, 25);
		contentPane.add(tfNombreMuseo);
				
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionEntrada seleccionEntrada = new SeleccionEntrada();
				seleccionEntrada.setVisible(true);
				dispose();
			}
		});
		btCancelar.setBounds(10, 435, 89, 32);
		contentPane.add(btCancelar);
		
		JButton btConfirmar = new JButton("Confirmar");
		btConfirmar.setBounds(335, 435, 107, 32);
		contentPane.add(btConfirmar);
		
		JLabel lblNewLabel = new JLabel("Entrada Normal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 11, 416, 39);
		contentPane.add(lblNewLabel);
		
		
		
		
	}

}
