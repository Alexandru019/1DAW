
public class Cliente {
	private int Datos;
	private String Nombre;
	private static int contador=0;
	
	public Cliente(int a,String b,String c,String d) {
		contador++;	
		this.Datos=a;
		this.Nombre=b+" "+c+" "+d;
		
	}
	public String NombreCliente() {
		return this.Nombre ;
	}
	public int MuestraDatos() {
		return this.Datos;
	}
	public static int TotalClientes() {
		return contador;
	}
}
