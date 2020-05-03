

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class Tabla3 {
	
	private JFrame frame;
	private JTable tabla;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField id;
	private JButton nuevo;
	private String at2;
	private JComboBox cb1;
	private JComboBox cb2;
	private JComboBox cb3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla3 window = new Tabla3();
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
	public Tabla3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void Limpiar() {
		id.setText("");
		tf1.setText("");
		tf2.setText("");
		cb1.setSelectedIndex(0);
		cb2.setSelectedIndex(0);
		cb3.setSelectedItem(2000);
	}
	public void comprueba() {
		GregorianCalendar calendar = new GregorianCalendar();
		if (calendar.isLeapYear((int) cb3.getSelectedItem())) {
			cb2.removeAllItems();
			for(int i=1;i<=29;i++) {
				cb2.addItem(i);
			}
		}
		else {
			cb2.removeAllItems();
			for(int i=1;i<=28;i++) {
				cb2.addItem(i);
			}
		}
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton nuevo = new JButton("Aceptar Cambio");
		nuevo.setBounds(319, 51, 167, 23);
		frame.getContentPane().add(nuevo);
		nuevo.setVisible(false);
		
		tabla=new JTable();
		tabla.setModel(new DefaultTableModel(
				new Object [][] {},
				new String [] {"id","Nombre","Apellidos","Nacimiento"}
							));
		tabla.setActionMap(null);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 151, 534, 177);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 80, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(76, 52, 110, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(76, 77, 110, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nacimiento");
		lblNewLabel_2.setBounds(214, 30, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		cb1 = new JComboBox();
		cb1.setBounds(283, 27, 89, 20);
		frame.getContentPane().add(cb1);
		String [] Meses= new String [] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		for(int i=0;i<12;i++) {
			cb1.addItem(Meses[i]);
		}
		
		cb2 = new JComboBox();
		cb2.setBounds(382, 27, 46, 20);
		frame.getContentPane().add(cb2);
		for(int i=1;i<=31;i++) {
			cb2.addItem(i);
		}
		
		cb3 = new JComboBox();
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.getSelectedItem().equals("Febrero")) {
				comprueba();
				}
			}
		});
		cb3.setBounds(438, 27, 66, 20);
		frame.getContentPane().add(cb3);
		for(int i=1920;i<=2020;i++) {
			cb3.addItem(i);
		}
		cb3.setSelectedItem(2000);
		
		//Borrar Filas 
		JButton borrar = new JButton("Borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				((DefaultTableModel) tabla.getModel()).removeRow(tabla.getSelectedRow());;
				}catch(IndexOutOfBoundsException a) {
					JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila para borrar");
				}
				Limpiar();
			}
		});
		borrar.setBounds(270, 117, 89, 23);
		frame.getContentPane().add(borrar);
		
		//Editar Filas
		JButton editar = new JButton("Editar");
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					id.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 0));
					tf1.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
					tf2.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
					
					String Fecha=(String) tabla.getValueAt(tabla.getSelectedRow(), 3);
					int primer=Fecha.indexOf("-");
					int segundo=Fecha.indexOf("-", primer+1);
					
					String at1=Fecha.substring(0,primer);
					String at2=Fecha.substring(primer+1, segundo);
					String at3=Fecha.substring(segundo+1);
					
					cb1.setSelectedItem(at1);
					cb2.setSelectedItem(Integer.parseInt(at3));
					cb3.setSelectedItem(Integer.parseInt(at2));
					
					nuevo.setVisible(true);
				}catch(IndexOutOfBoundsException a) {
					JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila para editar");
				}
				
				
			}
		});
		editar.setBounds(369, 117, 76, 23);
		frame.getContentPane().add(editar);
		
		//Añadir filas 
		JButton add = new JButton("Añadir");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((DefaultTableModel) tabla.getModel()).addRow(new Object [] {id.getText(),tf1.getText(),tf2.getText(),cb1.getSelectedItem()+"-"+cb3.getSelectedItem()+"-"+cb2.getSelectedItem()});
				Limpiar();
			}
		});
		add.setBounds(455, 117, 89, 23);
		frame.getContentPane().add(add);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(76, 27, 110, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GregorianCalendar calendar = new GregorianCalendar();
				if(cb1.getSelectedIndex()==0 || cb1.getSelectedIndex()==2 || cb1.getSelectedIndex()==4 || cb1.getSelectedIndex()==6 || cb1.getSelectedIndex()==7 || cb1.getSelectedIndex()==9 || cb1.getSelectedIndex()==11) {
					cb2.removeAllItems();
					for(int i=1;i<=31;i++) {
					cb2.addItem(i);
				}
				}else if(cb1.getSelectedItem().equals("Febrero")) {
					comprueba();
				}else {
					cb2.removeAllItems();
					for(int i=1;i<=30;i++) {
						cb2.addItem(i);
					}
					
				}
			}
		});
		
		//Aceptar los cambios
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabla.setValueAt(id.getText(), tabla.getSelectedRow(), 0);
				tabla.setValueAt(tf1.getText(), tabla.getSelectedRow(), 1);
				tabla.setValueAt(tf2.getText(), tabla.getSelectedRow(), 2);
				tabla.setValueAt(cb1.getSelectedItem()+"-"+cb3.getSelectedItem()+"-"+cb2.getSelectedItem(),tabla.getSelectedRow(),3);
				nuevo.setVisible(false);
				Limpiar();
			}
		});
	}
}
