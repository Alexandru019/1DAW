import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pruebas {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";
	private JFrame frame;
	private JTabbedPane paneles;
	private JPanel inicio;private JPanel cachimba;
	private JButton btn1;
	private JScrollPane scrollPane1;
	private JTable tabla1;private JTable tabla2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton siguiente;
	private JButton anterior;
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
					pruebas window = new pruebas();
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
	public pruebas() {
		initialize();
	}

	public void columnitas() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName()+"");
			ResultSetMetaData metaDatos = rs.getMetaData();
			nomColumnas = new Object[metaDatos.getColumnCount()];
			Datos=new String[metaDatos.getColumnCount()];
			for (int i = 0; i < metaDatos.getColumnCount(); i++){
				nomColumnas[i] = metaDatos.getColumnLabel(i + 1);
			}
		}catch(Exception e) {
		}
	}
	public void registraDatos() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName()+"");
			ResultSetMetaData metaDatos = rs.getMetaData();
			Datos=new String[metaDatos.getColumnCount()];
			 while (rs.next()) {
				 for(int a=0;a<metaDatos.getColumnCount();a++) {
					 Datos[a]=rs.getString(a);
				 }
				 
			}
			 
				
				
			
		}catch(Exception e) {
			
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Cachimbas");
			ResultSetMetaData metaDatos = rs.getMetaData();
			nomColumnas = new Object[metaDatos.getColumnCount()];
			Datos=new String[metaDatos.getColumnCount()];
			for (int i = 0; i < metaDatos.getColumnCount(); i++){
				nomColumnas[i] = metaDatos.getColumnLabel(i + 1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		tabla1=new JTable();
		tabla1.setModel(new DefaultTableModel(
			new Object[][] {},
			nomColumnas
		));
		scrollPane1=new JScrollPane(tabla1);
		scrollPane1.setBounds(0,0,300,300);
		frame.getContentPane().add(scrollPane1);
	}

}
