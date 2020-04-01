import java.util.Scanner;
	class Metodo5{
		
		
		
		static double aplicadescuento(double precio,double pago,double descuento,int n1){
				return pago=precio*n1;
			}
		}	
		
		public static void main (String [] args){
		 double precio=3.5,pago=0,descuento=0;
			 int n1;
		Scanner Leer= new Scanner (System.in);
		System.out.println("Introduce la cantidad de articulos que quieres comprar");
	 n1=	Leer.nextInt();
		aplicadescuento(precio,pago,descuento,n1);
		
			
			
			
		
		
		
		
		
		
		}
	}
