
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
		if(this.Nombre.equals(otro.getNombre())&& this.getEdad()==otro.getEdad()) 
			return true;
		else 
			return false;
	}
	
	public Humano mayor(Humano otro) {
		int cmp=Nombre.compareTo(otro.getNombre());
		if(cmp>0) {
			return otro;
		}
		else 
			return this;
	}

	@Override
	public String toString() {
		return Nombre +" "+this.getEdad()+ " años de edad";
	}
	
	

	
	
}
