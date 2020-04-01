package Ejercicio3;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Jfilechooser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jfilechooser window = new Jfilechooser();
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
	public Jfilechooser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 	frame = new JFrame();
	        frame.setBounds(100, 100, 407, 727);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	        
	        ButtonGroup grupo = new ButtonGroup();
	        
	        JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel.setBounds(54, 42, 217, 14);
	        frame.getContentPane().add(lblNewLabel);

	        JRadioButton rdbtnNewRadioButton = new JRadioButton("Linux");
	        rdbtnNewRadioButton.setBounds(54, 119, 89, 23);
	        frame.getContentPane().add(rdbtnNewRadioButton);

	        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Windows");
	        rdbtnNewRadioButton_1.setBounds(54, 80, 89, 23);
	        frame.getContentPane().add(rdbtnNewRadioButton_1);

	        JRadioButton rdbtnMac = new JRadioButton("Mac");
	        rdbtnMac.setBounds(54, 159, 89, 23);
	        frame.getContentPane().add(rdbtnMac);
	        
	        grupo.add(rdbtnNewRadioButton);
	        grupo.add(rdbtnNewRadioButton_1);
	        grupo.add(rdbtnMac);
	        
	        JSeparator separator = new JSeparator();
	        separator.setBounds(10, 204, 371, 14);
	        frame.getContentPane().add(separator);
	        
	        JLabel lblEligeTuEspecialidad = new JLabel("Elige tu especialidad");
	        lblEligeTuEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblEligeTuEspecialidad.setBounds(54, 229, 167, 14);
	        frame.getContentPane().add(lblEligeTuEspecialidad);
	        
	        JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
	        chckbxProgramacion.setBounds(54, 274, 136, 23);
	        frame.getContentPane().add(chckbxProgramacion);
	        
	        JCheckBox chckbxDiseoGrafico = new JCheckBox("Diseño grafico");
	        chckbxDiseoGrafico.setBounds(54, 322, 136, 23);
	        frame.getContentPane().add(chckbxDiseoGrafico);
	        
	        JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
	        chckbxAdministracion.setBounds(54, 377, 136, 23);
	        frame.getContentPane().add(chckbxAdministracion);
	        
	        JSeparator separator_1 = new JSeparator();
	        separator_1.setBounds(10, 429, 371, 14);
	        frame.getContentPane().add(separator_1);
	        
	        JLabel lblHorasQueDedicas = new JLabel("Horas que dedicas en el ordenador");
	        lblHorasQueDedicas.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblHorasQueDedicas.setBounds(54, 455, 271, 14);
	        frame.getContentPane().add(lblHorasQueDedicas);
	        
	        JLabel jsliderValue = new JLabel("");
	        jsliderValue.setBounds(54, 523, 31, 24);
	        frame.getContentPane().add(jsliderValue);
	        
	        JSlider slider = new JSlider();
	        slider.setValue(4);
	        slider.setMaximum(10);
	        slider.setBounds(110, 523, 145, 26);
	        frame.getContentPane().add(slider);
	        
	        JButton btnGenerar = new JButton("Generar");
	        btnGenerar.setBounds(54, 617, 89, 23);
	        frame.getContentPane().add(btnGenerar);
	        
	        JButton btnCargar = new JButton("Cargar");
	        btnCargar.setBounds(236, 617, 89, 23);
	        frame.getContentPane().add(btnCargar);
	        
	        
	        jsliderValue.setText(slider.getValue() + "");
	        slider.addChangeListener(new ChangeListener() {
	        	public void stateChanged(ChangeEvent arg0) {
	        		jsliderValue.setText(slider.getValue() + "");
	        	}
	        });
	        
	        btnGenerar.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent arg0) {
	        		JFileChooser fc=new JFileChooser();
	        		 
	        		int seleccion=fc.showSaveDialog(frame);
	        		 
	        		if(seleccion==JFileChooser.APPROVE_OPTION){
	        		 
	        		
	        		    File fichero=fc.getSelectedFile();
	        		 
	        		    try(FileWriter fw=new FileWriter(fichero)){
	        		 
	        		        
	        		    	fw.write("S.O Preferido\n");
	        		    	if(rdbtnNewRadioButton.isSelected()) fw.write("Linux\n");
	        		    	else if (rdbtnNewRadioButton_1.isSelected()) fw.write("Windows\n");
	        		    	else if(rdbtnMac.isSelected()) fw.write("Mac\n");
	        		    	
	        		    	fw.write("Especialidad en\n");
	        		    	if(chckbxProgramacion.isSelected()) fw.write("Progamacion\n");
	        		    	if(chckbxDiseoGrafico.isSelected()) fw.write("Diseño grafico\n");
	        		    	if(chckbxAdministracion.isSelected()) fw.write("Administracion\n");
	        		    	
	        		    	fw.write("Horas dedicadas\n");
	        		    	fw.write(slider.getValue()+"");

	        		 
	        		    } catch (IOException e1) {
	        		        e1.printStackTrace();
	        		    }
	        		 
	        		}
	        	}
	        });
	        
	        btnCargar.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent arg0) {
	        		JFileChooser fc=new JFileChooser();
	        		int seleccion=fc.showOpenDialog(frame);
	        	
	        		if(seleccion==JFileChooser.APPROVE_OPTION){
	        	
	        		    File fichero=fc.getSelectedFile();
	        		 
	        		    try(FileReader fr=new FileReader(fichero)){
	        		        String cadena="";
	        		        int valor=fr.read();
	        		        while(valor!=-1){
	        		            cadena=cadena+(char)valor;
	        		            valor=fr.read();
	        		            System.out.println(cadena);
	        		            if(cadena.contains("Linux")) rdbtnNewRadioButton.setSelected(true);
	        		            else if (cadena.contains("Windows")) rdbtnNewRadioButton_1.setSelected(true);
	        		            else if(cadena.contains("Mac")) rdbtnMac.setSelected(true);
	        		            
	        		            if(cadena.contains("Progamacion")) chckbxProgramacion.setSelected(true);
	        		            if(cadena.contains("Diseño grafico")) chckbxDiseoGrafico.setSelected(true);
	        		            if(cadena.contains("Administracion")) chckbxAdministracion.setSelected(true);
		        		    	
	        		        }
	        		        slider.setValue(Integer.parseInt(cadena.substring(cadena.length()-1)));
	        		        
	        		    } catch (IOException e1) {
	        		        e1.printStackTrace();
	        		    }
	        		}
	        	}
	        });
	}
}