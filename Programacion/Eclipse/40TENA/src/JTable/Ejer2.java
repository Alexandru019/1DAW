package JTable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer2 {
	
	private int numFilas;
	private DefaultTableModel modelotabla;
	private JFrame frame;
	private JTable tabla;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;

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
		
		numFilas=0;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("WQE");
		lblNewLabel.setBounds(10, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SDM");
		lblNewLabel_1.setBounds(10, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PWD");
		lblNewLabel_2.setBounds(10, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MQRE");
		lblNewLabel_3.setBounds(10, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setBounds(66, 37, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(66, 62, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(66, 87, 86, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(66, 112, 86, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
	
		modelotabla=new DefaultTableModel();
		tabla=new JTable(modelotabla);
		tabla.setModel(new DefaultTableModel(
				new Object [][] {},
				new String [] {"WQE","SDM","PWD","MQRE"	}
							));
		
		JScrollPane panelTabla = new JScrollPane(tabla);
		panelTabla.setBounds(206, 11, 218, 239);
		frame.getContentPane().add(panelTabla);
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] fila = new Object[4]; 
		        
				 fila[0] =tf1.getText();
				 fila[1] =tf2.getText();
				 fila[2] =tf3.getText();
				 fila[3]= tf4.getText();
				((DefaultTableModel) tabla.getModel()).addRow(fila);
				numFilas++;
			}
		});
		btnNewButton.setBounds(10, 198, 68, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<numFilas;i++) {
				((DefaultTableModel) tabla.getModel()).removeRow(0);
				}
			}
		});
		btnNewButton_1.setBounds(88, 198, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
