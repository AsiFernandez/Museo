import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ConfirmacionEntrada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmacionEntrada frame = new ConfirmacionEntrada();
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
	public ConfirmacionEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDelMuseo = new JLabel("-Nombre Del Museo:");
		lblNombreDelMuseo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombreDelMuseo.setBounds(10, 49, 127, 25);
		contentPane.add(lblNombreDelMuseo);
		
		JLabel lblNewLabel = new JLabel("Informacion de la entrada");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 664, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbNombreMuseoR = new JLabel();
		lbNombreMuseoR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbNombreMuseoR.setBounds(147, 49, 113, 25);
		contentPane.add(lbNombreMuseoR);
		
		JLabel lbldireccion = new JLabel("-Direccion:");
		lbldireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbldireccion.setBounds(308, 49, 75, 25);
		contentPane.add(lbldireccion);
		
		JLabel lbDireccionR = new JLabel("");
		lbDireccionR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbDireccionR.setBounds(393, 49, 281, 25);
		contentPane.add(lbDireccionR);
		
		JLabel lbltipoDeEntrada = new JLabel("-Tipo de entrada:");
		lbltipoDeEntrada.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltipoDeEntrada.setBounds(10, 101, 113, 25);
		contentPane.add(lbltipoDeEntrada);
		
		JLabel lbTipoDeEntradaR = new JLabel("");
		lbTipoDeEntradaR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbTipoDeEntradaR.setBounds(133, 101, 83, 25);
		contentPane.add(lbTipoDeEntradaR);
		
		JLabel lblprecio = new JLabel("-Precio:");
		lblprecio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblprecio.setBounds(236, 101, 63, 25);
		contentPane.add(lblprecio);
		
		JLabel lbPrecioR = new JLabel("");
		lbPrecioR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbPrecioR.setBounds(308, 101, 127, 25);
		contentPane.add(lbPrecioR);
		
		JLabel lblfecha = new JLabel("-Fecha:");
		lblfecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblfecha.setBounds(10, 152, 56, 25);
		contentPane.add(lblfecha);
		
		JLabel lbliva = new JLabel("-Iva:");
		lbliva.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbliva.setBounds(455, 101, 34, 25);
		contentPane.add(lbliva);
		
		JLabel lbIvaR = new JLabel("");
		lbIvaR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbIvaR.setBounds(499, 101, 127, 25);
		contentPane.add(lbIvaR);
		
		JLabel lbFechaR = new JLabel("");
		lbFechaR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbFechaR.setBounds(76, 152, 83, 25);
		contentPane.add(lbFechaR);
		
		JLabel lblhora = new JLabel("-Hora:");
		lblhora.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblhora.setBounds(181, 152, 45, 25);
		contentPane.add(lblhora);
		
		JLabel lbHoraR = new JLabel("");
		lbHoraR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbHoraR.setBounds(236, 152, 75, 25);
		contentPane.add(lbHoraR);
		
		JLabel lblcantidad = new JLabel("-Cantidad:");
		lblcantidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblcantidad.setBounds(321, 152, 63, 25);
		contentPane.add(lblcantidad);
		
		JLabel lbCantidadR = new JLabel("");
		lbCantidadR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbCantidadR.setBounds(393, 152, 113, 25);
		contentPane.add(lbCantidadR);
		
		JLabel lblcif = new JLabel("-CIF:");
		lblcif.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblcif.setBounds(516, 152, 39, 25);
		contentPane.add(lblcif);
		
		JLabel lbCifR = new JLabel("");
		lbCifR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbCifR.setBounds(565, 152, 113, 25);
		contentPane.add(lbCifR);
	}
}
