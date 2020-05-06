package Varios2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejer3 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer3 window = new Ejer3();
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
	public Ejer3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Parcial 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 31, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblParcial = new JLabel("Parcial 2");
		lblParcial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParcial.setBounds(10, 66, 75, 14);
		frame.getContentPane().add(lblParcial);
		
		JLabel lblParcial_1 = new JLabel("Parcial 3");
		lblParcial_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParcial_1.setBounds(10, 105, 75, 14);
		frame.getContentPane().add(lblParcial_1);
		
		txt1 = new JTextField();
		txt1.setBounds(78, 28, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(78, 63, 86, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(78, 102, 86, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Materias");
		lblNewLabel_1.setBounds(10, 156, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 153, 107, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("Marcas");
		comboBox.addItem("BBDD");
		comboBox.addItem("Entornos");
		comboBox.addItem("Programación");
		comboBox.addItem("Sistemas");
		
		JLabel info = new JLabel("");
		info.setBounds(10, 206, 242, 14);
		frame.getContentPane().add(info);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				try {
					double n1,n2,n3;
					n1=Double.parseDouble(txt1.getText());
					n2=Double.parseDouble(txt2.getText());
					n3=Double.parseDouble(txt3.getText());
					info.setText("Nota media "+(double)((n1+n2+n3)/3));
				}catch(NumberFormatException a) {
					info.setText("Formato erroneo");
				}
			}
		});
		
		
	}

}
