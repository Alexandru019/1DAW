
public class Suma extends Operacion{
	
	public Suma() {
		super();
	}
	public Suma(int valor1,int valor2,int resultado) {
		super(valor1,valor2,resultado);
	}
	public void operar() {
		setResultado(getValor1()+getValor2());
	}
	
}
