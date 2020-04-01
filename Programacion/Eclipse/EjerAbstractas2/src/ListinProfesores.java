
public class ListinProfesores {

	private Persona[] listinProfesores;
	
	public ListinProfesores() {
		this.listinProfesores = new Persona [6];
	}
	public void addProfesor(Profesor profesor) {
		for (int i=0;i<6;i++) {
			if(listinProfesores[i] instanceof ProfesorTitular || listinProfesores[i] instanceof ProfesorInterino) {
				
			}else {
				listinProfesores[i]=profesor;
				i=6;
			}
		}
	}
	public void imprimirListin() {
		for(int i=0;i<6;i++) {
			if(listinProfesores[i] instanceof ProfesorTitular || listinProfesores[i] instanceof ProfesorInterino) {
				((Profesor) listinProfesores[i]).MostrarDatos();
			}
		}
	}
	public float importeTotalNominaProfesorado() {
		float b=0;
		for(int i=0;i<6;i++) {
			if(listinProfesores[i] instanceof ProfesorTitular || listinProfesores[i] instanceof ProfesorInterino) {
			b+=((Profesor) listinProfesores[i]).getSalario();
			}
		}
		return b;
	}
}
