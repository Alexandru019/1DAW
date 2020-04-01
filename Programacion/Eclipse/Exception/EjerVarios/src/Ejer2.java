import java.util.Scanner;
public class Ejer2 {
	public static void main (String [] args) {
		Scanner Leer=new Scanner (System.in);
		boolean salir=false;
		int nota;int media=0;
		int contador=0;
		do {
			System.out.println("Introduzca una nota de examen");
			nota=Leer.nextInt();
			if (nota < 0 || nota >10) {
				try {
					throw new ErrorNumerico();
				}catch (ErrorNumerico e) {
					e.getMessage();
				}
			}else {
				contador++;
				media=media+nota;
			}
			System.out.println("Quiere seguir introduciendo notas (S/N)");
			char FUERA=Leer.next().charAt(0);
			if (FUERA == 'N') {
				salir=true;
				System.out.println("La media de las notas introducidas es "+media/contador);
			}
		} while (salir==false);
	}
}

