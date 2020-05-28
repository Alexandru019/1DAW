import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addEditTienda {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private static String accionado;
	private static ArrayList CadenaRecibida;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	static final String USER = "Alex";
	static final String PASS = "Tostus33,";

	/**
	 * Launch the application.
	 */
	public static void main(String accionador,ArrayList CadenaEnviada) {
		accionado=accionador;
		if(accionado.equals("editar")) {
			CadenaRecibida=CadenaEnviada;
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEditTienda window = new addEditTienda();
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
	public addEditTienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 285, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList listaTiendas = new ArrayList();
		
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 32, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(72, 29, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Tel\u00E9fono");
		lblNewLabel_1.setBounds(10, 80, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf2 = new JTextField();
		tf2.setBounds(88, 77, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Provincia");
		lblNewLabel_2.setBounds(10, 128, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf3 = new JTextField();
		tf3.setBounds(88, 125, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(88, 172, 86, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n");
		lblNewLabel_3.setBounds(10, 175, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnADD = new JButton("A\u00D1ADIR");
		btnADD.setBounds(122, 227, 89, 23);
		frame.getContentPane().add(btnADD);
		
		JButton btnEdit = new JButton("Aceptar Edit");
		btnEdit.setBounds(50, 227, 161, 23);
		frame.getContentPane().add(btnEdit);
		
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Tienda");
			 rs=stmt.executeQuery("SELECT * FROM Tienda");
			 while (rs.next()) {
					listaTiendas.add(rs.getString("Nombre"));
					
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(accionado.equals("add")) {
			btnADD.setVisible(true);
			btnEdit.setVisible(false);
			frame.setTitle("Añadir Tienda");
			tf1.setEnabled(true);
		}else {
			tf1.setText((String) CadenaRecibida.get(0));
			tf2.setText((String) CadenaRecibida.get(1));
			tf3.setText((String) CadenaRecibida.get(2));
			tf4.setText((String) CadenaRecibida.get(3));
			btnADD.setVisible(false);
			btnEdit.setVisible(true);
			frame.setTitle("Editar Tienda");
			tf1.setEnabled(false);
		}
		
		btnADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "No puedes dejar campos vacios");
				}else {
					try {
						int pass=0;
						for(int i=0;i<listaTiendas.size();i++) {
							if(listaTiendas.get(i).equals(tf1.getText())) {
								pass=1;
								JOptionPane.showMessageDialog(frame, "La Tienda "+tf1.getText()+" ya existe y no se aceptan duplicados");
								
							}
						}
						if(pass==0) {
							Connection conn = null;
							Statement stmt = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(DB_URL, USER, PASS);
							stmt = conn.createStatement();
							stmt.executeUpdate("INSERT INTO Tienda VALUES ('"+ tf1.getText()+"','"+tf2.getText()+"','"+ tf3.getText()+"','"+tf4.getText()+"')");
							JOptionPane.showMessageDialog(frame, "Datos Introducidos con Éxito");
							frame.dispose();
						}
			
					}catch(Exception a) {
						JOptionPane.showMessageDialog(frame, "Error en los Datos");
					}
				}
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
						Connection conn = null;
						Statement stmt = null;
						Class.forName("com.mysql.jdbc.Driver");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						stmt = conn.createStatement();
						stmt.executeUpdate("UPDATE Tienda SET Telefono='"+tf2.getText()+"', Provincia='"+tf3.getText()+"', Direccion='"+tf4.getText()+"' WHERE Nombre='"+tf1.getText()+"'");
						JOptionPane.showMessageDialog(frame, "Datos Cambiados con Éxito\nRecarga la tabla usando el boton");
						frame.dispose();
		
				}catch(Exception a) {
					a.printStackTrace();
				}
			}
		});
	}
}
