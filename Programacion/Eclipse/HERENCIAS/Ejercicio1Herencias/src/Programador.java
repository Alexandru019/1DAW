
public class Programador extends Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador(String nombre, String cod_empleado, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, cod_empleado, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	public Programador() {
		super();
		this.lineasDeCodigoPorHora = 0;
		this.lenguajeDominante = "";
	}
	
	

}
