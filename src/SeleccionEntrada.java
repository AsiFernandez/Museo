import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class SeleccionEntrada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionEntrada frame = new SeleccionEntrada();
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
	public SeleccionEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeEntrada = new JLabel("Tipo de entrada");
		lblTipoDeEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeEntrada.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTipoDeEntrada.setBounds(10, 11, 576, 32);
		contentPane.add(lblTipoDeEntrada);
		
		//Boton que te lleva a la pagina para las entradas gratuitas
		JButton btnEntradaGratis = new JButton("Entrada Gratuita");
		btnEntradaGratis.setBounds(64, 72, 130, 143);
		contentPane.add(btnEntradaGratis);
		btnEntradaGratis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntradaGratuita entradagratuita = new EntradaGratuita();
				entradagratuita.setVisible(true);
				dispose();
			}
		});
		
		
		JButton btnEntradaNormal = new JButton("Entrada Normal");
		btnEntradaNormal.setBounds(221, 72, 130, 143);
		contentPane.add(btnEntradaNormal);
		
		JButton btnEntradaGrupos = new JButton("Entrada Grupos");
		btnEntradaGrupos.setBounds(391, 72, 130, 143);
		contentPane.add(btnEntradaGrupos);
	}
}
