import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Datos extends JFrame {

	private JPanel contentPane;
	private JTable tbEntradas;
	private JTextField tfBusqueda;
	String[] columnNames = {"Id", "Nombre Museo", "Direccion", "Tipo", "Precio", "iva", "Fecha", "Cantidad", "CIF"};



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
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
	public Datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTipoEntrada = new JLabel("Tipo de Entrada:");
		lbTipoEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTipoEntrada.setBounds(10, 21, 155, 28);
		contentPane.add(lbTipoEntrada);
		
		tfBusqueda = new JTextField();
		tfBusqueda.setBounds(175, 21, 294, 28);
		contentPane.add(tfBusqueda);
		tfBusqueda.setColumns(10);
		
		JButton btConsulta = new JButton("Consulta");
		btConsulta.setBounds(479, 21, 122, 28);
		contentPane.add(btConsulta);
		
		JScrollPane spDeTabla = new JScrollPane();
		spDeTabla.setBounds(20, 78, 906, 300);
		contentPane.add(spDeTabla);
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
		//table = new JTable(model);
		tbEntradas = new JTable();
		tbEntradas.setModel(model); 
		tbEntradas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tbEntradas.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(tbEntradas);
		scroll.setHorizontalScrollBarPolicy(
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		String textvalue = tfBusqueda.getText();
		
		try
		{ 
		 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/museo", "root", "root");
		String sql = "select * from entradas where tipo ="+tfBusqueda.getText();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int i =0;
		if(rs.next())
		{
		String id = rs.getString("id");
		String nombreMuseo = rs.getString("nombreMuseo");
		String direccion = rs.getString("direccion");
		String tipo = rs.getString("tipo");
		Double precio = rs.getDouble("precio");
		Double iva = rs.getDouble("iva");
		Date fecha = rs.getDate("fecha");
		int cantidad= rs.getInt("cantidad");
		String cif = rs.getString("cif");
		
		model.addRow(new Object[]{id, nombreMuseo, direccion, tipo, precio, iva,fecha, cantidad, cif});
		i++; 
		}
		if(i <1)
		{
		JOptionPane.showMessageDialog(null, "No Record Found","Error",
		JOptionPane.ERROR_MESSAGE);
		}
		if(i ==1)
		{
		System.out.println(i+" Record Found");
		}
		else
		{
		System.out.println(i+" Records Found");
		}
		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		}
}
