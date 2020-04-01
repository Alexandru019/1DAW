package Exception2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		try {
		char Categoria='A';
		Scanner Leer=new Scanner(System.in);
		System.out.print("Hola usuario \nDime tu nombre: ");
		String Nombre=Leer.next();
		System.out.print(Nombre+" dime tu edad: ");
		int Edad=Leer.nextInt();
		if(Edad>=0 && Edad<=26) {
			Categoria='A';
		}
		if(Edad>26 && Edad<=50) {
			Categoria='B';
		}
		if(Edad>50 && Edad<=75) {
			Categoria='C';
		}
		System.out.println("Usuario "+Nombre+" de Categoria "+Categoria+" ,en una decada tendrá "+(Edad+10)+" años");
		}
		catch(InputMismatchException a) {
			System.out.println("-----¡¡Error!!-----\nHas de introducir un número entero");
		}
	}

}
