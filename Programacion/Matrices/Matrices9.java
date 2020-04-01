
class Matrices9{
	final static int Array[]=new int [3];
	final static int Array1[]=new int [3];
	final static int Array2 []=new int [6];
	public static int getaleatorio(){
	int valorEntero = (int)Math.floor(Math.random()*(100-1+1)+1);
	return valorEntero;
	}
	
	public static void ordena(int A[]) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
}
public static void muestra(){
		ordena(Array2);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		for(int i=0;i<6;i++){
			
			System.out.print(Array2[i]+" ");
			}
	}

    public static void main(String [] args) {
		
		for(int i=0;i<3;i++){
			Array[i]=getaleatorio();
			System.out.print(Array[i]+" ");
			
			
			Array1[i]=getaleatorio();
			System.out.print(Array1[i]+" ");
			
		}
		
			for(int i=0;i<3;i++){
				Array2[i]=Array[i];
				}
				int b=0;
			for(int i=3;i<6;i++){
				
				Array2[i]=Array1[b];
				b++;
				}
				muestra();
				System.out.println(" ");
			
		
			

					
			
		
    }
    }
