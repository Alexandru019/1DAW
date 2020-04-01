import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner Leer=new Scanner (System.in);
		String [] nombres=new String [3];
		String [] apellidos=new String [3];
		String [] completo=new String [3];
		for(int i=0;i<3;i++) {
			System.out.println("Introduce un nombre");
			nombres[i]=Leer.next();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Introduce un apellido");
			apellidos[i]=Leer.next();
		}
		for(int i=0;i<3;i++) {
			completo[i]=nombres[i]+" "+apellidos[i];
		}
		for(int i=0;i<3;i++) {
			System.out.println("Nombre completo: "+completo[i]);
		}
		
		
	}

}
