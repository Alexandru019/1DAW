
public abstract class Profesor extends Persona{
	private String IdProfesor;
	
	public Profesor(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad);
		IdProfesor = idProfesor;
	}
	public String getIdProfesor() {
		return IdProfesor;
	}
	public abstract void MostrarDatos();
	public abstract float getSalario();
	
}
