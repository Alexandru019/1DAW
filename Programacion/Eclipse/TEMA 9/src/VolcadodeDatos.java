import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class VolcadodeDatos {

	private JFrame frame;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://xlex.com.es/COMERCIO";
	static final String USER = "Alex";
	static final String PASS = "Tostus33,";
	private JTabbedPane paneles;
	private JPanel inicio;private JPanel proveedores;private JPanel productos;private JPanel empleados;private JPanel clientes;private JPanel departamentos;
	private JScrollPane scrollPane1;
	private JTable tabla1;
	private ArrayList TodoPanel;
	private String [] Datos;
	private Object[]nomColumnas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolcadodeDatos window = new VolcadodeDatos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VolcadodeDatos() {
		initialize();
	}
	
	public void columnitas() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName());
			ResultSetMetaData metaDatos = rs.getMetaData();
			nomColumnas = new Object[metaDatos.getColumnCount()];
			for (int i = 0; i < metaDatos.getColumnCount(); i++){
				nomColumnas[i] = metaDatos.getColumnLabel(i + 1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void registraDatos() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName());
			ResultSetMetaData metaDatos = rs.getMetaData();
			Datos=new String[metaDatos.getColumnCount()];
			 while (rs.next()) {
				 for(int a=0;a<metaDatos.getColumnCount();a++) {
					 Datos[a]=rs.getString(a+1);
				 }
				 ((DefaultTableModel) tabla1.getModel()).addRow(Datos);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargaTabla() {
		columnitas();
		for(int i=0;i<tabla1.getRowCount();i++) {
			((DefaultTableModel) tabla1.getModel()).removeRow(0);
		}
		tabla1.setModel(new DefaultTableModel(new Object[][] {},nomColumnas));
		proveedores.add(scrollPane1);
		scrollPane1.setVisible(true);
		registraDatos();
		
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TodoPanel=new ArrayList();
		
		tabla1=new JTable();
		scrollPane1=new JScrollPane(tabla1);
		inicio=new JPanel();proveedores=new JPanel();
		proveedores.setName("proveedores");
		paneles=new JTabbedPane();
		
		paneles.setBounds(100, 100, 506, 309);
		paneles.add("Inicio", inicio); 
		paneles.add("proveedores", proveedores); 
		
		frame.getContentPane().add(paneles);
		inicio.setLayout(null);
		proveedores.setLayout(null);
		
		
		paneles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				frame.setTitle(paneles.getSelectedComponent().getName());
				if(paneles.getSelectedIndex()==0) {
					scrollPane1.setVisible(false);
					
				}else {
					frame.setBounds(100, 100, 714, 353);
					JOptionPane.showMessageDialog(frame, "Refrescando Los Datos"); 
					scrollPane1.setBounds(0,0,frame.getWidth(),frame.getHeight());
					cargaTabla();
					JOptionPane.showMessageDialog(frame, "Cargado con éxito"); 
				}
			}
		});
		
	}

}
