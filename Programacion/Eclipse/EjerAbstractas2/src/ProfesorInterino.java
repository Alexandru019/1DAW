import java.util.Calendar;
public class ProfesorInterino extends Profesor {
	private Calendar fechaComienzoInterinidad;
	private float Salario;
	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor,
			Calendar fechaComienzoInterinidad) {
		super(nombre, apellidos, edad, idProfesor);
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
		this.Salario=1200;
	}

	public Calendar getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	@Override
	public String toString() {
		return super.toString()+"Fecha comienzo interinidad: "+fechaComienzoInterinidad.getTime();
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre: "+getNombre()+"\n Apellidos: "+getApellidos()+"\n Edad: "+getEdad()+"\n IdProfesor: "+getIdProfesor()+"\n Fecha de interinidad: "+fechaComienzoInterinidad.getTime());
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
	
	
	
	
}
