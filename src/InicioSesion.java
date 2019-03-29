import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;


public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfContrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Driver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		Driver();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitulo = new JLabel("Museo Diocesano");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lbTitulo.setBounds(10, 11, 599, 90);
		contentPane.add(lbTitulo);
		
		JLabel lbUsuario = new JLabel("Nombre De Usuario");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbUsuario.setBounds(48, 138, 149, 30);
		contentPane.add(lbUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(207, 138, 322, 30);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lbContrasenia = new JLabel("Contrase\u00F1a");
		lbContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbContrasenia.setBounds(48, 179, 149, 26);
		contentPane.add(lbContrasenia);
		
		pfContrasenia = new JPasswordField();
		pfContrasenia.setBounds(207, 179, 322, 30);
		contentPane.add(pfContrasenia);
		
		JButton btnAcceder = new JButton("Iniciar Sesion");
		btnAcceder.setBounds(402, 220, 125, 36);
		contentPane.add(btnAcceder);
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String usuario = tfUsuario.getText();
			char[] cContrasenia = pfContrasenia.getPassword();
			String sContrasenia = String.valueOf(cContrasenia);
			String query = "Select * from usuarios where nombre = '" + usuario + "' and contrasenia = '" + sContrasenia + "'"; 
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/museo", "root", "root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				boolean existe = rs.next();
				if(existe) {
					SeleccionDeEntrada SeleccionarEntrada = new SeleccionDeEntrada();
					SeleccionarEntrada.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			}
		});
		
		
	}
	
	
}