import java.util.Scanner;
class String5{
public static void main (String [] args){
	Scanner Leer=new Scanner (System.in);
	System.out.println("Introduce una frase ");
	String Frase= Leer.nextLine();
	String Frasenueva="";
	int Posicioninicial=0,Posicionfinal=0;
		while(Posicionfinal!=-1){
			Posicionfinal= Frase.indexOf(" ",Posicionfinal+1);
			if (Posicionfinal==-1){
				Posicionfinal=Frase.length()-1;
			}
			String Palabra=Frase.substring(Posicioninicial,Posicionfinal+1);
			Posicioninicial=Posicionfinal;
			Frasenueva=Palabra+" "+Frasenueva;
			
			if (Posicionfinal==Frase.length()-1)
			Posicionfinal=-1;
			}
	System.out.println(Frasenueva);
}
	}
	
