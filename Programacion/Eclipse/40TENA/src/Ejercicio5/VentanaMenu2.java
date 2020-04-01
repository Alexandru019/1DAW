package Ejercicio5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaMenu2 extends JFrame{
   private JMenuBar barraMenu;
   private JMenu menuArchivo;
   private JMenuItem itmSalir;
   /* Constructor Por Defecto */
   public VentanaMenu2() {
       super("Ejemplo JMenuBar");
       /* Inicializo todos los componentes de la ventana */
       this.barraMenu  = new JMenuBar();  
       this.menuArchivo = new JMenu("Archivo");
       this.itmSalir = new JMenuItem("Salir");
       /* llamo al metodo init para ir agregando los componentes a la ventana */
       this.init();   
   }
   public void init() {
       this.setSize(250,300);
       /* le digo que al presionar el boton "X" el programa se detenga */
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       /*  Ahora empezaré a agregar el JMenu al JMenuBar y el JMenuItem al JMenu */
       this.barraMenu.add(this.menuArchivo);
       this.menuArchivo.add(this.itmSalir);
       this.setJMenuBar(this.barraMenu); /* agrego el JMenuBar a esta ventana */
       this.programaEventos(); /* Llamo al metodo "programaEventos()" para asignarle evento a al JMenuItem */
       this.setVisible(true);
   }
   
   public static void main(String[] ar) {
    VentanaMenu2 formulario1=new VentanaMenu2();
       formulario1.setBounds(10,20,300,200);
       formulario1.setVisible(true);
   }
   
   public void programaEventos() {
       ActionListener ejemploA = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   System.exit(0);
           }  
       };
       this.itmSalir.addActionListener(ejemploA);
   }

}
