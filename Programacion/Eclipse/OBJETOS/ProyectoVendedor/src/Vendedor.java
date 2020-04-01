public class Vendedor {
	private int Ventas;
	private String Nombre;
	private static String Ganador="";
	private static int Vganador=0;
	
	public Vendedor() {
		this.Nombre="";
		this.Ventas=0;
		if (this.Ventas>Vganador) {
			Vganador=this.Ventas;
			Ganador=this.Nombre;
		}
	}
	public Vendedor(int a,String b){
		this.Ventas=a;
		this.Nombre=b;
		if (this.Ventas>Vganador) {
			Vganador=this.Ventas;
			Ganador=this.Nombre;
		}
	}
	public void setNombre(String d) {
		this.Nombre= d;
	}
	public String getNombre() {
		return this.Nombre;
	}
	public void setVentas(int e) {
		this.Ventas= e;
		if (this.Ventas>Vganador) {
			Vganador=this.Ventas;
			Ganador=this.Nombre;
		}
	}
	public int getVentas() {
		return this.Ventas;
	}
	public static int getVganador(){
		return Vganador;
	}
	public static String getGanador(){
		return Ganador;
	}
	
}
