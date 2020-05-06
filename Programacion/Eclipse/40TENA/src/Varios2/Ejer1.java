package Varios2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.ibm.icu.text.NumberFormat;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IMPORTE EN EUROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(129, 25, 167, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(79, 62, 243, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("CONVERTIR");
		btn1.setBounds(147, 109, 101, 23);
		frame.getContentPane().add(btn1);
		
		JLabel info = new JLabel("El importe en pesetas es :");
		info.setFont(new Font("Tahoma", Font.BOLD, 11));
		info.setBounds(91, 170, 231, 14);
		frame.getContentPane().add(info);
		
		
		btn1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_ENTER:
					try {
						double euros=Double.parseDouble(textField.getText());
						info.setText("El importe en pesetas es : "+(euros*166.386));
						}catch(NumberFormatException a) {
							info.setText("Formato de numero inválido");
						}
					break;
				}
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				double euros=Double.parseDouble(textField.getText());
				info.setText("El importe en pesetas es : "+(euros*166.386));
				}catch(NumberFormatException a) {
					info.setText("Formato de numero inválido");
				}
			}
		});
	}

}
