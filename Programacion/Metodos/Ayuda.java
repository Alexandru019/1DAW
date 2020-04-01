import java.util.Scanner;
public class Ayuda{
	
	  static int num1,num2,resultado;

	 static int opcion;
	 static Scanner lector;
	 
	static int ayudaSumar(int a,int b){
		return a+b;}
	static int ayudaRestar(int a,int b){
		return a-b;}
	static int ayudaMultiplicar(int a,int b){
		return a*b;}
	static int ayudaDividir(int a,int b){
		return a/b;}
	
public static void main(String[]args){
		lector= new Scanner (System.in);
		do{
			System.out.println("Te puedo ayudar a: ");
			System.out.println("1. Sumar ");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Fin");
			System.out.print("Eliga una de las opciones: ");
			opcion=lector.nextInt();
			}while(opcion>=5);			
			if(opcion>0 && opcion<=4){
				System.out.print("De acuerdo!! Ahora introduce tu primer numero: ");
				num1=lector.nextInt();
				System.out.print("De acuerdo!! Ahora introduce tu segundo numero: ");
				num2=lector.nextInt();
				
				switch(opcion){
					case 1:
						resultado=ayudaSumar(num1,num2);
						break;
					case 2:
						resultado=ayudaRestar(num1,num2);
						break;
					case 3:
						resultado=ayudaMultiplicar(num1,num2);
						break;
					case 4:
						resultado=ayudaDividir(num1,num2);
						break;	
				}
					System.out.println("El resultado de la operacion es: "+resultado);
			}	
				else
					opcion=1;			
	}
}
