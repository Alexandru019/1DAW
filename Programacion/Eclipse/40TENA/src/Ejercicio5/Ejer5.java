package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Ejer5 extends JFrame {
	private JButton btnGuardar;
	private JRadioButton radioH; 
	private JRadioButton radioF; 
	private JComboBox Distrito;
	private JMenuBar barraMenu;
	private JMenu menuArchivo;
	private JMenu menuEditar;
    private JMenuItem itmSalir;
    private JMenuItem itmGuardar;
    private JMenuItem itmAbrir;
	   
	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Apellidos;
	private JTextField FechaNac;
	private JTextField Direccion;
	private JTextField Telefono;
	private JTextField Peso;
	private JTextField Talla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer5 frame = new Ejer5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void programaEventos() {
	       ActionListener ejemploA = new ActionListener() {
	           public void actionPerformed(ActionEvent e) {
	        	   System.exit(0);
	           }  
	       };
	       this.itmSalir.addActionListener(ejemploA);
	       ActionListener guardar = new ActionListener() {
	    	   public void actionPerformed(ActionEvent e) {
	    		   JFileChooser fc=new JFileChooser();
	        		 
	        		int seleccion=fc.showSaveDialog(contentPane);
	        		 
	        		if(seleccion==JFileChooser.APPROVE_OPTION){
	        		 
	        		
	        		    File fichero=fc.getSelectedFile();
	        		 
	        		    try(FileWriter fw=new FileWriter(fichero)){
	        		    	fw.write("Nombre :\n");
    	        		    fw.write(Nombre.getText()+"\n");
    	        		    fw.write("Apellidos :\n");
    	        		    fw.write(Apellidos.getText()+"\n");
    	        		    fw.write("Fecha de NaciREGISTRO DE ALUMNOn");
    	        		    fw.write(FechaNac.getText()+"\n");
    	        		    fw.write("Distrito :\n");
    	        		    fw.write("Dirección :\n");
    	        		    fw.write(Direccion.getText()+"\n");
    	        		    fw.write("Teléfono :\n");
    	        		    fw.write(Telefono.getText()+"\n");
    	        		    fw.write("Peso :\n");
    	        		    fw.write(Peso.getText()+"\n");
    	        		    fw.write("Talla :\n");
    	        		    fw.write(Talla.getText()+"\n");
    	        		    fw.write("Sexo :\n");
    	        		    if(radioH.isSelected()) {
    	        		    	fw.write("Masculino \n");
    	        		    }else
    	        		    	fw.write("Femenino \n");
    	        		        
    	        		    	

    	        		 
    	        		    } catch (IOException e1) {
    	        		        e1.printStackTrace();
    	        		    }
    	        		 
    	        		}
    	     
			
		}
    	   
       };
       this.itmGuardar.addActionListener(guardar);
   }
	
	 public void init() {
	       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	       this.barraMenu.add(this.menuArchivo);
	       this.barraMenu.add(this.menuEditar);
	       this.menuArchivo.add(this.itmAbrir);
	       this.menuArchivo.add(this.itmGuardar);
	       this.menuArchivo.add(this.itmSalir);
	       this.setJMenuBar(this.barraMenu);
	       this.setVisible(true);
	       this.programaEventos();
	   }

	/**
	 * Create the frame.
	 */
	public Ejer5() {
		
		super("Registro de Alumno");
		this.barraMenu  = new JMenuBar();  
		this.menuArchivo = new JMenu("Archivo");
		this.menuEditar = new JMenu("Editar");
		this.itmSalir = new JMenuItem("Salir");
		this.itmGuardar = new JMenuItem("Guardar");
		this.itmAbrir = new JMenuItem("Abrir");
		this.init();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE ALUMNO");
		lblNewLabel.setBounds(185, 11, 230, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre :");
		lblNewLabel_1.setBounds(10, 50, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos :");
		lblNewLabel_2.setBounds(10, 80, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nac.");
		lblNewLabel_3.setBounds(10, 110, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Distrito :");
		lblNewLabel_4.setBounds(10, 140, 75, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n :");
		lblNewLabel_5.setBounds(10, 170, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tel\u00E9fono :");
		lblNewLabel_6.setBounds(10, 200, 75, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Peso :");
		lblNewLabel_7.setBounds(10, 230, 75, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Talla :");
		lblNewLabel_8.setBounds(10, 260, 75, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sexo :");
		lblNewLabel_9.setBounds(10, 290, 75, 14);
		contentPane.add(lblNewLabel_9);
		
		Nombre = new JTextField();
		Nombre.setBounds(166, 47, 238, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Apellidos = new JTextField();
		Apellidos.setColumns(10);
		Apellidos.setBounds(166, 77, 238, 20);
		contentPane.add(Apellidos);
		
		FechaNac = new JTextField();
		FechaNac.setColumns(10);
		FechaNac.setBounds(166, 107, 238, 20);
		contentPane.add(FechaNac);
		
		JComboBox Distrito = new JComboBox();
		Distrito.setBounds(166, 137, 238, 20);
		contentPane.add(Distrito);
		Distrito.addItem("New York");
		Distrito.addItem("Oklahoma");
		Distrito.addItem("New Jersey");
		
		Direccion = new JTextField();
		Direccion.setColumns(10);
		Direccion.setBounds(166, 167, 238, 20);
		contentPane.add(Direccion);
		
		Telefono = new JTextField();
		Telefono.setColumns(10);
		Telefono.setBounds(166, 197, 238, 20);
		contentPane.add(Telefono);
		
		Peso = new JTextField();
		Peso.setColumns(10);
		Peso.setBounds(166, 227, 238, 20);
		contentPane.add(Peso);
		
		Talla = new JTextField();
		Talla.setColumns(10);
		Talla.setBounds(166, 257, 238, 20);
		contentPane.add(Talla);
		
		JRadioButton radioH = new JRadioButton("Masculino");
		radioH.setBounds(166, 286, 109, 23);
		contentPane.add(radioH);
		
		JRadioButton radioF = new JRadioButton("Femenino");
		radioF.setBounds(295, 286, 109, 23);
		contentPane.add(radioF);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(166, 349, 89, 23);
		contentPane.add(btnGuardar);
		
		ButtonGroup GrupoSexo = new ButtonGroup();
		GrupoSexo.add(radioH);
		GrupoSexo.add(radioF);
	}
}
