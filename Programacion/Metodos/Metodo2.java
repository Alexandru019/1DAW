import java.util.Scanner;
class Metodo2{
	static int n1,n2,sumatorio=0;
	static void sumarnumeros(int n1,int n2){
		if ((n1<0 || n1>15) && (n2<0 || n2>15)){
			System.out.println("Valores invalidos");
		}else{
			if(n1>n2){	
			while(n1>=n2){
				sumatorio=sumatorio+n1;
				n1--;
			}System.out.println("El resultado es "+sumatorio);
		}else{
			if(n1<=n2){
			while(n1<=n2){
				sumatorio=sumatorio+n1;
				n1++;
			}System.out.println("El resultado es "+sumatorio);
	}}
}
}

	
			

public static void main (String [] args){
	Scanner Leer= new Scanner (System.in);
	System.out.println("Introduce un número entre 1 y 15");
	int n1 = Leer.nextInt();
	System.out.println("Introduce otro número entre 1 y 15");
	int n2 = Leer.nextInt();
	sumarnumeros( n1, n2);
	
	

	
	
	
	
	
}
}

	
	
	
	
	
	
