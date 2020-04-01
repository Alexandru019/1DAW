package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ejer4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer4 frame = new Ejer4();
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
	public Ejer4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label1 = new JLabel("Usabilidad Web");
		Label1.setBounds(141, 11, 137, 14);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("Nombre");
		Label2.setBounds(10, 43, 46, 14);
		contentPane.add(Label2);
		
		JLabel Label3 = new JLabel("Apellidos");
		Label3.setBounds(10, 68, 67, 14);
		contentPane.add(Label3);
		
		JLabel Label4 = new JLabel("Domicilio");
		Label4.setBounds(10, 96, 67, 14);
		contentPane.add(Label4);
		
		textField = new JTextField();
		textField.setBounds(141, 40, 240, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 65, 240, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 93, 240, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Label5 = new JLabel("Provincia");
		Label5.setBounds(10, 124, 67, 14);
		contentPane.add(Label5);
		
		JLabel Label6 = new JLabel("Edad");
		Label6.setBounds(10, 152, 46, 14);
		contentPane.add(Label6);
		
		JLabel Label7 = new JLabel("Sexo");
		Label7.setBounds(10, 180, 46, 14);
		contentPane.add(Label7);
		
		JComboBox Provincias = new JComboBox();
		Provincias.setBounds(141, 124, 240, 20);
		contentPane.add(Provincias);
		Provincias.addItem("Valencia");
		Provincias.addItem("Castellón");
		Provincias.addItem("Alicante");
		
		JComboBox Edad = new JComboBox();
		Edad.setBounds(141, 149, 240, 20);
		contentPane.add(Edad);
		Edad.addItem("18");
		Edad.addItem("19");
		Edad.addItem("20");
		Edad.addItem("21");
		
		JRadioButton Hombre = new JRadioButton("Hombre");
		Hombre.setBounds(141, 176, 109, 23);
		contentPane.add(Hombre);
		
		JRadioButton Mujer = new JRadioButton("Mujer");
		Mujer.setBounds(272, 176, 109, 23);
		contentPane.add(Mujer);
		
		ButtonGroup sexo=new ButtonGroup();
		sexo.add(Mujer);
		sexo.add(Hombre);
		
		JLabel Label8 = new JLabel("Preferencias");
		Label8.setBounds(10, 204, 82, 14);
		contentPane.add(Label8);
		
		JCheckBox sql = new JCheckBox("MySQL");
		sql.setBounds(20, 225, 97, 23);
		contentPane.add(sql);
		
		JCheckBox java = new JCheckBox("Java");
		java.setBounds(20, 251, 97, 23);
		contentPane.add(java);
		
		JCheckBox xml = new JCheckBox("XML");
		xml.setBounds(20, 277, 97, 23);
		contentPane.add(xml);
		
		JCheckBox phyton = new JCheckBox("Phyton");
		phyton.setBounds(20, 303, 97, 23);
		contentPane.add(phyton);
		
		JCheckBox service = new JCheckBox("Web services");
		service.setBounds(205, 225, 125, 23);
		contentPane.add(service);
		
		JCheckBox php = new JCheckBox("PHP 5");
		php.setBounds(205, 251, 97, 23);
		contentPane.add(php);
		
		JCheckBox css = new JCheckBox("CSS");
		css.setBounds(205, 277, 97, 23);
		contentPane.add(css);
		
		JCheckBox movil = new JCheckBox("Web m\u00F3vil");
		movil.setBounds(205, 303, 97, 23);
		contentPane.add(movil);
		
		ButtonGroup preferencias=new ButtonGroup();
		preferencias.add(movil);
		preferencias.add(css);
		preferencias.add(php);
		preferencias.add(service);
		preferencias.add(phyton);
		preferencias.add(xml);
		preferencias.add(java);
		preferencias.add(sql);
		
		JLabel Label9 = new JLabel("Comentarios");
		Label9.setBounds(10, 371, 82, 14);
		contentPane.add(Label9);
		
		JLabel Label10 = new JLabel("Contactar");
		Label10.setBounds(10, 457, 82, 14);
		contentPane.add(Label10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(165, 353, 216, 50);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(165, 438, 216, 50);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc=new JFileChooser();
       		 
        		int seleccion=fc.showSaveDialog(contentPane);
        		 
        		if(seleccion==JFileChooser.APPROVE_OPTION){
        		 
        		
        		    File fichero=fc.getSelectedFile();
        		 
        		    try(FileWriter fw=new FileWriter(fichero)){
        		 
        		        
        		    	fw.write("Nombre : "+textField.getText()+" \n");
        		    	fw.write("Apellidos : "+textField_1.getText()+" \n");
        		    	fw.write("Domicilio : "+textField_2.getText()+"\n");
        		    	fw.write("Provincia : "+Provincias.getSelectedItem()+"\n");
        		    	fw.write("Edad : "+Edad.getSelectedItem()+"\n");
        		    	fw.write("Sexo : ");
        		    		if(Hombre.isSelected()) {
        		    			fw.write("Hombre \n");
        		    		}else {
        		    			fw.write("Mujer \n");
        		    		}
        		    	fw.write("Preferencia : ");
	        		    	if(sql.isSelected()) 
	    		    			fw.write("MySQL \n");
	        		    	if(java.isSelected()) 
	    		    			fw.write("Java \n");
	        		    	if(xml.isSelected()) 
	    		    			fw.write("XML \n");
	        		    	if(movil.isSelected()) 
	    		    			fw.write("Web móvil \n");
	        		    	if(service.isSelected()) 
	    		    			fw.write("Web services \n");
	        		    	if(phyton.isSelected()) 
	    		    			fw.write("Phyton \n");
	        		    	if(php.isSelected()) 
	    		    			fw.write("PHP 5 \n");
	        		    	if(css.isSelected()) 
	    		    			fw.write("CSS \n");
	    		    		
        		    	fw.write("Comentarios : "+textArea.getText()+"\n");
        		    	fw.write("Comentarios : "+textArea_1.getText()+"\n");
        		    	
        		 
        		    } catch (IOException e1) {
        		        e1.printStackTrace();
        		    }
        		}
			}
		});
		btnNewButton.setBounds(87, 527, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textArea.setText("");
				textArea_1.setText("");
				sexo.clearSelection();
				sql.setSelected(true);
				Edad.setSelectedIndex(0);
				Provincias.setSelectedIndex(0);
			}
		});
		btnCancelar.setBounds(241, 527, 89, 23);
		contentPane.add(btnCancelar);
	}
}
