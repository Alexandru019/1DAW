import java.util.Scanner;
class Matrices6{
    public static void main(String [] args) {
        Scanner Leer=new Scanner(System.in);
        int [][]matriz= new int [3][3];
        int [][]matriz2= new int [3][3];
        int [][]matriz3= new int [3][3];
        int b=0;
        int c=8;
        System.out.println("");
        for ( int i=0; i<3; i++) {
			for ( int z=0; z<matriz.length; z++) {
				matriz[i][z]=b;
				System.out.print(matriz[i][z]);
				b+=1;
			}
			System.out.print("\t \t \t");
			for ( int z=0; z<matriz2.length; z++) {
				matriz2[i][z]=c;
				System.out.print(matriz2[i][z]);
				c-=1;
			}
		System.out.println("");
		}
		System.out.println("");
		System.out.println("La suma de las matrices da lugar a la siguiente matriz");
		System.out.println("");
		
		for ( int i=0; i<3; i++) {
			for ( int z=0; z<matriz3.length; z++) {
				matriz3[i][z]=8;
				System.out.print(matriz3[i][z]);
				
			}
			System.out.println("");
		}
    }
}
