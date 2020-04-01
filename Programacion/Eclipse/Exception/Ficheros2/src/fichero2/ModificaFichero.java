package fichero2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModificaFichero {
	private static String FILE_NAME ="/home/alumno/Escritorio/datos.txt";

	public static void main(String[] args) {
		boolean FIN=false;
			do {
				 Scanner Leer=new Scanner (System.in);
				 System.out.println("Escribe lo que quieras añadir al final del fichero");
				 String text = Leer.nextLine();
				 if(text.equals("FIN")) {
					 FIN=true;
				 }else {
					 try{
						 FileWriter Escribe = new FileWriter(FILE_NAME,true);
						 Escribe.write("\n");
						 for(int i=0;i<text.length();i++){
							 Escribe.write(text.charAt(i));
					 }
					 Escribe.close();
					 }
					 catch(IOException E) {
						 System.out.println("No tienes permisos de escritura o la ruta introducida no existe");
					 }
					 }
				  
			
		} while (FIN==false);
	}
	}


