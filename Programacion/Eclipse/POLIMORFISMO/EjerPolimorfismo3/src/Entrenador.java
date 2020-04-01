
public class Entrenador extends SeleccionFutbol {
	private int idFederacion;

	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	public void planificarEntrenamiento() {}
	
	
	

}
