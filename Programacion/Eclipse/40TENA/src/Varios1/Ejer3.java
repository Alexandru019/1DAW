package Varios1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejer3 {

	private JFrame frame;
	private int cont;
	private long n1,n2;

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
		cont=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("PULSA PARA EMPEZAR");
		btn1.setBounds(84, 33, 268, 44);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Reinicio cuenta");
		btn2.setBounds(125, 88, 191, 30);
		frame.getContentPane().add(btn2);
		
		JLabel info = new JLabel("Tiempo entre pulsacion :");
		info.setBounds(84, 166, 268, 14);
		frame.getContentPane().add(info);
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cont++;
				btn1.setText("Has pulsado "+cont+" veces");
				if(cont%2==0) {
					n2=System.currentTimeMillis();
					info.setText("Tiempo entre pulsacion : "+((n2-n1)/1000)+" segundos");
				}else {
					n1=System.currentTimeMillis();
				}
				
			}
		});
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cont=0;
				btn1.setText("PULSA PARA EMPEZAR");
				info.setText("Tiempo entre pulsacion : ");
			}
		});
		
	}

}
