import java.util.Scanner;
class Metodo1{
	
	static void imprimepares(int n1,int n2){
	if ((n1 >=0 && n1<=1000) && (n2>=0 && n2<=1000)){
		if (n1%2==0 && n2%2==0 && n1<n2){
			while(n1<n2){
				n1+=2;
				System.out.println(n1);
				
		}}if (n1%2==0 && n2%2==0 && n2<n1){
			while(n2<n1){
				n1-=2;
				System.out.println(n1);
		}}if (n1%2!=0 && n2%2!=0 && n1<n2){
			n1+=1;
			n2-=1;
			while(n1<n2){
				System.out.println(n1);
				n1+=2;
			}System.out.println(n2);
		}if (n1%2!=0 && n2%2==0 && n1<n2){
			n1+=1;
			while(n1<n2){
				System.out.println(n1);
				n1+=2;
		}}if (n1%2==0 && n2%2!=0 && n1<n2){
			n2-=1;
			while(n1<n2){
				n1+=2;
				System.out.println(n1);}
		
			//bajando voy
		}if (n1%2!=0 && n2%2!=0 && n1>n2){
			n1-=1;
			n2+=1;
			while(n1>n2){
				System.out.println(n1);
				n1-=2;
			}System.out.println(n2);
		}if (n1%2!=0 && n2%2==0 && n1>n2){
			n1-=1;
			while(n1>n2){
				System.out.println(n1);
				n1-=2;
		}}if (n1%2==0 && n2%2!=0 && n1>n2){
			n2+=1;
			while(n1>n2){
				n1-=2;
				System.out.println(n1);
			}}
				
		
				
			}else
			System.out.println("De 0 a 1000 no más ni menos we");
		}
	






public static void main (String [] args){
	Scanner Leer= new Scanner (System.in);
	System.out.println("Introduce un número entre 0 y 1000");
	int n1 = Leer.nextInt();
	System.out.println("Introduce otro número entre 0 y 1000");
	int n2 = Leer.nextInt();
	System.out.println();
	imprimepares( n1, n2);
}
}
	
	
