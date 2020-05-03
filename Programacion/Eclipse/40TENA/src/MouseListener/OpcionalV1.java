package MouseListener;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class OpcionalV1 {

	
	private JFrame frame;
	private ArrayList ArrayBotones;
	private ArrayList ArrayImagenes;
	private int ArrayRepeticiones[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionalV1 window = new OpcionalV1();
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
	public OpcionalV1() {
		initialize();
	}
	
	public void inicia() {
		ArrayImagenes=new ArrayList();
		for(int i=0;i<16;i++) {
			ArrayImagenes.add(i);
		}
		ArrayRepeticiones=new int [15];
		for(int i=0;i<16;i++) {
			ArrayRepeticiones[i]=0;
		}
	}
	public void Distribuye(JButton b) {
		for(int i=0;i<ArrayImagenes.size();i++) {
			int valorRandom=(int) (Math.random()*(ArrayImagenes.size()-0+1)+0); 
			if(ArrayRepeticiones[valorRandom]<2) {
				ArrayRepeticiones[valorRandom]++;
				((AbstractButton) ArrayBotones.get(i)).setIcon(new ImageIcon(Opcional.class.getResource(ArrayImagenes.get(valorRandom).toString())));

			}
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 394, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayBotones=new ArrayList();
		JButton carta1 = new JButton("");
		carta1.setBounds(10, 42, 81, 112);
		
		JButton carta2 = new JButton("");
		carta2.setBounds(101, 42, 81, 112);
		
		JButton carta3 = new JButton("");
		carta3.setBounds(192, 42, 81, 112);
		
		JButton carta4 = new JButton("");
		carta4.setBounds(283, 42, 81, 112);
		
		JButton carta5 = new JButton("");
		carta5.setBounds(10, 165, 81, 112);
		
		JButton carta6 = new JButton("");
		carta6.setBounds(101, 165, 81, 112);
		
		JButton carta7 = new JButton("");
		carta7.setBounds(192, 165, 81, 112);
		
		JButton carta8 = new JButton("");
		carta8.setBounds(283, 165, 81, 112);
		
		JButton carta9 = new JButton("");
		carta9.setBounds(10, 286, 81, 112);
		
		JButton carta10 = new JButton("");
		carta10.setBounds(101, 286, 81, 112);
		
		JButton carta11 = new JButton("");
		carta11.setBounds(192, 286, 81, 112);
		
		JButton carta12 = new JButton("");
		carta12.setBounds(283, 286, 81, 112);

		JButton carta13 = new JButton("");
		carta13.setBounds(10, 409, 81, 112);
		
		JButton carta14 = new JButton("");
		carta14.setBounds(101, 409, 81, 112);
		
		JButton carta15 = new JButton("");
		carta15.setBounds(192, 409, 81, 112);
		
		JButton carta16 = new JButton("");
		carta16.setBounds(283, 409, 81, 112);
		
		ArrayBotones.add(carta1);ArrayBotones.add(carta2);ArrayBotones.add(carta3);
		ArrayBotones.add(carta4);ArrayBotones.add(carta5);ArrayBotones.add(carta6);
		ArrayBotones.add(carta7);ArrayBotones.add(carta8);ArrayBotones.add(carta9);
		ArrayBotones.add(carta10);ArrayBotones.add(carta11);ArrayBotones.add(carta12);
		ArrayBotones.add(carta13);ArrayBotones.add(carta14);ArrayBotones.add(carta15);ArrayBotones.add(carta16);
		
		for(int i=0;i<16;i++) {
			((JButton) ArrayBotones.get(i)).setIcon(new ImageIcon(Opcional.class.getResource("/Imagenes/carta")));
			frame.getContentPane().add((JButton) ArrayBotones.get(i));
		}
		
		for(int i=0;i<16;i++) {
			((Component) ArrayBotones.get(i)).setName(String.valueOf(i));
		}
		for(int i=0;i<ArrayBotones.size();i++) {
			((JButton) ArrayBotones.get(i)).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
	                String nombre = (((JButton) e.getSource())).getName();
	                int numcarta = Integer.parseInt(nombre);
	                Distribuye((JButton) ArrayBotones.get(numcarta));
				}
			});
		}
		inicia();
		
	}

}
