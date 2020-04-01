public class Humano {
	private String nombre;
	private byte edad;
	public Humano(String n,byte e) {
		this.nombre = n;
		this.edad = e;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(byte e) {
		this.edad= e;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
		
	}
	public boolean equals(Humano otro) {
		if((this.nombre.equals(otro.nombre)) && (this.edad == (otro.edad))) {
			return true;
		}else {
			return false;
		}
		
	}
}