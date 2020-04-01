import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejer1 {

	public static void main(String[] args) {
		
		try {
			FileWriter fichero = new FileWriter("/home/alumno/Escritorio");
			System.out.println("Escribe tu nombre");
			Scanner Leer=new Scanner (System.in);
			String nombre=Leer.next();
			for (int i = 0; i < nombre.length(); i++) {
				fichero.write(nombre.charAt(i));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fichero.close();
			}catch(IOException e) {
				
			}
		}
		
	}

}
