
public class SerVivo {
	private byte edad;

	public SerVivo(byte i) {
		this.edad = i;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SerVivo [edad=" + edad + "]";
	}
	
	public boolean equals(SerVivo otro) {
		return false;
	}
}
