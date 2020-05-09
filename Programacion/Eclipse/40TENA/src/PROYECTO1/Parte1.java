package PROYECTO1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.eclipse.swt.events.MouseListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import java.awt.Font;
import java.awt.ItemSelectable;

import javax.swing.DropMode;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Parte1 {

	private JFrame advertencia;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte1 window = new Parte1();
					window.advertencia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Parte1() {
		initialize();
		advertencia.setTitle("TÉRMINOS DE USO");
	}

	private void initialize() {
		
		btn=new JButton("Continuar");
		
		advertencia = new JFrame();
		advertencia.setBounds(100, 100, 372, 370);
		advertencia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		advertencia.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 58, 336, 232);
		advertencia.getContentPane().add(scrollPane);
		
		JTextArea textArea = 	new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Serif", Font.PLAIN, 13));
		textArea.setTabSize(500);
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setText("El Usuario reconoce y acepta que el uso de los contenidos y/o servicios ofrecidos por la presente\r\n" + 
				"aplicación móvil será bajo su exclusivo riesgo y/o responsabilidad. El Usuario se compromete a utilizar la\r\n" + 
				"presente aplicación móvil y todo su contenido y Servicios de conformidad con la ley, la moral, el orden\r\n" + 
				"público y las presentes Condiciones de Uso, y las Condiciones Particulares que, en su caso, le sean de\r\n" + 
				"aplicación. Asimismo, se compromete hacer un uso adecuado de los servicios y/o contenidos de la\r\n" + 
				"aplicación móvil y a no emplearlos para realizar actividades ilícitas o constitutivas de delito, que atenten\r\n" + 
				"contra los derechos de terceros y/o que infrinjan la regulación sobre propiedad intelectual e industrial, o\r\n" + 
				"cualesquiera otras normas del ordenamiento jurídico aplicable. En particular, el Usuario se compromete a\r\n" + 
				"no trasmitir, introducir, difundir y poner a disposición de terceros, cualquier tipo de material e\r\n" + 
				"información (datos contenidos, mensajes, dibujos, archivos de sonido e imagen, fotografías, software,\r\n" + 
				"etc.) que sean contrarios a la ley, la moral, el orden público y las presentes Condiciones de Uso y, en su caso, a las Condiciones Particulares que le sean de aplicación. ");
		
		JLabel lblNewLabel = new JLabel("T\u00E9rminos de Uso y Condiciones");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(74, 33, 217, 14);
		advertencia.getContentPane().add(lblNewLabel);
		
		JCheckBox check = new JCheckBox("He le\u00EDdo los t\u00E9rminos");
		check.setBounds(6, 297, 174, 23);
		advertencia.getContentPane().add(check);
		
		ButtonGroup grupo=new ButtonGroup();
		
		JRadioButton acepto = new JRadioButton("Acepto");
		acepto.setEnabled(false);
		acepto.setBounds(182, 297, 81, 23);
		advertencia.getContentPane().add(acepto);
		
		JRadioButton denegar = new JRadioButton("No Acepto");
		denegar.setEnabled(false);
		denegar.setBounds(263, 297, 87, 23);
		advertencia.getContentPane().add(denegar);
		
		grupo.add(acepto);grupo.add(denegar);
		
		check.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(check.isSelected()) {
					acepto.setEnabled(true);denegar.setEnabled(true);
				}else {
					acepto.setEnabled(false);denegar.setEnabled(false);
				}
			}
		});
		acepto.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(acepto.isSelected()) {
					advertencia.setBounds(100, 100, 372, 420);
					btn.setBounds(117, 327, 89, 23);
					advertencia.getContentPane().add(btn);
				}
				
			}
		});
		denegar.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(denegar.isSelected()) {
					advertencia.setBounds(100, 100, 372, 420);
					btn.setBounds(117, 327, 89, 23);
					advertencia.getContentPane().add(btn);
				}
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(denegar.isSelected()) {
					JOptionPane.showMessageDialog(advertencia, "El programa se cerrará");
					System.exit(0);
				}else {
					JOptionPane.showMessageDialog(advertencia, "Bienvenido al programa");
					advertencia.dispose();
					Tabla.main(null);
				}
			}
		});
		
		
		
		
	}
}
