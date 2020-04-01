import java.util.Scanner;
class Matrices3 {
	public static void main (String [] args){
		Scanner Leer=new Scanner (System.in);
		System.out.println("Escribe 10 numeros enteros y hago la media de los de la posicion par");
		int Num [] = new int [11];
		int Media=0;
		for (int i=0;i!=10;i++){
			Num[i]=Leer.nextInt();
			if(i%2==0)
			Media+=Num[i];
		}
		System.out.println("");
		System.out.println("La media es de: "+Media/5);

	}
	}
