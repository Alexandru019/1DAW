package Varios1;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer2 {

	private JFrame frame;
	private ArrayList PreciosCB1;
	private ArrayList PreciosCB2;
	private ArrayList PreciosCB3;

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
		frame.setBounds(100, 100, 356, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		PreciosCB1=new ArrayList();
		PreciosCB2=new ArrayList();
		PreciosCB3=new ArrayList();
		
		JLabel lblNewLabel = new JLabel("Primer Plato");
		lblNewLabel.setBounds(31, 41, 83, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Plato");
		lblNewLabel_1.setBounds(31, 78, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Postre");
		lblNewLabel_2.setBounds(31, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(144, 38, 143, 20);
		frame.getContentPane().add(cb1);
		cb1.addItem("Lasaña de carne");
		PreciosCB1.add(3.85);
		cb1.addItem("Fideua");
		PreciosCB1.add(4.45);
		cb1.addItem("Arroz a Banda");
		PreciosCB1.add(4.25);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBounds(144, 75, 143, 20);
		frame.getContentPane().add(cb2);
		cb2.addItem("Nuggets de Pollo");
		PreciosCB2.add(4.25);
		cb2.addItem("Croquetas");
		PreciosCB2.add(3.45);
		cb2.addItem("Emperador en Salsa");
		PreciosCB2.add(3.99);
		
		JComboBox cb3 = new JComboBox();
		cb3.setBounds(144, 117, 143, 20);
		frame.getContentPane().add(cb3);
		cb3.addItem("Flan de Huevo");
		PreciosCB3.add(4.15);
		cb3.addItem("Helado de Fresa");
		PreciosCB3.add(4.55);
		cb3.addItem("Macedonia");
		
		JLabel info = new JLabel("");
		info.setBounds(31, 236, 276, 14);
		frame.getContentPane().add(info);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_ENTER:
					double precio=(double) PreciosCB1.get(cb1.getSelectedIndex())+(double) PreciosCB2.get(cb2.getSelectedIndex())+(double) PreciosCB3.get(cb3.getSelectedIndex());
					info.setText("El precio del menú es de "+precio);
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double precio=(double) PreciosCB1.get(cb1.getSelectedIndex())+(double) PreciosCB2.get(cb2.getSelectedIndex())+(double) PreciosCB3.get(cb3.getSelectedIndex());
				info.setText("El precio del menú es de "+precio);
			}
		});
		btnNewButton.setBounds(160, 165, 89, 23);
		frame.getContentPane().add(btnNewButton);
		PreciosCB3.add(3.85);
		
		
	}

}
