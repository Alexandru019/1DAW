package Fuera;
import Necesario.*;
public class Aplicacion {

	public static void main(String[] args) {
		Asignatura asignatura1=new Asignatura ();
		Asignatura asignatura2=new Asignatura ("Sistemas",8);
		Asignatura asignatura3=new Asignatura ("Entornos",3);
		Alumno Pablo=new Alumno(18,"Pablo",asignatura1);
		Alumno Perico=new Alumno(19,"Perico",asignatura2);
		Alumno Pedro=new Alumno(20,"Pedro",asignatura3);
		System.out.println(Pablo.getNombre());
		System.out.println(Pablo.getEdad());
		System.out.println("Cursó : "+asignatura1.getNombre()+" y el/la alumn@ está "+asignatura1.Aprobado()+" con un "+asignatura1.getNota());
		System.out.println();
		System.out.println(Perico.getNombre());
		System.out.println(Perico.getEdad());
		System.out.println("Cursó : "+asignatura2.getNombre()+" y el/la alumn@ está "+asignatura2.Aprobado()+" con un "+asignatura2.getNota());
		System.out.println();
		System.out.println(Pedro.getNombre());
		System.out.println(Pedro.getEdad());
		System.out.println("Cursó : "+asignatura3.getNombre()+" y el/la alumn@ está "+asignatura3.Aprobado()+" con un "+asignatura3.getNota());
		
	}

}
