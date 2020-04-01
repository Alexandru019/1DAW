
public class Resta extends Operacion{

	public Resta() {
		super();
	}

	public Resta(int a, int b, int c) {
		super(a, b, c);
		
	}
	public void operar() {
		this.setResultado(getValor2()-getValor1());
	}
	
	
	
}
