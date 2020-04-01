import java.util.Scanner;
public class String2{

	public static void main(String [] args){
		Scanner Leer= new Scanner (System.in);	
		System.out.println("Introduce una frase");
		String Frase= Leer.nextLine();
		System.out.println("");
		System.out.println(Frase.length());
		
		
		String FraseMayusculas= Frase.toUpperCase();
		System.out.println(FraseMayusculas);
		
		String FraseMinusculas= Frase.toLowerCase();
		System.out.println(FraseMinusculas);
		
		String Caracteres3AI8= Frase.substring(3,8);
		System.out.println(Caracteres3AI8);
		
		int NumPalabras=0, Posicion=0;
		
		while(Posicion!=-1){
			Posicion= Frase.indexOf(" ",Posicion+1);
			NumPalabras++;
		}
		System.out.println(NumPalabras);
		
	}
}
