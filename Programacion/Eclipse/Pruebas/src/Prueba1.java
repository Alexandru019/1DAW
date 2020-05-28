import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Prueba1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 window = new Prueba1();
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
	public Prueba1() {
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
		
		JCheckBox Primer = new JCheckBox("1");
		Primer.setBounds(57, 55, 97, 23);
		frame.getContentPane().add(Primer);
		
		JCheckBox Segundo = new JCheckBox("2");
		Segundo.setBounds(57, 81, 97, 23);
		frame.getContentPane().add(Segundo);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(Primer);grupo.add(Segundo);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(Primer.isSelected()) {
					System.out.println(Primer.getText());
				}else {
					System.out.println(Segundo.getText());
				}
			}
		});
		btnNewButton.setBounds(204, 69, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
