
public class Humano extends SerVivo {
	private String Nombre;

	public Humano(byte edad, String nombre) {
		super(edad);
		Nombre = nombre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public boolean equals(Humano otro) {
		return false;
	}
	public Humano mayor(Humano otro) {
		if(this.getEdad()>otro.getEdad()) {
			return this;
		}else 
		return otro;
	}
	
}
