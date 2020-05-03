package MouseListener;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.ibm.icu.util.Calendar;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Opcional {

	private JFrame frame;
	private ArrayList names;
	private int index;
	private ArrayList ct;
	private int aux;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcional window = new Opcional();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws InterruptedException 
	 */
	public Opcional() throws InterruptedException {
		initialize();
	}
	
	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	private void muestraCarta(JButton btn) {
		
			int valorRandom=(int) (Math.random()*(index-0+1)+0); 
			btn.setIcon(new ImageIcon(Opcional.class.getResource(names.get(valorRandom).toString())));
			names.remove(valorRandom);
			index--;
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws InterruptedException 
	 */
	private void initialize() throws InterruptedException {
		frame = new JFrame();
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 391, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		index=15;
		names=new ArrayList();
		ct=new ArrayList();
		for(int i=0;i<2;i++) {
			names.add("/Imagenes/objetivo.png");
			names.add("/Imagenes/martillo.png");
			names.add("/Imagenes/carrito.png");
			names.add("/Imagenes/moneda.png");
			names.add("/Imagenes/barril.png");
			names.add("/Imagenes/corona.png");
			names.add("/Imagenes/gato.png");
			names.add("/Imagenes/pata.png");
		}
		
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 426, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Reiniciar");
		mnNewMenu.add(mntmNewMenuItem);
		
		ct.add(carta1);ct.add(carta2);ct.add(carta3);ct.add(carta4);ct.add(carta5);ct.add(carta6);ct.add(carta7);ct.add(carta8);
		ct.add(carta9);ct.add(carta10);ct.add(carta11);ct.add(carta12);ct.add(carta13);ct.add(carta14);ct.add(carta15);ct.add(carta16);
		
		for(int i=0;i<16;i++) {
			((JButton) ct.get(i)).setIcon(new ImageIcon(Opcional.class.getResource("/Imagenes/cartas.png")));
			frame.getContentPane().add((JButton) ct.get(i));
		}
			
		for(int i=0;i<16;i++) {
			((Component) ct.get(i)).setName(String.valueOf(i));
		}
		for(aux=0;aux<ct.size();aux++) {
			((JButton) ct.get(aux)).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
	                String nombre = (((JButton) e.getSource())).getName();
	                int numcarta = Integer.parseInt(nombre);
	                muestraCarta((JButton) ct.get(numcarta));
				}
			});
		}
		
		
		
	}
}
