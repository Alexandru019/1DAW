package fichero2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.w3c.dom.DOMImplementationList;

public class Prueba {
	public static void main(String[] args) {

			 try {
			 throw new Exception("Esto es una Excepcion");
			 } catch(Exception e) {
			 System.out.println("Se produjo un excepcion: " + e.getMessage());
			 } finally {
			 System.out.println("Esto se ejecuta sin importar si se presentan errores");
			 }

}
}
