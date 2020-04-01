package buzón.correo;
public class Correo {
	private String texto;
	private boolean leido;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto=texto;
	}
	public boolean isLeido() {
		return leido;
	}
	public void setLeido(boolean leido) {
		this.leido=leido;
	}
	public String toString() {
		return "Correo [leido="+leido+", texto="+texto+"]";
	}
	public Correo(String texto,boolean leido) {
		super();
		this.texto=texto;
		this.leido=leido;
	}
	public Correo(String texto) {
		this.texto=texto;
	}
}
