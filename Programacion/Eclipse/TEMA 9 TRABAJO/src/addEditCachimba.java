import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class addEditCachimba {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton btnADD;
	private JButton btnEdit;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";
	 private ArrayList listaID;
	private static String accionado;
	private static ArrayList CadenaRecibida;

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
					addEditCachimba window = new addEditCachimba();
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
	public addEditCachimba() {
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
		frame.setTitle("Añadir Cachimba");
		
		listaID=new ArrayList();
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(31, 39, 87, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setBounds(10, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(53, 79, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		lblNewLabel_2.setBounds(10, 121, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setBounds(63, 118, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(10, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf3 = new JTextField();
		tf3.setBounds(63, 162, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vendedor");
		lblNewLabel_4.setBounds(180, 42, 81, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(243, 39, 143, 20);
		frame.getContentPane().add(comboBox);
		
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
			 rs=stmt.executeQuery("SELECT * FROM Cachimbas");
			 while (rs.next()) {
					listaID.add(rs.getInt("ID"));
					
				}
			 
				
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		btnADD = new JButton("A\u00F1adir");
		btnADD.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "No puedes dejar campos vacios");
				}else {
					int pass=0;
					for(int i=0;i<listaID.size();i++) {
						if(listaID.get(i)==spinner.getValue()) {
							pass=1;
							JOptionPane.showMessageDialog(frame, "la ID "+listaID.get(i)+" ya existe y no se aceptan duplicados");
							
						}
					}
					try {
						if(pass==0) {
							Connection conn = null;
							Statement stmt = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(DB_URL, USER, PASS);
							stmt = conn.createStatement();
							stmt.executeUpdate("INSERT INTO Cachimbas VALUES ('"+ spinner.getValue()+"','"+tf1.getText()+"','"+ tf2.getText()+"',"+Double.parseDouble(tf3.getText())+",'"+comboBox.getSelectedItem().toString()+"')");
							JOptionPane.showMessageDialog(frame, "Datos Introducidos con Éxito");
							frame.dispose();
						}
			
					}catch(Exception a) {
						JOptionPane.showMessageDialog(frame, "Campo Precio mal introducido");
					}
				}
			}
		});
		btnADD.setBounds(293, 148, 89, 23);
		frame.getContentPane().add(btnADD);
		
		btnEdit = new JButton("Aceptar Edit");
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
						Connection conn = null;
						Statement stmt = null;
						Class.forName("com.mysql.jdbc.Driver");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						stmt = conn.createStatement();
						stmt.executeUpdate("UPDATE Cachimbas SET ID="+spinner.getValue()+", Marca='"+tf1.getText()+"', Modelo='"+tf2.getText()+"', Precio='"+Double.parseDouble(tf3.getText())+"', Vendedor='"+comboBox.getSelectedItem()+"' WHERE ID='"+Integer.parseInt((String) CadenaRecibida.get(0))+"'");
						JOptionPane.showMessageDialog(frame, "Datos Cambiados con Éxito\nRecarga la tabla usando el boton");
						frame.dispose();
		
				}catch(Exception a) {
					a.printStackTrace();
				}
			}
		});
		btnEdit.setBounds(227, 148, 174, 23);
		frame.getContentPane().add(btnEdit);
		
		if(accionado.equals("add")) {
			btnADD.setVisible(true);
			btnEdit.setVisible(false);
			frame.setTitle("Añadir Cachimba");
		}else {
			spinner.setValue(Integer.parseInt((String) CadenaRecibida.get(0)));
			spinner.setEnabled(false);
			tf1.setText((String) CadenaRecibida.get(1));
			tf2.setText((String) CadenaRecibida.get(2));
			tf3.setText((String) CadenaRecibida.get(3));
			comboBox.setSelectedItem(CadenaRecibida.get(4));
			btnADD.setVisible(false);
			btnEdit.setVisible(true);
			frame.setTitle("Editar Cachimba");
		}
		
		
	}
}
