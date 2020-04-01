import java.util.Scanner;
class Metodo4{
	
	static void colores(char a){
		switch (a){
			case 'v':
				System.out.println("Tu color es Verde");
				break;
			case 'V':
				System.out.println("Tu color es Verde");
				break;
			case 'a':
				System.out.println("Tu color es Amarillo");
				break;
			case 'A':
				System.out.println("Tu color es Amarillo");
				break;
			case 'g':
				System.out.println("Tu color es Gris");
				break;
			case 'G':
				System.out.println("Tu color es Gris");
				break;
			case 'n':
				System.out.println("Tu color es Negro");
				break;
			case 'N':
				System.out.println("Tu color es Negro");
				break;
			case 'b':
				System.out.println("Tu color es Blanco");
				break;
			case 'B':
				System.out.println("Tu color es Blanco");
				break;
			
			
			default:
				System.out.println("No tenemos otros colores");
				break;
		
	}
}
	
	public static void main (String [] args){
	Scanner Leer= new Scanner (System.in);
	System.out.println("Introduce una de estas letras v,a,g,n,b");
	char n1 = Leer.next().charAt(0);
	colores(n1);
	
	}
}
