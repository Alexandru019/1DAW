package JTabbedPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ejer2 {

	private JFrame frame;
	private JTabbedPane paneles;
	private JPanel panel1;private JPanel panel2;
	private JScrollPane scrollPane1;private JScrollPane scrollPane2;
	private JButton Guardar1;private JButton Cargar1;
	private JButton Guardar2;private JButton Cargar2;
	private JTable tabla1;private JTable tabla2;
	private int numGuiones;

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
	
	public int generaTelefono() {
		String a="";
		for(int i=0;i<9;i++) {
			int valorEntero = (int)(Math.random()*(9-0+1)+0);
			a=a+valorEntero;
		}
		return Integer.parseInt(a);
	}
	public int generaEdad() {
		String a="";
		int valor1= (int)(Math.random()*(5-2+1)+2);
		int valor2 = (int)(Math.random()*(9-0+1)+0);
		a=a+valor1+valor2;
		return Integer.parseInt(a);
	}
	public int generaCod() {
		String a="";
		int valor = (int)(Math.random()*(4-1+1)+1);
		for(int i=0;i<valor;i++) {
			int valorEntero = (int)(Math.random()*(9-2+1)+2);
			a=a+valorEntero;
		}
		return Integer.parseInt(a);
	}
	public String generaNombre() {
		String[][] nombres= {
				{"Andres"},{"Luis"},{"Sebastián"},{"Alex"},{"Ismael"},{"Victor"},{"Héctor"},{"Jose"},{"Antonio"},{"Oscar"},{"Cristian"},{"Eduardo"},
				{"Maria"},{"Luisa"},{"Esther"},{"Polina"},{"Anais"},{"Elsa"},{"Lidia"},{"Vicenta"},{"Patricia"},{"Angela"},{"Carla"},{"Eva"},
		};
		int valor = (int)(Math.random()*(23-0+1)+0);
		return nombres[valor][0];
	}
	public String generaOficio() {
		String[][] oficios= {
				{"Actor/Actriz"},{"Luchador@"},{"Podador@"},{"Jardiner@"},{"Entrenador@"},{"Pianista"},{"Profesor@"},{"Escritor@"},{"Limpiador@"},{"Programador@"},{"Diseñador@"},{"Peluquer@"},
		};
		int valor = (int)(Math.random()*(11-0+1)+0);
		return oficios[valor][0];
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1=new JPanel();panel2=new JPanel();
		paneles=new JTabbedPane();
		paneles.add("Tabla1", panel1); 
		panel1.setLayout(null);
		paneles.add("Tabla2", panel2);
		panel2.setLayout(null);
		
		
		frame.getContentPane().add(paneles);
		
		Object [][] Datos1= {
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio(),generaTelefono()},
		};
		String Columnas1 []= {"Código","Nombre","Edad","Profesión","Teléfono"};
		tabla1 = new JTable(Datos1,Columnas1);
		tabla1.setModel(new DefaultTableModel(Datos1,Columnas1));
		
		Object [][] Datos2= {
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
				{generaCod(),generaNombre(),generaEdad(),generaOficio()},
		};
		String Columnas2 []= {"NºDocumento","Nombre","Edad","Profesión"};
		tabla2 = new JTable(Datos2,Columnas2);
		tabla2.setModel(new DefaultTableModel(Datos2,Columnas2));
		
		scrollPane1 = new JScrollPane(tabla1);
		scrollPane1.setBounds(10, 11, 350, 211);
		panel1.add(scrollPane1);
		
		Guardar1 = new JButton("Guardar");
		Guardar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc=new JFileChooser();
       		 
        		int seleccion=fc.showSaveDialog(frame);
        		 
        		if(seleccion==JFileChooser.APPROVE_OPTION){
        		 
        		
        		    File fichero=fc.getSelectedFile();
        		 
        		    try(FileWriter fw=new FileWriter(fichero)){
        		    	fw.write("Código-Nombre-Edad-Profesión-Teléfono \n");
        		    	for(int a=0;a<tabla1.getRowCount();a++) {
	        		    	for(int i=0;i<tabla1.getColumnCount();i++) {
	        		    		fw.write((String) tabla1.getValueAt(a, i).toString());
	        		    		if(i<tabla1.getColumnCount()-1) {
	        		    			fw.write("-");
	        		    		}
	        		    	}
        		    		fw.write("\n");
        		    	}

	        		 
	        		    } catch (IOException e1) {
	        		        e1.printStackTrace();
	        		    }
        		}
			}
		});
		Guardar1.setBounds(370, 55, 89, 23);
		panel1.add(Guardar1);
		
		Cargar1 = new JButton("Cargar");
		Cargar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int seleccion=fc.showOpenDialog(frame);
				File fichero=fc.getSelectedFile();
			    try {
				    FileReader fr = new FileReader(fichero);
				    BufferedReader br = new BufferedReader(fr);
				    numGuiones=0;
				    String linea;
				    linea=br.readLine();
				    for(int i=0;i<linea.length();i++) {
				    	if(linea.substring(i,i+1).equals("-")) {
				    		numGuiones++;
				    	}
				    }
				    if(numGuiones>3) {
				    	tabla1.setModel(new DefaultTableModel(new Object [][] {},Columnas1));
				    }
				    else {
				    	tabla1.setModel(new DefaultTableModel(new Object [][] {},Columnas2));
				    }
				  while((linea = br.readLine()) != null) {
				    	  int g1=linea.indexOf("-");
				    	  int g2=linea.indexOf("-", g1+1);
				    	  int g3=linea.indexOf("-", g2+1);
				    	  int g4=linea.indexOf("-", g3+1);
				    	  if(numGuiones==4) {
				    		  ((DefaultTableModel) tabla1.getModel()).addRow(new Object [] {linea.substring(0, g1),linea.substring(g1+1,g2),linea.substring(g2+1, g3),linea.substring(g3+1,g4),linea.substring(g4+1)});
				    	  }else {
				    		  ((DefaultTableModel) tabla1.getModel()).addRow(new Object [] {linea.substring(0, g1),linea.substring(g1+1,g2),linea.substring(g2+1, g3),linea.substring(g3+1)});
				    	  }
				    }
				    
				    fr.close();
			    }
			    catch(Exception a) {
			     System.out.println("mal");
			    }
        	}
		});
		Cargar1.setBounds(370, 135, 89, 23);
		panel1.add(Cargar1);
		
		scrollPane2 = new JScrollPane(tabla2);
		scrollPane2.setBounds(10, 11, 350, 211);
		panel2.add(scrollPane2);
		
		Guardar2 = new JButton("Guardar");
		Guardar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc=new JFileChooser();
       		 
        		int seleccion=fc.showSaveDialog(frame);
        		 
        		if(seleccion==JFileChooser.APPROVE_OPTION){
        		 
        		
        		    File fichero=fc.getSelectedFile();
        		 
        		    try(FileWriter fw=new FileWriter(fichero)){
        		    	fw.write("NºDocumento-Nombre-Edad-Profesión \n");
        		    	for(int a=0;a<tabla2.getRowCount();a++) {
	        		    	for(int i=0;i<tabla2.getColumnCount();i++) {
	        		    		fw.write((String) tabla2.getValueAt(a, i).toString());
	        		    		if(i<tabla2.getColumnCount()-1) {
	        		    			fw.write("-");
	        		    		}
	        		    	}
        		    		fw.write("\n");
        		    	}

	        		 
	        		    } catch (IOException e1) {
	        		        e1.printStackTrace();
	        		    }
        		}
			}
		});
		Guardar2.setBounds(370, 55, 89, 23);
		panel2.add(Guardar2);
		
		Cargar2 = new JButton("Cargar");
		Cargar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int seleccion=fc.showOpenDialog(frame);
				File fichero=fc.getSelectedFile();
			    try {
				    FileReader fr = new FileReader(fichero);
				    BufferedReader br = new BufferedReader(fr);
				    numGuiones=0;
				    String linea;
				    linea=br.readLine();
				    for(int i=0;i<linea.length();i++) {
				    	if(linea.substring(i,i+1).equals("-")) {
				    		numGuiones++;
				    	}
				    }
				    if(numGuiones>3) {
				    	tabla2.setModel(new DefaultTableModel(new Object [][] {},Columnas1));
				    }
				    else {
				    	tabla2.setModel(new DefaultTableModel(new Object [][] {},Columnas2));
				    }
				  while((linea = br.readLine()) != null) {
				    	  int g1=linea.indexOf("-");
				    	  int g2=linea.indexOf("-", g1+1);
				    	  int g3=linea.indexOf("-", g2+1);
				    	  int g4=linea.indexOf("-", g3+1);
				    	  if(numGuiones==4) {
				    		  ((DefaultTableModel) tabla2.getModel()).addRow(new Object [] {linea.substring(0, g1),linea.substring(g1+1,g2),linea.substring(g2+1, g3),linea.substring(g3+1,g4),linea.substring(g4+1)});
				    	  }else {
				    		  ((DefaultTableModel) tabla2.getModel()).addRow(new Object [] {linea.substring(0, g1),linea.substring(g1+1,g2),linea.substring(g2+1, g3),linea.substring(g3+1)});
				    	  }
				    }
				    
				    fr.close();
			    }
			    catch(Exception a) {
			     System.out.println("mal");
			    }
        	}
		});
		Cargar2.setBounds(370, 135, 89, 23);
		panel2.add(Cargar2);
	}
}
