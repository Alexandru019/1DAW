import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class addEditRepartidor {

	private JFrame frame;
	private static String accionado;
	private static ArrayList CadenaRecibida;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	static final String USER = "Alex";
	static final String PASS = "Tostus33,";
	private JTextField tf1;

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
					addEditRepartidor window = new addEditRepartidor();
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
	public addEditRepartidor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 258, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList listaID = new ArrayList();
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(71, 46, 85, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(70, 95, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(71, 141, 85, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Tienda");
		lblNewLabel_2.setBounds(10, 144, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnADD = new JButton("A\u00D1ADIR");
		btnADD.setBounds(125, 213, 89, 23);
		frame.getContentPane().add(btnADD);
		
		JButton btnEdit = new JButton("Aceptar Edit");
		btnEdit.setBounds(46, 213, 168, 23);
		frame.getContentPane().add(btnEdit);
		
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Tienda");
			 while (rs.next()) {
				comboBox.addItem(rs.getString("Nombre"));
				
			}
			 rs=stmt.executeQuery("SELECT * FROM Repartidor");
			 while (rs.next()) {
					listaID.add(rs.getInt("Identificador"));
					
				}
			 
				
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		btnADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(tf1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "No puedes dejar campos vacios");
				}else {
					int pass=0;
					for(int i=0;i<listaID.size();i++) {
						if(listaID.get(i)==spinner.getValue()) {
							pass=1;
							JOptionPane.showMessageDialog(frame, "La ID "+listaID.get(i)+" ya existe y no se aceptan duplicados");
							
						}
					}
					try {
						if(pass==0) {
							Connection conn = null;
							Statement stmt = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(DB_URL, USER, PASS);
							stmt = conn.createStatement();
							stmt.executeUpdate("INSERT INTO Repartidor VALUES ('"+ spinner.getValue()+"','"+tf1.getText()+"','"+comboBox.getSelectedItem().toString()+"')");
							JOptionPane.showMessageDialog(frame, "Datos Introducidos con Éxito");
							frame.dispose();
						}
			
					}catch(Exception a) {
						JOptionPane.showMessageDialog(frame, "Datos Erroneos");
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
						stmt.executeUpdate("UPDATE Repartidor SET Identificador="+spinner.getValue()+", Nombre='"+tf1.getText()+"', Nombre_tienda='"+comboBox.getSelectedItem()+"' WHERE Identificador='"+Integer.parseInt((String) CadenaRecibida.get(0))+"'");
						JOptionPane.showMessageDialog(frame, "Datos Cambiados con Éxito\nRecarga la tabla usando el boton");
						frame.dispose();
		
				}catch(Exception a) {
					a.printStackTrace();
				}
			}
		});
		if(accionado.equals("add")) {
			btnADD.setVisible(true);
			btnEdit.setVisible(false);
			frame.setTitle("Añadir Repartidor");
		}else {
			spinner.setValue(Integer.parseInt((String) CadenaRecibida.get(0)));
			tf1.setText((String) CadenaRecibida.get(1));
			comboBox.setSelectedItem(CadenaRecibida.get(2));
			btnADD.setVisible(false);
			btnEdit.setVisible(true);
			frame.setTitle("Editar Repartidor");
		}
	}
}
