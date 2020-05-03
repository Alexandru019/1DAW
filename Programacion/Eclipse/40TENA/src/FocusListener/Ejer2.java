package FocusListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ejer2 {

	private JFrame frame;
	private JTextField textField;

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
	public boolean esNumerico(String a) {
		boolean resul=true;
		try {
		    int resultado = Integer.parseInt(a);} 
		catch(NumberFormatException e) {
		    resul=false;}
		return resul;
	}
	
	public boolean comprobarDNI(String dni) {
		boolean resul=false;
		if(dni.length()==9) {
			String num=dni.substring(0, 7);
			String letra=dni.substring(8);
			if(esNumerico(num)) {
				int n1=Integer.parseInt(num);
				int resto=n1%23;
				switch (resto) {
				case 0:
					if(letra.equals("T")) {resul=true;}
					break;
				case 1:
					if(letra.equals("R")) {resul=true;}
					break;
				case 2:
					if(letra.equals("W")) {resul=true;}
					break;
				case 3:
					if(letra.equals("A")) {resul=true;}
					break;
				case 4:
					if(letra.equals("G")) {resul=true;}
					break;
				case 5:
					if(letra.equals("M")) {resul=true;}
					break;
				case 6:
					if(letra.equals("Y")) {resul=true;}
					break;
				case 7:
					if(letra.equals("F")) {resul=true;}
					break;
				case 8:
					if(letra.equals("P")) {resul=true;}
					break;
				case 9:
					if(letra.equals("D")) {resul=true;}
					break;
				case 10:
					if(letra.equals("X")) {resul=true;}
					break;
				case 11:
					if(letra.equals("B")) {resul=true;}
					break;
				case 12:
					if(letra.equals("N")) {resul=true;}
					break;
				case 13:
					if(letra.equals("J")) {resul=true;}
					break;
				case 14:
					if(letra.equals("Z")) {resul=true;}
					break;
				case 15:
					if(letra.equals("S")) {resul=true;}
					break;
				case 16:
					if(letra.equals("Q")) {resul=true;}
					break;
				case 17:
					if(letra.equals("V")) {resul=true;}
					break;
				case 18:
					if(letra.equals("H")) {resul=true;}
					break;
				case 19:
					if(letra.equals("L")) {resul=true;}
					break;
				case 20:
					if(letra.equals("C")) {resul=true;}
					break;
				case 21:
					if(letra.equals("K")) {resul=true;}
					break;

				default:
					if(letra.equals("E")) {resul=true;}
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 314, 259);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(29, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(71, 52, 180, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton INS = new JButton("INSERTAR");
		INS.setBounds(40, 138, 112, 23);
		frame.getContentPane().add(INS);
		
		JButton RES = new JButton("ANULAR");
		RES.setBounds(162, 138, 89, 23);
		frame.getContentPane().add(RES);
		
		JLabel info = new JLabel("");
		info.setBounds(29, 100, 222, 14);
		frame.getContentPane().add(info);
		
		RES.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				INS.enable();
				info.setText("");
			}
		});
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (comprobarDNI(textField.getText())==false) {
					INS.disable();
					info.setText("DNI no válido");
				}else {
					info.setText("ACEPTADO");
				}
			}
		});
	}

}
