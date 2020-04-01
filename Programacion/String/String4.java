import java.util.Scanner;
class String4{
public static void main (String [] args){
	Scanner Leer=new Scanner (System.in);
	System.out.println("Introduce una frase \n");
	String Frase= Leer.nextLine();
	System.out.println("Introduce la palabra que quieras eliminar \n ");
	String Palabra= Leer.next();
	int pos=Frase.indexOf(Palabra);
	int longi = Palabra.length();
	String Frase1=Frase.substring(0,pos);
	String Frase2=Frase.substring(pos+longi,Frase.length());
	
	System.out.println(Frase1+Frase2);
	
	
	
	
}

}
