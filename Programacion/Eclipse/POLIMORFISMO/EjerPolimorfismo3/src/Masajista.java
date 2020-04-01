
public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int aniosExperiencia;
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	public void darMasaje() {
	}
}
