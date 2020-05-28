package PROYECTO1;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tablita {

	private JFrame frame;
	private JTable tabla;
	private JTextField modelo;
	private JComboBox marca;
	private JTextField id;
	private JButton nuevo;
	private JTextField precio;
	private JSlider stock;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablita window = new tablita();
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
	public tablita() {
		initialize();
		frame.addWindowListener(new WindowAdapter() {
			   public void windowClosing(WindowEvent e) {
				   cerrar();
			   }
		});
	}
	public void cerrar() {
		int opc=JOptionPane.showConfirmDialog(frame, "¿Quieres cerrar el programa?");
		if(opc!=2) {
			if(opc==0) {
				int opc2=JOptionPane.showConfirmDialog(frame, "¿Quieres guardar los cambios?");
				if(opc2!=2) {
					if(opc2==0) {
						GuardaArchivo();
					}
					System.exit(0);
				}
			}
		}
	}
	public void GuardaArchivo() {
		JFileChooser fc=new JFileChooser();
  		 
		int seleccion=fc.showSaveDialog(frame);
		 
		if(seleccion==JFileChooser.APPROVE_OPTION){
		 
		
		    File fichero=fc.getSelectedFile();
		 
		    try(FileWriter fw=new FileWriter(fichero)){
		    	fw.write("ID-Marca-Modelo-Precio-Stock\n");
		    	for(int a=0;a<tabla.getRowCount();a++) {
    		    	for(int i=0;i<tabla.getColumnCount();i++) {
    		    		fw.write((String) tabla.getValueAt(a, i).toString());
    		    		if(i<tabla.getColumnCount()-1) {
    		    			fw.write("-");
    		    		}
    		    	}
		    		fw.write("\n");
		    	}
		    	JOptionPane.showMessageDialog(frame, "Datos Guardados con Éxito");

    		 
    		    } catch (IOException e1) {
    		        JOptionPane.showMessageDialog(frame, "Problemas guardando el archivo");
    		    }
		}
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void Limpiar() {
		id.setText("");
		marca.setSelectedIndex(0);
		modelo.setText("");
		precio.setText("");
		stock.setValue(15);
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 428);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Tabla Cachimbas");
		
		String Columnas1 []= {"ID","Marca","Modelo","Precio €","Stock"};
		tabla=new JTable();
		tabla.setModel(new DefaultTableModel(new Object[][] {},Columnas1));
		tabla.setActionMap(null);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 131, 450, 175);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo");
		lblNewLabel_1.setBounds(10, 80, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		modelo = new JTextField();
		modelo.setBounds(76, 77, 110, 20);
		frame.getContentPane().add(modelo);
		modelo.setColumns(10);
		modelo.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(76, 27, 110, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		marca = new JComboBox();
		marca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(marca.getSelectedIndex()==0) {
					modelo.setEnabled(false);
				}else {
					modelo.setEnabled(true);
				}
			}
		});
		marca.setBounds(76, 52, 110, 20);
		frame.getContentPane().add(marca);
		
		marca.addItem("SELECCIONE");marca.addItem("Wookah");marca.addItem("Alpha");marca.addItem("VZ HOOKAH");marca.addItem("Embery");marca.addItem("Kayah");marca.addItem("Hardwood");
		
		precio = new JTextField();
		precio.setBounds(76, 101, 110, 20);
		frame.getContentPane().add(precio);
		precio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setBounds(10, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel infoStock = new JLabel("Stock : ");
		infoStock.setBounds(273, 30, 65, 14);
		frame.getContentPane().add(infoStock);
		
		stock = new JSlider();
		stock.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				infoStock.setText("Stock : "+stock.getValue());
			}
		});
		stock.setValue(15);
		stock.setPaintLabels(true);
		stock.setPaintTicks(true);
		stock.setMinorTickSpacing(1);
		stock.setMaximum(30);
		stock.setMajorTickSpacing(5);
		stock.setBounds(208, 55, 200, 53);
		frame.getContentPane().add(stock);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem abrir = new JMenuItem("Abrir");
		abrir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fc=new JFileChooser();
				int seleccion=fc.showOpenDialog(frame);
				File fichero=fc.getSelectedFile();
			    try {
				    FileReader fr = new FileReader(fichero);
				    BufferedReader br = new BufferedReader(fr);
				    String linea;
				    linea=br.readLine();
				    tabla.setModel(new DefaultTableModel(new Object [][] {},Columnas1));
				  while((linea = br.readLine()) != null) {
				    	  int g1=linea.indexOf("-");
				    	  int g2=linea.indexOf("-", g1+1);
				    	  int g3=linea.indexOf("-", g2+1);
				    	  int g4=linea.indexOf("-", g3+1);
				    	((DefaultTableModel) tabla.getModel()).addRow(new Object [] {linea.substring(0, g1),linea.substring(g1+1,g2),linea.substring(g2+1, g3),linea.substring(g3+1,g4),Integer.parseInt(linea.substring(g4+1))});
				    	 
				    }
				    
				    fr.close();
				    JOptionPane.showMessageDialog(frame, "Datos cargados con éxito");
			    }
			    catch(Exception a) {
			    	 JOptionPane.showMessageDialog(frame, "Problemas al cargar la tabla");
			    }
			}
		});
		mnNewMenu.add(abrir);
		
		JMenuItem guardar = new JMenuItem("Guardar");
		guardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				GuardaArchivo();
			}
		});
		mnNewMenu.add(guardar);
		
		JMenuItem nuevatabla = new JMenuItem("Nuevo");
		nuevatabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int opc=JOptionPane.showConfirmDialog(frame, "¿Quieres guardar los cambios?");
				if(opc!=2) {
					if(opc==0) {
						GuardaArchivo();
					}
					JOptionPane.showMessageDialog(frame, "Nuevo Archivo Creado");
					Limpiar();
					tabla.setModel(new DefaultTableModel(new Object [][] {},Columnas1));
				}
			}
		});
		mnNewMenu.add(nuevatabla);
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				cerrar();
			}
		});
		mnNewMenu.add(salir);
		
		
		
		
		
		//Aceptar los cambios
		JButton nuevo = new JButton("Aceptar Cambio");
		nuevo.setBounds(228, 317, 167, 23);
		frame.getContentPane().add(nuevo);
		nuevo.setVisible(false);
		
		//Añadir filas
		JButton add = new JButton("Añadir");
		add.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				if(id.getText().isEmpty() || marca.getSelectedIndex()==0 || modelo.getText().isEmpty() || precio.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "No puedes dejar campos vacios");
				}else {
					try {
						((DefaultTableModel) tabla.getModel()).addRow(new Object [] {id.getText(),marca.getSelectedItem(),modelo.getText(),Double.parseDouble(precio.getText()),stock.getValue()});
						Limpiar();
					}catch(NumberFormatException a) {
						JOptionPane.showMessageDialog(frame, "El campo precio está mal introducido");
					}
					
				}
			}
		});
		add.setBounds(170, 317, 89, 23);
		frame.getContentPane().add(add);
		
		
		//Editar Filas
		JButton editar = new JButton("Editar");
		editar.setBounds(368, 317, 89, 23);
		frame.getContentPane().add(editar);
		
		
		//Borrar Filas 
		JButton borrar = new JButton("Borrar");
		borrar.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				try {
				((DefaultTableModel) tabla.getModel()).removeRow(tabla.getSelectedRow());;
				}catch(IndexOutOfBoundsException a) {
					JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila para borrar");
				}
				Limpiar();
			}
		});
		borrar.setBounds(269, 317, 89, 23);
		frame.getContentPane().add(borrar);
		
		editar.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				try {
					id.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 0));
					marca.setSelectedItem((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
					modelo.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
					precio.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 3)));
					stock.setValue((int) tabla.getValueAt(tabla.getSelectedRow(), 4));
					nuevo.setVisible(true);
					editar.setVisible(false);
					borrar.setVisible(false);
					add.setVisible(false);
				}catch(IndexOutOfBoundsException a) {
					JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila para editar");
				}
				
				
			}
		});
		
		nuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabla.setValueAt(id.getText(), tabla.getSelectedRow(), 0);
				tabla.setValueAt(marca.getSelectedItem(), tabla.getSelectedRow(), 1);
				tabla.setValueAt(modelo.getText(), tabla.getSelectedRow(), 2);
				tabla.setValueAt(precio.getText(),tabla.getSelectedRow(),3);
				tabla.setValueAt(stock.getValue(),tabla.getSelectedRow(),4);
				nuevo.setVisible(false);
				editar.setVisible(true);
				borrar.setVisible(true);
				add.setVisible(true);
				Limpiar();
			}
		});
	}
}
