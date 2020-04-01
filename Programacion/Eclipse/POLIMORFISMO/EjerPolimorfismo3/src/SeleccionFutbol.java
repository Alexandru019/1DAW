
public class SeleccionFutbol {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void viajar() {}
	public void concentrarse() {}
	public void entrenamiento() {}
	public void partidoFutbol() {}

	public String getApellidos() {
		return apellidos ;
	}

	public String getNombre() {
		return nombre;
	}
	
}
