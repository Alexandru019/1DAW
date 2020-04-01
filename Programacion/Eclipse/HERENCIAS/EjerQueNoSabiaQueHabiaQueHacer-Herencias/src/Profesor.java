public class Profesor extends Persona {
 private String IdProfesor;

 public Profesor(String nombre, String apellidos, int edad) {
	super(nombre, apellidos, edad);
	IdProfesor = "";
}
public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor; }
 public String getIdProfesor () { return IdProfesor; }
 public void mostrarNombreApellidosYCarnet() {
 System.out.println ("Profesor de nombre: " + getNombre() + " " + getApellidos() +
 " con Id de profesor: " + getIdProfesor() ); } 
}