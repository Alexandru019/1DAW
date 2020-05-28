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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class addEditPaquete {

	private JFrame frame;
	private static String accionado;
	private static ArrayList CadenaRecibida;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	static final String USER = "Alex";
	static final String PASS = "Tostus33,";
	private JTextField tf1;
	private JTextField tf2;

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
					addEditPaquete window = new addEditPaquete();
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
	public addEditPaquete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList listaID = new ArrayList();
		
		JLabel lblNewLabel = new JLabel("Cod Paquete");
		lblNewLabel.setBounds(10, 30, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(99, 27, 61, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_1.setBounds(10, 77, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(99, 74, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(99, 120, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Provincia");
		lblNewLabel_2.setBounds(10, 123, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID Repartidor");
		lblNewLabel_3.setBounds(10, 179, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 176, 79, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnADD = new JButton("A\u00D1ADIR");
		btnADD.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(btnADD);
		
		JButton btnEdit = new JButton("Aceptar Edit");
		btnEdit.setBounds(99, 227, 152, 23);
		frame.getContentPane().add(btnEdit);
		
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Repartidor");
			 while (rs.next()) {
				comboBox.addItem(rs.getString("Identificador"));
				
			}
			 rs=stmt.executeQuery("SELECT * FROM Paquete");
			 while (rs.next()) {
					listaID.add(rs.getInt("cod_paquete"));
					
				}
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		btnADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(tf1.getText().isEmpty() || tf2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "No puedes dejar campos vacios");
				}else {
					int pass=0;
					for(int i=0;i<listaID.size();i++) {
						if(listaID.get(i)==spinner.getValue()) {
							pass=1;
							JOptionPane.showMessageDialog(frame, "El codigo "+listaID.get(i)+" ya existe y no se aceptan duplicados");
							
						}
					}
					try {
						if(pass==0) {
							Connection conn = null;
							Statement stmt = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(DB_URL, USER, PASS);
							stmt = conn.createStatement();
							stmt.executeUpdate("INSERT INTO Paquete VALUES ('"+ spinner.getValue()+"','"+tf1.getText()+"','"+ tf2.getText()+"','"+comboBox.getSelectedItem().toString()+"')");
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
						stmt.executeUpdate("UPDATE Paquete SET cod_paquete="+spinner.getValue()+", Direccion='"+tf1.getText()+"', Provincia='"+tf2.getText()+"', Identificador='"+comboBox.getSelectedItem()+"' WHERE cod_paquete='"+Integer.parseInt((String) CadenaRecibida.get(0))+"'");
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
			frame.setTitle("Añadir Paquete");
		}else {
			spinner.setValue(Integer.parseInt((String) CadenaRecibida.get(0)));
			tf1.setText((String) CadenaRecibida.get(1));
			tf2.setText((String) CadenaRecibida.get(2));
			comboBox.setSelectedItem(CadenaRecibida.get(3));
			btnADD.setVisible(false);
			btnEdit.setVisible(true);
			frame.setTitle("Editar Paquete");
		}
	}

}
