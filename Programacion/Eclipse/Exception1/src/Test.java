import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner Leer=new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int n1=Leer.nextInt();
		System.out.println("Escribe otro numero:");
		int n2=Leer.nextInt();
		try {
			int resultado=n1/n2;
			System.out.println(resultado);
		}
		catch(ArithmeticException a) {
			System.out.println("No se puede dividir esos numeros");
		}
}
}
