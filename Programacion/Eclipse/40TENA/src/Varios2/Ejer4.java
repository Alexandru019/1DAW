package Varios2;

import java.util.*;

import javax.swing.*;

public class Ejer4 {


	public static void main(String[] args) {
		int confirm=0;
	while(confirm==0){
		String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
		String clave = JOptionPane.showInputDialog("Ingresa tu código de empleado");
		if(clave.equals("1")) {
			JOptionPane.showMessageDialog(null, "Tu estas en el area de OFICINA");
		}else {
			if(clave.equals("2")) {
				JOptionPane.showMessageDialog(null, "Tu estas en el area de ALMACEN");
			}
		}
		String faltas=JOptionPane.showInputDialog("¿Cuantos dias faltaste?");
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre+" tu código es "+clave+"\nFaltaste "+faltas+" días");
		String yesno=JOptionPane.showInputDialog("¿Quieres volver al programa?(S/N)");
		if(yesno.equals("N")) {
			confirm=1;
			System.exit(0);
		}
	}
		
	}

}
