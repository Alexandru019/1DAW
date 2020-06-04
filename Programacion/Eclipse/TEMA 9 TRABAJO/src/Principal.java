
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.ScrollPane;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Principal {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/TIENDA_CACHIMBAS";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";
	private JFrame frame;
	private JTabbedPane paneles;
	private JPanel inicio;private JPanel cachimba;private JPanel tienda;private JPanel repartidor;private JPanel paquete;
	private JButton btn1;
	private JScrollPane scrollPane1;
	public JTable tabla1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton siguiente;
	private JButton anterior;
	private ArrayList TodoPanel;
	private String [] Datos;
	
	private Object[]nomColumnas;
	private JButton add;
	private JButton borrar;
	private JButton editar;
	private JButton refrescar;
	
	public ArrayList envioCadena;
	
	private String accionador;
	private JButton btn3;
	private JButton btn2;
	private JButton btn4;
	private JButton btn5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
		frame.addWindowListener(new WindowAdapter() {
			   public void windowClosing(WindowEvent e) {
				   cerrar();
			   }
		});
	}
	
	public void cerrar() {
		int opc=JOptionPane.showConfirmDialog(frame, "¿Quieres cerrar el programa?");
		if(opc==0) {
			System.exit(0);
		}
		
		}
	
	public void columnitas() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName());
			ResultSetMetaData metaDatos = rs.getMetaData();
			nomColumnas = new Object[metaDatos.getColumnCount()];
			for (int i = 0; i < metaDatos.getColumnCount(); i++){
				nomColumnas[i] = metaDatos.getColumnLabel(i + 1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void registraDatos() {
		try {
			Connection conn = null;
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName());
			ResultSetMetaData metaDatos = rs.getMetaData();
			Datos=new String[metaDatos.getColumnCount()];
			 while (rs.next()) {
				 for(int a=0;a<metaDatos.getColumnCount();a++) {
					 Datos[a]=rs.getString(a+1);
				 }
				 ((DefaultTableModel) tabla1.getModel()).addRow(Datos);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargaTabla() {
		columnitas();
		for(int i=0;i<tabla1.getRowCount();i++) {
			((DefaultTableModel) tabla1.getModel()).removeRow(0);
		}
		tabla1.setModel(new DefaultTableModel(new Object[][] {},nomColumnas));
		((JPanel) TodoPanel.get(paneles.getSelectedIndex())).add(scrollPane1);
		scrollPane1.setVisible(true);
		anterior.setVisible(true);
		siguiente.setVisible(true);
		registraDatos();
		
		add.setBounds(552, 37, 100, 23);
		((JPanel) TodoPanel.get(paneles.getSelectedIndex())).add(add);
		
		borrar.setBounds(552, 86, 100, 23);
		((JPanel) TodoPanel.get(paneles.getSelectedIndex())).add(borrar);
		
		editar.setBounds(552, 133, 100, 23);
		((JPanel) TodoPanel.get(paneles.getSelectedIndex())).add(editar);
		
		refrescar.setBounds(552,180,100,23);
		((JPanel) TodoPanel.get(paneles.getSelectedIndex())).add(refrescar);
		
		if(paneles.getSelectedIndex()==1) {
			anterior.setEnabled(false);
			siguiente.setEnabled(true);
		}else {
			anterior.setEnabled(true);
			siguiente.setEnabled(true);
			if(paneles.getSelectedIndex()==4) {
				siguiente.setEnabled(false);
			}
		}
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TodoPanel=new ArrayList();
		envioCadena=new ArrayList();
		add = new JButton("A\u00D1ADIR");
		borrar = new JButton("BORRAR");
		editar = new JButton("EDITAR");
		refrescar=new JButton("REFRESH");
		tabla1=new JTable();
		scrollPane1=new JScrollPane(tabla1);
		inicio=new JPanel();cachimba=new JPanel();tienda=new JPanel();repartidor=new JPanel();paquete=new JPanel();
		paneles=new JTabbedPane();
		
		TodoPanel.add(inicio);TodoPanel.add(tienda);TodoPanel.add(cachimba);TodoPanel.add(repartidor);TodoPanel.add(paquete);
		tienda.setName("Tienda");
		cachimba.setName("Cachimbas");
		repartidor.setName("Repartidor");
		paquete.setName("Paquete");
		
		paneles.setBounds(100, 100, 506, 309);
		paneles.add("Inicio", inicio); 
		paneles.add("Tienda", tienda); 
		paneles.add("Cachimbas", cachimba);
		paneles.add("Repartidor",repartidor);
		paneles.add("Paquete",paquete);
		inicio.setLayout(null);
		cachimba.setLayout(null);
		tienda.setLayout(null);
		repartidor.setLayout(null);
		paquete.setLayout(null);
		

		
		btn1 = new JButton("IR a Tienda");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paneles.setSelectedIndex(1);
			}
		});
		
		btn1.setBounds(10, 30, 198, 23);
		inicio.add(btn1);
		
		btn3 = new JButton("IR a Repartidor");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				paneles.setSelectedIndex(3);
			}
		});
		btn3.setBounds(10, 101, 198, 23);
		inicio.add(btn3);
		
		btn2 = new JButton("IR a Cachimbas");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				paneles.setSelectedIndex(2);
			}
		});
		btn2.setBounds(10, 64, 198, 23);
		inicio.add(btn2);
		
		btn4 = new JButton("IR a Paquete");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				paneles.setSelectedIndex(4);
			}
		});
		btn4.setBounds(10, 135, 198, 23);
		inicio.add(btn4);
		
		btn5 = new JButton("Cerrar");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				cerrar();
			}
		});
		btn5.setBounds(136, 207, 82, 23);
		inicio.add(btn5);
		
		siguiente = new JButton("");
		siguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				paneles.setSelectedIndex(paneles.getSelectedIndex()+1);
			}
		});
		siguiente.setIcon(new ImageIcon("C:\\Users\\alexi\\CarpetaClase\\Programacion\\Eclipse\\TEMA 9 TRABAJO\\src\\imagenes\\flecha-derecha.png"));
		siguiente.setVisible(false);
		
		anterior = new JButton("");
		anterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				paneles.setSelectedIndex(paneles.getSelectedIndex()-1);
			}
		});
		anterior.setIcon(new ImageIcon("C:\\Users\\alexi\\CarpetaClase\\Programacion\\Eclipse\\TEMA 9 TRABAJO\\src\\imagenes\\flecha-izquierda.png"));
		anterior.setVisible(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(paneles, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(siguiente, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(216))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(paneles, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(anterior)
						.addComponent(siguiente))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
		
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				paneles.setSelectedIndex(1);
			}
		});
		
		paneles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				frame.setTitle(paneles.getSelectedComponent().getName());
				if(paneles.getSelectedIndex()==0) {
					anterior.setVisible(false);
					siguiente.setVisible(false);
					scrollPane1.setVisible(false);
					
				}else {
					frame.setBounds(100, 100, 714, 353);
					JOptionPane.showMessageDialog(frame, "Refrescando Los Datos"); 
					scrollPane1.setBounds(0,0,((JPanel) TodoPanel.get(paneles.getSelectedIndex())).getWidth()-200,((JPanel) TodoPanel.get(paneles.getSelectedIndex())).getHeight());
					cargaTabla();
					JOptionPane.showMessageDialog(frame, "Cargado con éxito"); 
				}
			}
		});
		
		
		borrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(tabla1.getSelectedRow()==-1) {
					JOptionPane.showMessageDialog(frame, "No has seleccionado ninguna fila para borrar");
				}else {
					int opc=JOptionPane.showConfirmDialog(frame, "¿Estás seguro de que quieres borrar esta fila?\nNo podrás deshacer los cambios", "Borrar Fila", 0, 0);
					if(opc==0) {
						try {
							Connection conn = null;
							Statement stmt = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(DB_URL, USER, PASS);
							stmt = conn.createStatement();
							if(paneles.getSelectedIndex()==1) {
								int cantidad = stmt.executeUpdate("DELETE FROM Tienda WHERE Nombre="+tabla1.getValueAt(tabla1.getSelectedRow(), 0));
								if (cantidad==1) {
									JOptionPane.showMessageDialog(frame, "La tienda"+tabla1.getValueAt(tabla1.getSelectedRow(), 0)+" ha sido borrada"); 
								} 
								conn.close(); 
								((DefaultTableModel) tabla1.getModel()).removeRow(tabla1.getSelectedRow());
							}else {
								//
								//
								if(paneles.getSelectedIndex()==2) {
									int cantidad = stmt.executeUpdate("DELETE FROM Cachimbas WHERE ID="+tabla1.getValueAt(tabla1.getSelectedRow(), 0));
									if (cantidad==1) {
										JOptionPane.showMessageDialog(frame, "La cachimba con ID"+tabla1.getValueAt(tabla1.getSelectedRow(), 0)+" ha sido borrada"); 
									} 
									conn.close(); 
									((DefaultTableModel) tabla1.getModel()).removeRow(tabla1.getSelectedRow());
								//
								//
								}else {
									
								}
							}
						}catch(Exception a) {
							a.printStackTrace();
						}
					}
				
				}
			
			}
		});
		refrescar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "Refrescando Los Datos"); 
				cargaTabla();
				JOptionPane.showMessageDialog(frame, "Cargado con éxito"); 
			
			}
		});
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(paneles.getSelectedIndex()==1) {
					accionador="add";
					addEditTienda.main(accionador, envioCadena);
				}else {
					if(paneles.getSelectedIndex()==2) {
						accionador="add";
						addEditCachimba.main(accionador,envioCadena);
					}else {
						if(paneles.getSelectedIndex()==3) {
							accionador="add";
							addEditRepartidor.main(accionador,envioCadena);
						}else {
							if(paneles.getSelectedIndex()==4) {
								accionador="add";
								addEditPaquete.main(accionador,envioCadena);
							}
						}
					}
				}
			
			}
		});
		editar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					if(tabla1.getSelectedRow()==-1) {
						JOptionPane.showMessageDialog(frame, "No has seleccionado ninguna fila para editar"); 
					}else {
						Connection conn = null;
						Statement stmt = null;
						Class.forName("com.mysql.jdbc.Driver");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery("SELECT * FROM "+paneles.getSelectedComponent().getName()+"");
						ResultSetMetaData metaDatos = rs.getMetaData();
						envioCadena.clear();
						for (int i = 0; i < metaDatos.getColumnCount(); i++) {
							envioCadena.add(tabla1.getValueAt(tabla1.getSelectedRow(), i));
						}
						if(paneles.getSelectedIndex()==1) {
							accionador="editar";
							addEditTienda.main(accionador,envioCadena);
						}else {
							if(paneles.getSelectedIndex()==2) {
								accionador="editar";
								addEditCachimba.main(accionador,envioCadena);
							}else {
								if(paneles.getSelectedIndex()==3) {
									accionador="editar";
									addEditRepartidor.main(accionador,envioCadena);
								}else {
									if(paneles.getSelectedIndex()==4) {
										accionador="editar";
										addEditPaquete.main(accionador,envioCadena);
									}
								}
							}
						}
						
					}
					
				}catch(Exception a) {
					a.getStackTrace();
				}
				
			
			}
		});
		
	}
}
