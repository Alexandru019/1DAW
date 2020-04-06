package JOptionPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer2 {

	private JFrame frame;
	private JTextField textField;
	private int Opcion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer2 window = new Ejer2();
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
	public Ejer2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton OK = new JButton("OK");
		OK.setBounds(82, 176, 89, 23);
		frame.getContentPane().add(OK);
		
		JButton Salir = new JButton("SALIR");
		Salir.setBounds(181, 176, 89, 23);
		frame.getContentPane().add(Salir);
		
		JButton Limpiar = new JButton("LIMPIAR");
		Limpiar.setBounds(280, 176, 89, 23);
		frame.getContentPane().add(Limpiar);
		
		textField = new JTextField();
		textField.setBounds(138, 58, 231, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(63, 61, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(78, 225, 333, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Debes introducir un nombre");
				}else {
					lblNewLabel_1.setText("Bienvenido: "+textField.getText());
				}
			}
		});
		Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opcion=JOptionPane.showConfirmDialog(frame, "¿Está seguro que desea borrar el nombre?");
				if(JOptionPane.YES_OPTION==Opcion) {
					textField.setText("");
				}
			}
		});
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opcion=JOptionPane.showConfirmDialog(frame, "¿Está seguro que desea salir del programa?");
				if(JOptionPane.YES_OPTION==Opcion) {
					System.exit(0);
				}
			}
		});
	}
}
