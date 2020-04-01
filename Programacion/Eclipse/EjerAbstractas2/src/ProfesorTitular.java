
public class ProfesorTitular extends Profesor{
	private float Salario;
	public ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad, idProfesor);
		this.Salario=1000;
	}
	public void MostrarDatos() {
		System.out.println("Nombre: "+getNombre()+"\n Apellidos: "+getApellidos()+"\n Edad: "+getEdad()+"\n IdProfesor: "+getIdProfesor());
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	
	
}
