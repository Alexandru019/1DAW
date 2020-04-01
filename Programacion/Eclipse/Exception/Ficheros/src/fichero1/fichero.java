package fichero1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class fichero {
private static String FILE_NAME="C:/Users/alexi/Desktop/fichero1.txt";
public static void main(String[] args) {
 int contador = 0;
 try{
 FileReader input = new FileReader(FILE_NAME);
 int c = input.read();
 while ( c !=-1){
 contador = contador + 1;
 c = input.read();
 }
 input.close();
 System.out.println(contador);
 }
 catch (IOException ex){
 System.out.println("Algo ha ocurrido");
 }
 }
 } 