
public class SerVivo {
	private byte edad;
	
	public SerVivo(byte edad) {
		this.edad = edad;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	public boolean equals(SerVivo otro) {
		if (edad==otro.getEdad()) 
			return true;
		else 
			return false;
		
	}

	@Override
	public String toString() {
		return "SerVivo [edad=" + edad + "]";
	}
	
	
}
