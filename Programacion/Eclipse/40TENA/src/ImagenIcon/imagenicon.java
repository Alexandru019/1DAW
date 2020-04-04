package ImagenIcon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class imagenicon extends JFrame {
	private JPanel panelGato;
	private JPanel panelPerro;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imagenicon frame = new imagenicon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public imagenicon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelPerro = new JPanel();
		panelPerro.setLocation(70, 80);
		panelPerro.setSize(150, 150);
		contentPane.add(panelPerro);
		
		panelGato = new JPanel();
		panelGato.setLocation(70, 80);
		panelGato.setSize(150, 150);
		contentPane.add(panelGato);
		panelPerro.setLayout(null);
		
		FondoImagen perro=new FondoImagen("perro.jpg");
		perro.setBounds(0, 0, 150, 150);
		panelPerro.add(perro);
		panelGato.setLayout(null);
		
		FondoImagen gato=new FondoImagen("gato.jpg");
		gato.setBounds(0, 0, 150, 150);
		panelGato.add(gato);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(70, 31, 150, 20);
		contentPane.add(comboBox);
		comboBox.addItem("PERRO");
		comboBox.addItem("GATO");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("PERRO")) {
					panelGato.setVisible(false);
					panelPerro.setVisible(true);
				}else {
					panelGato.setVisible(true);
					panelPerro.setVisible(false);
			}}
		});
		
	}
}
