package FocusListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer1 {

	private JFrame frame;
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField tlf;
	private JTextField mail;
	private JLabel info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 window = new Ejer1();
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
	public Ejer1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(39, 45, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		nombre = new JTextField();
		nombre.setBounds(106, 42, 201, 20);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(39, 70, 46, 14);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tel\u00E9fono");
		lblNewLabel_1_1.setBounds(39, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("E-Mail");
		lblNewLabel_1_2.setBounds(39, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		apellidos = new JTextField();
		apellidos.setColumns(10);
		apellidos.setBounds(106, 67, 201, 20);
		frame.getContentPane().add(apellidos);
		
		tlf = new JTextField();
		tlf.setColumns(10);
		tlf.setBounds(106, 92, 201, 20);
		frame.getContentPane().add(tlf);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(106, 117, 201, 20);
		frame.getContentPane().add(mail);
		
		info = new JLabel("");
		info.setBounds(58, 180, 226, 14);
		frame.getContentPane().add(info);
		
		JButton res = new JButton("RESTART");
		res.setBounds(218, 227, 89, 23);
		frame.getContentPane().add(res);
		
		nombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(nombre.getText().isEmpty()) {
					apellidos.disable();
					tlf.disable();
					mail.disable();
					info.setText("No puedes dejar campos vacíos");
				}
				
			}
		});
		apellidos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(apellidos.getText().isEmpty()) {
					nombre.disable();
					tlf.disable();
					mail.disable();
					info.setText("No puedes dejar campos vacíos");
				}
				
			}
		});
		tlf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(tlf.getText().isEmpty()) {
					apellidos.disable();
					nombre.disable();
					mail.disable();
					info.setText("No puedes dejar campos vacíos");
				}
				
			}
		});
		mail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(mail.getText().isEmpty()) {
					apellidos.disable();
					tlf.disable();
					nombre.disable();
					info.setText("No puedes dejar campos vacíos");
				}
				
			}
		});
		res.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				nombre.enable();nombre.setText("");
				apellidos.enable();apellidos.setText("");
				tlf.enable();tlf.setText("");
				mail.enable();mail.setText("");
				info.setText("");
			}
		});
	}
}
