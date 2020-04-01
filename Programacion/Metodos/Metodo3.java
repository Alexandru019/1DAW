import java.util.Scanner;
class Metodo3{
	
	static void DiaDeLaSemana(int n1){
		switch (n1){
			case 1:
				System.out.println("Es Lunes");
				break;
			case 2:
				System.out.println("Es Martes");
				break;
			case 3:
				System.out.println("Es Miercoles");
				break;
			case 4:
				System.out.println("Es Jueves");
				break;
			case 5:
				System.out.println("Es Viernes");
				break;
			case 6:
				System.out.println("Es Sabado");
				break;
			case 7:
				System.out.println("Es Domingo");
				break;
			default:
				System.out.println("No existen otros dias");
				break;
		
	}
}
	
	public static void main (String [] args){
		Scanner Leer= new Scanner (System.in);
	System.out.println("Introduce un número entre 1 y 7");
	int n1 = Leer.nextInt();
	DiaDeLaSemana(n1);
	
	}
}
