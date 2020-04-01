import java.util.Scanner;
class Matrices2 {
	public static void main(String [] args){
		Scanner Leer=new Scanner (System.in);
		System.out.println("Escribe 5 numeros enteros y hago la media");
		int Num [] = new int [6];
		int Media=0;
		for (int i=0;i!=5;i++){
			Num[i]=Leer.nextInt();
			Media+=Num[i];
		}
		System.out.println("");
		System.out.println("La suma es de: "+Media);
		System.out.println("La media es: "+Media/5);		
	}
	}
