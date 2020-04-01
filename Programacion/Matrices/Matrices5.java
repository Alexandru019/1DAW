import java.util.Scanner;
class Matrices5{
    public static void main(String [] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("INTRODUCE 10 NUMEROS");
        int NUM[]=new int [10];
        String recoge=" ";
        int contador=0;
        for(int i=0;i<10;i++){
            NUM[i]=Leer.nextInt();
            if(NUM[i]%2==0){
                recoge=recoge+NUM[i]+" ";
                contador+=1;  
            }
        }
        if(contador==0){
			System.out.println("No hay pares");
		}else{
        int b=0;
        System.out.println("");
        int Par[]=new int [contador];
        for(int i=0;i<10;i++){
            if(NUM[i]%2==0){
                Par[b]=NUM[i];
                b+=1;
            }
        }
        int pos=0;
       int c=0;
       for(int i=0;i<b;i++){
           if(Par[c]<Par[i]){
               Par[c]=Par[i];
               pos+=1;
           }
       }
		System.out.println("Los numeros pares son: "+recoge);
       System.out.println("El numero par mas grande es: "+Par[c]+" con la posicion: "+pos); 
       
   }
    }
}
