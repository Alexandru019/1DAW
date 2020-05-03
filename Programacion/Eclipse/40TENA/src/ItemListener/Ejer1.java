package ItemListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejer1 {

	private JFrame frame;

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
		
		JCheckBox Sandia = new JCheckBox("Sand\u00EDa");
		Sandia.setBounds(53, 65, 97, 23);
		frame.getContentPane().add(Sandia);
		
		JCheckBox Mango = new JCheckBox("Mango");
		Mango.setBounds(163, 65, 97, 23);
		frame.getContentPane().add(Mango);
		
		JCheckBox Uva = new JCheckBox("Uva");
		Uva.setBounds(275, 65, 97, 23);
		frame.getContentPane().add(Uva);
		
		JLabel info = new JLabel("Has Seleccionado:");
		info.setBounds(53, 186, 319, 14);
		frame.getContentPane().add(info);
		
		Sandia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(Sandia.isSelected()) {
					info.setText(info.getText()+" Sandia");
				}else {
					if(info.getText().contains("Sandia")) {
						info.setText(info.getText().replace(" Sandia","")); 
					}
				}
			}
		});
		Mango.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(Mango.isSelected()) {
					info.setText(info.getText()+" Mango");
				}else {
					if(info.getText().contains("Mango")) {
						info.setText(info.getText().replace(" Mango","")); 
					}
				}
			}
		});
		Uva.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(Uva.isSelected()) {
					info.setText(info.getText()+" Uva");
				}else {
					if(info.getText().contains("Uva")) {
						info.setText(info.getText().replace(" Uva","")); 
					}
				}
			}
		});
	}
}
