package KeyListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejer1 {

	private JFrame frame;
	private int num;

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
		num=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area entrada de texto");
		lblNewLabel.setBounds(20, 29, 146, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(20, 49, 390, 64);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Area de Salida de Texto");
		lblNewLabel_1.setBounds(20, 144, 146, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(20, 169, 390, 39);
		frame.getContentPane().add(textArea_1);
		
		JLabel info = new JLabel("N\u00FAmero de vocales: ");
		info.setBounds(250, 236, 174, 14);
		frame.getContentPane().add(info);
		
		JLabel lblNewLabel_2 = new JLabel("ESC para salir");
		lblNewLabel_2.setBounds(20, 236, 88, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_A:
					textArea_1.setText(textArea_1.getText()+" a");num++;
					info.setText("Número de vocales: "+num);
					break;
				case KeyEvent.VK_E:
					textArea_1.setText(textArea_1.getText()+" e");num++;
					info.setText("Número de vocales: "+num);
				case KeyEvent.VK_I:
					textArea_1.setText(textArea_1.getText()+" i");num++;
					info.setText("Número de vocales: "+num);
					break;
				case KeyEvent.VK_O:
					textArea_1.setText(textArea_1.getText()+" o");num++;
					info.setText("Número de vocales: "+num);
					break;
				case KeyEvent.VK_U:
					textArea_1.setText(textArea_1.getText()+" u");num++;
					info.setText("Número de vocales: "+num);
					break;
				case KeyEvent.VK_ESCAPE:
					System.exit(0);
					break;

				default:
					break;
				}
			}
		});
	}
}
