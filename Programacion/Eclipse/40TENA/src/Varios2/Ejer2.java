package Varios2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejer2 {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 434, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IMPORTE EN EUROS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(129, 25, 167, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(33, 66, 186, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel info = new JLabel("");
		info.setFont(new Font("Tahoma", Font.BOLD, 11));
		info.setBounds(85, 131, 231, 14);
		frame.getContentPane().add(info);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(229, 66, 148, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("YEN");
		comboBox.addItem("LEU");
		comboBox.addItem("RUPIA");
		comboBox.addItem("LIBRA");
		comboBox.addItem("BOLIVAR");
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try {
					double euros=Double.parseDouble(textField.getText());
					if(comboBox.getSelectedItem().equals("YEN")) {
						info.setText("El importe en yenes es : "+(euros*114.64));
					}else {
						if(comboBox.getSelectedItem().equals("LEU")){
							info.setText("El importe en leus es : "+(euros*4.83));
						}else {
							if(comboBox.getSelectedItem().equals("RUPIA")) {
								info.setText("El importe en rupias es : "+(euros*81.87));
							}else {
								if(comboBox.getSelectedItem().equals("LIBRA")) {
									info.setText("El importe en libras es : "+(euros*0.87));
								}else {
									if(comboBox.getSelectedItem().equals("BOLIVAR")) {
										info.setText("El importe en bolivares es : "+(euros*185142.81));
									}
								}
							}
						}
					}
					}catch(NumberFormatException a) {
						info.setText("Formato de numero inválido");
					}
				
			}
		});
	}

}
