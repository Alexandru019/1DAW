package JOptionPanel;


import javax.swing.*;

import org.eclipse.ui.dialogs.YesNoCancelListSelectionDialog;

import java.awt.*;
public class Ejer1 {
	public static void main(String[] args) {
		try {
			String primer,segundo;
			int n1,n2;
			primer=JOptionPane.showInputDialog(null, "Ingrese primer sumando");
			n1=Integer.parseInt(primer);
			segundo=JOptionPane.showInputDialog(null, "Ingrese segundo sumando");
			n2=Integer.parseInt(segundo);
			JOptionPane.showMessageDialog(null, "El resultado de la suma es "+(n1+n2));
		}catch(NumberFormatException a) {
			JOptionPane.showOptionDialog(null, "Has de introducir un número", "Error", 2, 0, null, null, null);
		}
			
}
}  