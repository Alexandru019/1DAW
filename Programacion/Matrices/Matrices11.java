import java.util.Scanner;
	class Matrices11{
		 static int tamaño;
		 static int Array[];
		 static int n1, n2;
		
		public static int getaleatorioprimo(int a,int b){
			int valorEntero;
			if (a<b){
				valorEntero = (int)Math.floor(Math.random()*(b-a+1)+a);
			}else{
				valorEntero= (int)Math.floor(Math.random()*(a-b+1)+b);
			}
			return valorEntero;
		}
		public static void control(int a [],int b,int c){
			int i=0;
			
			while(i<tamaño){
				int valor=getaleatorioprimo(b,c);
				int n=2;
				boolean primo=true;
				while(primo==true && n<valor){
					if(valor%2==0){
						primo=false;
					}else{
						n+=1;
					}
				}if(primo==true){
					a[i]=valor;
					i++;
				}
			}	
		}
	public static int mayor(int d []){
       int c=0;
       for(int i=0;i<tamaño;i++){
           if(d[c]<d[i]){
               d[c]=d[i];
		   }
	   }
	   return d[c];
               
		
		
		}
	
	
	
	
	public static void main (String [] args){
		Scanner Leer=new Scanner (System.in);
		System.out.println("Dime la dimesion del array");
		tamaño=Leer.nextInt();
		int Array[]=new int[tamaño];
		
		System.out.println("Dime dos numeros");
			n1=Leer.nextInt();
			n2=Leer.nextInt();
		System.out.println("");
		control(Array,n1,n2);
		for (int i=0;i<tamaño;i++){
			System.out.print(Array[i]+"\t");
			}
		System.out.println();
		System.out.println("El mayor número impar es el :"+mayor(Array));
		

		}	
		}
