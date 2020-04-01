package Ejercicio6;

public class ControlDeAños extends Exception {
	
	public ControlDeAños(String t) {
		super(t);
	}
	public ControlDeAños() {
		super("Fecha mal introducida");
	}
}
