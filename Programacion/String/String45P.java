import java.util.Scanner;
class String45P{
public static void main (String [] args){
	Scanner Leer=new Scanner (System.in);
	System.out.println("Introduce una secuencia de caracteres \n");
	String Secuencia=Leer.nextLine();
	System.out.println("Introduce la letra que quieras contar \n");
	char Letra=Leer.next().charAt(0);
	int contador=0;
	int longi=Secuencia.length();
	int Posicion=0;
	while(Posicion!=-1){
		Posicion=Secuencia.indexOf(Letra,Posicion+1);
		System.out.println(Posicion);
	}
}
}
		
