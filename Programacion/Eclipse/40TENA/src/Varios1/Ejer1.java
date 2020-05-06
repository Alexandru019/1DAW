package Varios1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejer1 {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 339, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(82, 47, 162, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel infoNom = new JLabel("Nombre");
		infoNom.setBounds(10, 50, 46, 14);
		frame.getContentPane().add(infoNom);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 95, 162, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("España");
		comboBox.addItem("Rusia");
		comboBox.addItem("China");
		comboBox.addItem("Francia");
		comboBox.addItem("Rumanía");
		
		JLabel lblNewLabel = new JLabel("Pais");
		lblNewLabel.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel info = new JLabel("");
		info.setBounds(41, 236, 242, 14);
		frame.getContentPane().add(info);
		
		JButton btnNewButton = new JButton("ACCEPT");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_ENTER:
					info.setText("Hola "+textField.getText()+" nacido en "+comboBox.getSelectedItem());
					break;
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				info.setText("Hola "+textField.getText()+" nacido en "+comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(108, 171, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
