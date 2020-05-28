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
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultaEditarBorrar {

	private JFrame frame;
	private JTextField tf;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/COMERCIO";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";
	 private JTextField tfNombre;
	 private JTextField tfContacto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaEditarBorrar window = new ConsultaEditarBorrar();
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
	public ConsultaEditarBorrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 364, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton consulta = new JButton("CONSULTAR");
		consulta.setBounds(10, 126, 115, 23);
		frame.getContentPane().add(consulta);
		
		JButton edit = new JButton("EDITAR");
		edit.setBounds(138, 126, 89, 23);
		frame.getContentPane().add(edit);
		
		JButton borra = new JButton("BORRAR");
		borra.setBounds(237, 126, 89, 23);
		frame.getContentPane().add(borra);
		
		tf = new JTextField();
		tf.setBounds(39, 59, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lbl2 = new JLabel("ID");
		lbl2.setBounds(10, 62, 23, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl1 = new JLabel("Escribe la ID del proveedor");
		lbl1.setBounds(10, 23, 160, 14);
		frame.getContentPane().add(lbl1);
		
		JLabel info1 = new JLabel("");
		info1.setBounds(10, 174, 316, 29);
		frame.getContentPane().add(info1);
		
		JLabel info2 = new JLabel("");
		info2.setBounds(10, 214, 316, 29);
		frame.getContentPane().add(info2);
		
		JButton aceptar = new JButton("ACEPTAR CAMBIOS");
		aceptar.setBounds(39, 126, 258, 23);
		frame.getContentPane().add(aceptar);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(89, 20, 138, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfContacto = new JTextField();
		tfContacto.setColumns(10);
		tfContacto.setBounds(89, 59, 138, 20);
		frame.getContentPane().add(tfContacto);
		
		JLabel lbl3 = new JLabel("Nombre");
		lbl3.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("Contacto");
		lbl4.setBounds(10, 62, 68, 14);
		frame.getContentPane().add(lbl4);
		
		tfContacto.setVisible(false);tfNombre.setVisible(false);
		aceptar.setVisible(false);lbl3.setVisible(false);lbl4.setVisible(false);
		
		consulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					ResultSet registro = stmt.executeQuery("select proveedores_nombre,contacto_nombre from proveedores where proveedores_id="+tf.getText());
					 if (registro.next()==true) {
						 info1.setText("El nombre del proveedor es "+registro.getString("proveedores_nombre"));
						 info2.setText("El nombre del contacto es "+registro.getString("contacto_nombre"));
					 }
					 conn.close(); 
				}catch(Exception a) {
					JOptionPane.showMessageDialog(frame, "El proveedor con ID "+ tf.getText()+" no existe");
				}
			}
		});
		edit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					ResultSet registro = stmt.executeQuery("select proveedores_nombre,contacto_nombre from proveedores where proveedores_id="+tf.getText());
					if (registro.next()==true) {
						aceptar.setVisible(true);borra.setVisible(false);consulta.setVisible(false);edit.setVisible(false);tf.setVisible(false);
						tfContacto.setVisible(true);tfNombre.setVisible(true);lbl3.setVisible(true);lbl4.setVisible(true);
						lbl1.setVisible(false);lbl2.setVisible(false);
						tfContacto.setText(registro.getString("contacto_nombre"));tfNombre.setText(registro.getString("proveedores_nombre"));
					}
					 conn.close(); 
				}catch(Exception a) {
					JOptionPane.showMessageDialog(frame, "El proveedor con ID "+ tf.getText()+" no existe");
				}
			}
		});
		aceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					int cantidad = stmt.executeUpdate("update proveedores set proveedores_nombre='"+tfNombre.getText()+"',contacto_nombre='"+tfContacto.getText()+"' where proveedores_id="+tf.getText());
						 if (cantidad==1) {
							 JOptionPane.showMessageDialog(frame, "El proveedor con ID "+ tf.getText()+" ha sido modificado"); 
						 } 
						aceptar.setVisible(false);borra.setVisible(true);consulta.setVisible(true);edit.setVisible(true);tf.setVisible(true);
							tfContacto.setVisible(false);tfNombre.setVisible(false);lbl3.setVisible(false);lbl4.setVisible(false);
							lbl1.setVisible(true);lbl2.setVisible(true);
							tf.setText("");
							conn.close(); 
				}catch(Exception a) {
					
				}
			}
		});
		borra.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stmt = conn.createStatement();
					int cantidad = stmt.executeUpdate("DELETE FROM proveedores WHERE proveedores_id="+tf.getText());
						 if (cantidad==1) {
							 System.out.println("ja");
							 JOptionPane.showMessageDialog(frame, "El proveedor con ID "+ tf.getText()+" ha sido borrado"); 
						 } 
						 conn.close(); 
				}catch(Exception a) {
					JOptionPane.showMessageDialog(frame, "El proveedor con ID "+ tf.getText()+" no existe"); 
				}
			}
		});
	}

}
