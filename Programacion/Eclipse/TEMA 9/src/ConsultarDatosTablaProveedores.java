import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultarDatosTablaProveedores {

	private JFrame frmConsultaProveedores;
	private JTextField tf;
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
					ConsultarDatosTablaProveedores window = new ConsultarDatosTablaProveedores();
					window.frmConsultaProveedores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarDatosTablaProveedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultaProveedores = new JFrame();
		frmConsultaProveedores.setTitle("Consulta Proveedores");
		frmConsultaProveedores.setBounds(100, 100, 277, 300);
		frmConsultaProveedores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConsultaProveedores.getContentPane().setLayout(null);
		
		JButton consulta = new JButton("CONSULTAR");
		consulta.setBounds(10, 85, 130, 23);
		frmConsultaProveedores.getContentPane().add(consulta);
		
		JLabel lblNewLabel = new JLabel("Escribe la ID del proveedor que quieres consultar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 22, 307, 14);
		frmConsultaProveedores.getContentPane().add(lblNewLabel);
		
		tf = new JTextField();
		tf.setBounds(32, 44, 86, 20);
		frmConsultaProveedores.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 47, 23, 14);
		frmConsultaProveedores.getContentPane().add(lblNewLabel_1);
		
		JLabel infoNom = new JLabel("");
		infoNom.setBounds(32, 141, 210, 23);
		frmConsultaProveedores.getContentPane().add(infoNom);
		
		JLabel infoContacto = new JLabel("");
		infoContacto.setBounds(32, 193, 210, 23);
		frmConsultaProveedores.getContentPane().add(infoContacto);
		
		consulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					ResultSet registro = stmt.executeQuery("select proveedores_nombre,contacto_nombre from proveedores where proveedores_id="+tf.getText());
					 if (registro.next()==true) {
						 infoNom.setText("El nombre del proveedor es "+registro.getString("proveedores_nombre"));
						 infoContacto.setText("El nombre del contacto es "+registro.getString("contacto_nombre"));
					 }
					 conn.close(); 
				}catch(Exception e) {
					JOptionPane.showMessageDialog(frmConsultaProveedores, "El proveedor con ID "+ tf.getText()+" no existe");
				}
			}
		});
	}
}
