package ItemListener;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;

public class Ejer2 {

	private JFrame frame;

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
		frame.setBounds(100, 100, 237, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox rojo = new JComboBox();
		rojo.setBounds(66, 38, 59, 20);
		frame.getContentPane().add(rojo);
		
		JComboBox verde = new JComboBox();
		verde.setBounds(66, 79, 59, 20);
		frame.getContentPane().add(verde);
		
		JComboBox azul = new JComboBox();
		azul.setBounds(66, 123, 59, 20);
		frame.getContentPane().add(azul);
		
		JLabel lblNewLabel = new JLabel("Rojo");
		lblNewLabel.setBounds(10, 41, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Verde");
		lblNewLabel_1.setBounds(10, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Azul");
		lblNewLabel_2.setBounds(10, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		for (int i = 0; i <= 255; i++) {
			rojo.addItem(i);
			verde.addItem(i);
			azul.addItem(i);
		}
		
		rojo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				int c1=(int) rojo.getSelectedItem();
				Color color1=new Color(c1,(int)verde.getSelectedItem(),(int)azul.getSelectedItem());
				frame.getContentPane().setBackground(color1);
			}
		});
		verde.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Color color1=new Color((int)rojo.getSelectedItem(),(int)verde.getSelectedItem(),(int)azul.getSelectedItem());
				frame.getContentPane().setBackground(color1);
			}
		});
		azul.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Color color1=new Color((int)rojo.getSelectedItem(),(int)verde.getSelectedItem(),(int)azul.getSelectedItem());
				frame.getContentPane().setBackground(color1);
			}
		});
	}
}
