import java.util.Scanner;
class String6 {
	static void cuentapalabras(String Frase){
		
		int NumPalabras=0, Posicion=0;
		
		while(Posicion!=-1){
			Posicion= Frase.indexOf(" ",Posicion+1);
			NumPalabras++;
		}
		System.out.println("El numero de palabras es: "+NumPalabras);
	}
	
	static void eliminapalabra(String Frase){
		Scanner Leer= new Scanner (System.in);
		System.out.println("Introduce la palabra que quieras eliminar \n ");
		String Palabra= Leer.next();
		int pos=Frase.indexOf(Palabra);
		int longi = Palabra.length();
		String Frase1=Frase.substring(0,pos);
		String Frase2=Frase.substring(pos+longi,Frase.length());
			System.out.println(""); 
		System.out.println(Frase1+Frase2);
	}
	
	static void inviertefrase(String Frase){
		Scanner Leer= new Scanner (System.in);
		String Frasenueva="";
		int Posicioninicial=0,Posicionfinal=0;
		while(Posicionfinal!=-1){
			Posicionfinal= Frase.indexOf(" ",Posicionfinal+1);
			if (Posicionfinal==-1){
				Posicionfinal=Frase.length()-1;
			}
			String Palabra=Frase.substring(Posicioninicial,Posicionfinal+1);
			Posicioninicial=Posicionfinal;
			Frasenueva=Palabra+Frasenueva;
			
			if (Posicionfinal==Frase.length()-1)
			Posicionfinal=-1;
			}
		System.out.println(Frasenueva);
	}


public static void main (String [] args){
	Scanner Leer= new Scanner (System.in);
	System.out.println("Introduce una frase \n ");
	String Frase= Leer.nextLine();
		System.out.println("");
	System.out.println("Menu de opciones");
	System.out.println("\t Contar palabras");
	System.out.println("\t Eliminar palabras");
	System.out.println("\t Obtener la inversa");
	System.out.println("Escribe la opcion que deseas realizar");
	System.out.println("");
	String Opcion= Leer.nextLine();
		System.out.println(""); 
	String Contar="Contar palabras";
	String Elimina="Eliminar palabras";
	String Inversa="Obtener la inversa";
	
	if (Opcion.equals(Contar)){
		cuentapalabras(Frase);
	}else{
		if (Opcion.equals(Elimina)){
			eliminapalabra(Frase);
		}else{
			if (Opcion.equals(Inversa)){
				inviertefrase(Frase);
			}else{
				System.out.println("Disculpe las molestias no ofrecemos este servicio");
			}
		}
	}
}
}
