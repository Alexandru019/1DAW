
public class Vehiculo {
	private String Nombre;
	
	public Vehiculo(String nombre) {
		Nombre = nombre;
	}
	public Vehiculo( ) {
		Nombre = "";
	}
	public String transportar(){
		return "Metodo transportar de clase Vehiculo";
		}
	public String getnombreVehiculo() {
		return Nombre;
	}
	public void setnombreVehiculo(String nombre) {
		Nombre = nombre;
	}
	
}
