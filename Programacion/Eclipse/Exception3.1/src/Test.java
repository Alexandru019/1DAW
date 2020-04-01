import java.util.*;
public class Test {
	
	public static double hallarMedia(double a[]) {
		try {
		double promedio=0;
		for(int i=0;i<10;i++) {
			promedio+=a[i];
		}
		
		System.out.println("");
		return promedio/10;
		}
	catch(IndexOutOfBoundsException b) {
		System.out.println("Posiciones no existentes");
		return 0;
	}
	}
	public static void Añade(double a[]) {
		Scanner lee=new Scanner(System.in);
		try {
			for(int i=0;i<10;i++) {
				System.out.print("Nota examen "+(i+1)+": ");
				double nota=lee.nextDouble();
				a[i]=nota;
			}
		}
		catch(InputMismatchException b) {
			System.out.println("No puedes introducir texto en las notas");
		}	
	}
	

	public static void main(String[] args) {
		
			double [] notas=new double [10];
			Scanner Leer=new Scanner(System.in);
			System.out.print("Hola usuario \nDime tu nombre: ");
			String Nombre=Leer.next();
			System.out.println("Introduce las notas que has sacado en los examenes");
			Añade(notas);
			System.out.println("Hola "+Nombre+" la media de tus notas es: "+hallarMedia(notas));
	}

}
