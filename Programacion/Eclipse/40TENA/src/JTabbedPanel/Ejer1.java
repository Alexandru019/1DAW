package JTabbedPanel;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ejer1 {

	private JFrame frame;
	private JTabbedPane paneles;
	private JPanel amarillo;
	private JPanel naranja;
	private JPanel rosa;
	private JPanel rojo;
	private JPanel azul;
	private JPanel cian;
	private JPanel verde;
	private Color [] colores;

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
	public void rellenaColor() {
		colores = new Color [7];
		colores[0] = Color.yellow;
		colores[1] = Color.orange;
		colores[2] = Color.pink;
		colores[3] = Color.red;
		colores[4] = Color.blue;
		colores[5] = Color.cyan;
		colores[6] = Color.green;
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paneles=new JTabbedPane();
		amarillo=new JPanel();naranja=new JPanel();rosa=new JPanel();rojo=new JPanel();azul=new JPanel();cian=new JPanel();verde=new JPanel();
		paneles.add("Yellow", amarillo);
		amarillo.setName("1");naranja.setName("");rosa.setName("3");azul.setName("4");verde.setName("5");
		paneles.add("Orange", naranja);
		paneles.add("Pink", rosa);
		paneles.add("Red", rojo);
		paneles.add("Blue", azul);
		paneles.add("Cyan", cian);
		paneles.add("Green", verde);
		frame.getContentPane().add(paneles);
		rellenaColor();
		for(int i=0;i<7;i++) {
			paneles.setBackgroundAt(i, colores[i]);
			System.out.println(amarillo.getName());
		}
		for(int i=0;i<7;i++) {
			paneles.getComponentAt(i).setBackground(colores[i]);
		}
		paneles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				System.out.println(paneles.getSelectedComponent().getName());
			}
		});
		
	}

}
