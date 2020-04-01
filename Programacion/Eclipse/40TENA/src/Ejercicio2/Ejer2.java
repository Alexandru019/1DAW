package Ejercicio2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ejer2 {

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSlider slider1 = new JSlider();
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setMajorTickSpacing(10);
		slider1.setBounds(10, 36, 218, 45);
		panel.add(slider1);
		
		JSlider slider2 = new JSlider();
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.setMajorTickSpacing(10);
		slider2.setBounds(10, 136, 218, 45);
		panel.add(slider2);
		
		JLabel label1 = new JLabel("Valor :");
		label1.setBounds(103, 11, 125, 14);
		panel.add(label1);
		
		JLabel label2 = new JLabel("Valor :");
		label2.setBounds(103, 111, 125, 14);
		panel.add(label2);
		
		String [] medidas= {"Metros","Yardas"};
		SpinnerListModel modelo=new SpinnerListModel(medidas);
		SpinnerListModel modelo1=new SpinnerListModel(medidas);
		
		JSpinner spinner1 = new JSpinner(modelo);
		spinner1.setBounds(269, 36, 98, 20);
		spinner1.setValue("Metros");
		panel.add(spinner1);
		
		JSpinner spinner2 = new JSpinner(modelo1);
		spinner2.setBounds(269, 136, 98, 20);
		spinner2.setValue("Yardas");
		panel.add(spinner2);
		
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(spinner1.getValue().equals("Metros")) {
					label2.setText("Valor: "+ slider1.getValue()*1.09361);
				}else {
					label2.setText("Valor: "+ slider1.getValue()/1.09361);
				}
				label1.setText("Valor: "+ slider1.getValue());
			}
		});
		
		
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(spinner2.getValue().equals("Metros")) {
					label1.setText("Valor: "+ slider2.getValue()*1.09361);
				}else {
					label1.setText("Valor: "+ slider2.getValue()/1.09361);
				}
				label2.setText("Valor: "+ slider2.getValue());
			}
		});
		
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(spinner1.getValue().equals("Metros")) {
					spinner2.setValue("Yardas");
				}else {
					spinner2.setValue("Metros");
				}
			}
		});
	
		spinner2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(spinner2.getValue().equals("Metros")) {
					spinner1.setValue("Yardas");
				}else {
					spinner1.setValue("Metros");
				}
			}
		});
	
	}
}
