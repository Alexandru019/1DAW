import java.util.Arrays;
class Matrices10{
	final static int Array[]=new int [100];
	
	
	public static int getaleatorio(){
		
	int valorEntero = (int)Math.floor(Math.random()*(50-1+1)+1);
	return valorEntero;
	}
	
	 public static void main(String [] args) {
		 int coincidencias=0;
		 
		 for(int i=0;i<100;i++){
			 
			Array[i]=getaleatorio();
			System.out.print(Array[i]+" ");
		}
			System.out.println(" ");
			System.out.println(" ");
			Arrays.sort(Array);
			for(int i=0;i<Array.length;i++) {
			System.out.print(Array[i]+"\t");
		}
			System.out.println();
			System.out.println();
			for(int j=1;j<=50;j++){
			 for(int i=0;i<Array.length;i++){
				
				if(j==Array[i]) {
					coincidencias++;
				}
				
			}
			 if(coincidencias==0) {
					System.out.print(j+"\t");
				}
			 coincidencias=0;
		}

		System.out.println("");		
		}
	 }
 
 	
