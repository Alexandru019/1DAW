package Ejercicio1;
import java.util.Scanner;
public class Ejer1 {
	public static void main (String [] args) {
	Scanner Leer=new Scanner (System.in);
	int edad;
	System.out.println("Dime tu edad");
	edad=Leer.nextInt();
	if (edad < 0 || edad >130) {
		try {
			throw new ControlDeEdad();
		}catch (ControlDeEdad e) {
			System.out.println(e.getMessage());
		}
	}

}
}