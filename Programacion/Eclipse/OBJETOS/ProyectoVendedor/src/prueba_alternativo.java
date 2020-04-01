import java.util.Scanner;
public class prueba_alternativo {
	public static void main (String[] args) {
		Scanner Leer=new Scanner (System.in);
		System.out.println("Introduce la cantidad de vendedores que hay");
		int total=Leer.nextInt();
		Vendedor [] vendedores=new Vendedor [total];
		for(int i=0;i<total;i++) {
			vendedores[i] = new Vendedor();
		 }
		for(int i=0;i<total;i++) {
			Scanner Leer1=new Scanner (System.in);
			System.out.println("Introduce el nombre de un vendedor");
			vendedores[i].setNombre(Leer1.nextLine());
		}
		for(int i=0;i<total;i++) {
			System.out.println("Introduce el numero de ventas que ha realizado "+vendedores[i].getNombre());
			vendedores[i].setVentas(Leer.nextInt());	
		}
		System.out.println("El ganador es "+Vendedor.getGanador()+" con un total de ventas de "+Vendedor.getVganador());
}
}
