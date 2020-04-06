package JToolBar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JToolBar extends JFrame {

	private JPanel contentPane;
	private String Frase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToolBar frame = new JToolBar();
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
	public JToolBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		javax.swing.JToolBar toolBar = new javax.swing.JToolBar();
		toolBar.setBounds(5, 5, 424, 33);
		contentPane.add(toolBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 46, 414, 204);
		contentPane.add(textArea);
		textArea.setLineWrap(true);
		
		JButton cortar = new JButton(new ImageIcon("src/JToolBar/Imagenes/tijeras.png"));
		cortar.setToolTipText("Cortar");
		cortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frase=textArea.getSelectedText();
				textArea.replaceSelection("");
			}
		});
		toolBar.add(cortar);
		
		JButton pegar = new JButton(new ImageIcon("src/JToolBar/Imagenes/pegar.png"));
		pegar.setToolTipText("Pegar");
		pegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.replaceSelection(Frase);
			}
		});
		toolBar.add(pegar);
		
		JButton copiar = new JButton(new ImageIcon("src\\JToolBar\\Imagenes\\copy.png"));
		copiar.setToolTipText("Copiar");
		copiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frase=textArea.getSelectedText();
			}
		});
		toolBar.add(copiar);
		
		
	}
}
