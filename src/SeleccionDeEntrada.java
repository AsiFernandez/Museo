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

public class SeleccionDeEntrada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeEntrada frame = new SeleccionDeEntrada();
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
	public SeleccionDeEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 332);
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
		btnEntradaGratis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntradasGratuitas entradagratuita = new EntradasGratuitas();
				entradagratuita.setVisible(true);
				dispose();
			}
		});
		btnEntradaGratis.setBounds(64, 72, 130, 143);
		contentPane.add(btnEntradaGratis);
		
		
		JButton btnEntradaNormal = new JButton("Entrada Normal");
		btnEntradaNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntradasNormales entradaNormal = new EntradasNormales();
				entradaNormal.setVisible(true);
				dispose();
				
			}
		});
		btnEntradaNormal.setBounds(221, 72, 130, 143);
		contentPane.add(btnEntradaNormal);
		
		JButton btnEntradaGrupos = new JButton("Entrada Grupos");
		btnEntradaGrupos.setBounds(391, 72, 130, 143);
		btnEntradaGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntradasGrupos entradasGrupos = new EntradasGrupos();
				entradasGrupos.setVisible(true);
				dispose();				
			}
		});
		contentPane.add(btnEntradaGrupos);
		
		JButton btCerrarSesion = new JButton("Cerar Sesion");
		btCerrarSesion.setBounds(543, 240, 170, 42);
		btCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioSesion inicioSesion = new InicioSesion();
				inicioSesion.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btCerrarSesion);
		
		
		JButton btOtros = new JButton("Otros Eventos");
		btOtros.setBounds(555, 72, 130, 143);
		btOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				OtrosEventos otrosEventos = new OtrosEventos();
				otrosEventos.setVisible(true);
				dispose();
				
			}
			
		});
		contentPane.add(btOtros);
	}
}
