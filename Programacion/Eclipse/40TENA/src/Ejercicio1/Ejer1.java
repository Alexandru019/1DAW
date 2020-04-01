package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer1 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JFrame NuevaPestanya;
	private JFrame PestanyaError;

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
		frame.setBounds(120, 100, 286, 256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 250, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		NuevaPestanya = new JFrame();
		NuevaPestanya.setBounds(100, 100, 350, 75);
		NuevaPestanya.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NuevaPestanya.getContentPane().setLayout(null);
		
		PestanyaError = new JFrame();
		PestanyaError.setBounds(100, 100, 350, 75);
		PestanyaError.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PestanyaError.getContentPane().setLayout(null);
		
		JPanel panelNuevo = new JPanel();
		panelNuevo.setBounds(10, 11, 250, 195);
		NuevaPestanya.getContentPane().add(panelNuevo);
		panelNuevo.setLayout(null);
		
		JLabel labelBienvenido = new JLabel("Bienvenido");
		labelBienvenido.setBounds(10, 11, 325, 14);
		panelNuevo.add(labelBienvenido);
		
		JLabel labelError = new JLabel("Error,usuario y/o contraseña no estan bien escritos");
		labelError.setBounds(10, 11, 325, 14);
		PestanyaError.add(labelError);
	
		
		String Usuario="Alex";
		JLabel User = new JLabel("Username");
		User.setBounds(10, 11, 60, 14);
		panel.add(User);
		
		String Contrasenya="Alex";
		JLabel Password = new JLabel("Password");
		Password.setBounds(10, 48, 91, 14);
		panel.add(Password);
		
		textField = new JTextField();
		textField.setBounds(111, 8, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(111, 45, 86, 20);
		panel.add(passwordField);
		
		JLabel numIntentos = new JLabel("0");
		numIntentos.setBounds(166, 83, 46, 14);
		panel.add(numIntentos);
		
		JButton Ok = new JButton("OK");
		Ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Intentos=numIntentos.getText();
				if (Intentos.equals("2")) {
					System.exit(0);
				}
				if(textField.getText().equals(Usuario) && passwordField.getText().equals(Contrasenya)) {
					Ejer1 windows = new Ejer1();
					windows.NuevaPestanya.setVisible(true);
				}else {
					int numEntero = Integer.parseInt(Intentos)+1;
					numIntentos.setText(String.valueOf(numEntero));
					Ejer1 Error = new Ejer1();
					Error.PestanyaError.setVisible(true);
				}
			}
		});
		
		Ok.setBounds(10, 115, 89, 23);
		panel.add(Ok);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Cancel.setBounds(111, 115, 89, 23);
		panel.add(Cancel);
		
		JLabel lblNewLabel = new JLabel("Numero de intentos");
		lblNewLabel.setBounds(20, 83, 136, 14);
		panel.add(lblNewLabel);
		
		NuevaPestanya.setDefaultCloseOperation(1);
		NuevaPestanya.setVisible(false);
		NuevaPestanya.dispose();
		
		PestanyaError.setDefaultCloseOperation(1);
		PestanyaError.setVisible(false);
		PestanyaError.dispose();
		
	
	}
}
