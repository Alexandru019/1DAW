
public abstract class Animals {
	private String Nombre;

	Animals(String nombre) {
		Nombre=nombre;
	}
	public String getNombre() {
		return Nombre;
	}
	public abstract void tipoAnimal();

}
