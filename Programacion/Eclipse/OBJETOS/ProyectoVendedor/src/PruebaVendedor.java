import java.util.Scanner;
public class PruebaVendedor {
	public static void main (String[] args) {
		Scanner Leer=new Scanner (System.in);
		int v1=0; int v2=0; int v3=0;
		Vendedor Vendedor1=new Vendedor ();
		Vendedor Vendedor2=new Vendedor ();
		Vendedor Vendedor3=new Vendedor ();
		System.out.println("Introduce el nombre de un vendedor");
		Vendedor1.setNombre(Leer.nextLine());
		System.out.println("Introduce el nombre de otro vendedor");
		String n2=Leer.nextLine();
		System.out.println("Introduce el nombre del ultimo vendedor");
		String n3=Leer.nextLine();
		Vendedor2.setNombre(n2); Vendedor3.setNombre(n3);
		System.out.println("Introduce el numero de ventas ha realizado "+Vendedor1.getNombre());
		v1=Leer.nextInt();
		System.out.println("Introduce el numero de ventas ha realizado "+Vendedor2.getNombre());
		v2=Leer.nextInt();
		System.out.println("Introduce el numero de ventas ha realizado "+Vendedor3.getNombre());
		v3=Leer.nextInt();
		Vendedor1.setVentas(v1); Vendedor2.setVentas(v2); Vendedor3.setVentas(v3);
		System.out.println("El ganador es "+Vendedor.getGanador()+" con un total de ventas de "+Vendedor.getVganador());
}
}
