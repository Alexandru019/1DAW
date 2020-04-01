package Ejercicio3;
import java.util.Scanner;
public class NumberDivision {
	public static void Divide(String a,String b) {
		try {
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			int resultado=num1/num2;
			System.out.println("El resultado de la division: "+resultado);
		}catch(NumberFormatException e) {
			System.out.println("Numeros no validos");
		}catch(ArithmeticException c) {
			System.out.println("No se puede divir entre cero");
		}
	}
	public static void main (String [] args) {
		Scanner Leer=new Scanner (System.in);
		System.out.println("Dime un número");
		String num1=Leer.next();
		System.out.println("Dime un número");
		String num2=Leer.next();
		Divide(num1,num2);
	}
}
