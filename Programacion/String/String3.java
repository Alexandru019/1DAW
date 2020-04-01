import java.util.Scanner;
class String3{
public static void main (String [] args){
	Scanner Leer=new Scanner (System.in);
	System.out.println("Introduce una frase");
		String Frase= Leer.nextLine();
		System.out.println("");
		int NumPalabras=0, Posicion=0;
		
		while(Posicion!=-1){
			Posicion= Frase.indexOf(" ",Posicion+1);
			NumPalabras++;
		}
		System.out.println(NumPalabras);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
