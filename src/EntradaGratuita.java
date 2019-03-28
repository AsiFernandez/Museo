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
		setBounds(100, 100, 468, 538);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Entrada Gratuita");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTitulo.setBounds(10, 11, 346, 25);
		contentPane.add(lbTitulo);
		
		JLabel lblTipoDeEntrada = new JLabel("Tipo de Entrada: ");
		lblTipoDeEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeEntrada.setBounds(33, 66, 145, 25);
		contentPane.add(lblTipoDeEntrada);
		
		tfTipoEntrada = new JTextField();
		tfTipoEntrada.setBounds(188, 66, 145, 25);
		contentPane.add(tfTipoEntrada);
		tfTipoEntrada.setColumns(10);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFecha.setBounds(33, 102, 145, 25);
		contentPane.add(lbFecha);
		
		JLabel lbHora = new JLabel("Hora ");
		lbHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHora.setBounds(33, 138, 145, 25);
		contentPane.add(lbHora);
		
		tfHora = new JTextField();
		tfHora.setColumns(10);
		tfHora.setBounds(188, 138, 145, 25);
		contentPane.add(tfHora);
		
		JLabel lbCantidad = new JLabel("Cantidad");
		lbCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCantidad.setBounds(33, 174, 145, 25);
		contentPane.add(lbCantidad);
		
		JSpinner spCantidad = new JSpinner();
		spCantidad.setBounds(188, 174, 145, 25);
		contentPane.add(spCantidad);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 456, 89, 32);
		contentPane.add(btnCancelar);
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
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(335, 456, 107, 32);
		contentPane.add(btnConfirmar);
		
		JFormattedTextField ftfFecha = new JFormattedTextField();
		ftfFecha.setBounds(188, 102, 145, 25);
		contentPane.add(ftfFecha);
		btnConfirmar.addActionListener(new ActionListener() {
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			JFormattedTextField txtDate = new JFormattedTextField(df);
			
			public void actionPerformed(ActionEvent e) {
			String tEntrada = tfTipoEntrada.getText();
			//Date Fecha = tfFecha.getText();
				
			}
		});

		
			
	}
}
