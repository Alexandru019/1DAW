import java.util.Scanner;
class Matrices12{
	public static void Multiplicar(int a[],int b[],int c){
	int d []=new int [c];
	System.out.println("El array multiplicado es:\t");
	for(int i=0;i<c;i++){
		d[i]=a[i]*b[i];
		System.out.print(d[i]+"\t");
	}
}
	
public static void main(String [] args){
	Scanner Leer= new Scanner(System.in);
	System.out.println("Dime cuanta longitud quieres que tengan los Arrays");
	int longi=Leer.nextInt();
	int Array1 []=new int [longi];
	int Array2 []=new int [longi];
	for(int i=0;i<longi;i++){
		Array1[i]=(int)Math.floor(Math.random()*(10-0+1)+0);
		Array2[i]=(int)Math.floor(Math.random()*(10-0+1)+0);
	}
	System.out.println("LA PRIMERA MATRIZ:");
	for(int i=0;i<longi;i++){
	System.out.print(Array1[i]+" ");
	}
	System.out.println();
	System.out.println();
	System.out.println("LA SEGUNDA MATRIZ:");
	for(int i=0;i<longi;i++){
	System.out.print(Array2[i]+" ");
	}
	System.out.println();
	Multiplicar(Array1,Array2,longi);
	System.out.println();
	Leer.close();
}
}
