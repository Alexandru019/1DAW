import java.util.Scanner;
public class Operacion {
	private int valor1;
	private int valor2;
	private int resultado;
	Scanner Leer=new Scanner (System.in);
	
	public Operacion() {
		setValor1(0);
		setValor2(0);
		setResultado(0);
	}
	public Operacion(int a,int b,int c) {
		this.setValor1(a);
		this.setValor2(b);
		this.setResultado(c);
	}
	
	public void cargar1() {
		System.out.println("Escribe un numero");
		this.setValor1(Leer.nextInt());
	}
	public void cargar2() {
		System.out.println("Escribe un numero");
		this.setValor2(Leer.nextInt());
	}
	public void mostrarResultado() {
		System.out.println(getResultado());
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
}
