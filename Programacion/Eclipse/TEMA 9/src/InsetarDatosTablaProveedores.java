import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsetarDatosTablaProveedores {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/COMERCIO";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsetarDatosTablaProveedores window = new InsetarDatosTablaProveedores();
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
	public InsetarDatosTablaProveedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton add = new JButton("A\u00F1adir");
		add.setBounds(47, 178, 89, 23);
		frame.getContentPane().add(add);
		
		tf1 = new JTextField();
		tf1.setBounds(70, 65, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(132, 96, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(101, 127, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 68, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Proveedor");
		lblNewLabel_1.setBounds(10, 99, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contacto");
		lblNewLabel_2.setBounds(10, 130, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					String sql = "INSERT INTO proveedores VALUES ("+tf1.getText()+",'"+ tf2.getText()+"','"+tf3.getText()+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(frame, "Datos introducidos con éxito");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(frame, "Revisa los Datos");
				}
			}
		});
	}
}
