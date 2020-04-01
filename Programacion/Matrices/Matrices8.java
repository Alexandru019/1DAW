class Matrices8{
	
	final static int POS =50;
	final static int LIMITE =100;
	final static int lista[]=new int [POS];
	
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
		ordena(lista);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		for(int i=0;i<POS;i++){
			
			System.out.print(lista[i]+" ");
			}
	}

    public static void main(String [] args) {
	
		for(int i=0;i<POS;i++){
			lista[i]=getaleatorio();
			System.out.print(lista[i]+" ");
			}
		muestra();
		System.out.println(" ");

					
			
		
    }
    }
