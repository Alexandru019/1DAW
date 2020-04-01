package fichero2;

import java.io.FileWriter;
import java.io.IOException;
public class fichero {
private static String FILE_NAME ="C:/Users/alexi/Desktop/fichero1.txt";

public static void main(String[] args) {
 try {
 String text = "Enter a text: ";
 FileWriter output = new FileWriter(FILE_NAME);
 for(int i=0;i<text.length();i++){
 output.write(text.charAt(i));
 }
 output.close();
 }
 catch(IOException ex) {
 System.out.println("Algo malo ha ocurrido");
 }
 }
} 