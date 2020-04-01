
public class Empleado {
	private String nombre;
	private String cod_empleado;
	private int edad;
	private boolean casado;
	private double salario;
	private String Nivel;
	
	public Empleado(String nombre, String cod_empleado, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.cod_empleado = cod_empleado;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public Empleado() {
		this.nombre ="";
		this.cod_empleado ="";
		this.edad = 0;
		this.casado = false;
		this.salario = 0;
	}
	
	public String NivelEmpleado() {
		if (this.edad<=21) {
			this.Nivel="Principiante";
		}
		if (this.edad>=22 && this.edad<=35) {
			this.Nivel="Intermedio";
		}
		if (this.edad>35) {
			this.Nivel="Senior";
		}
		return this.Nivel;
	}

	public void ImprimirEmpleado() {
		NivelEmpleado();
		System.out.println("\t-Nombre=" + nombre + "\n\t-cod_empleado=" + cod_empleado + "\n\t-edad=" + edad + "\n\t-casado=" + casado
		+ "\n\t-salario=" + salario + "\n\t-Nivel=" + Nivel);
	}
	
	public void AumentarSalario(double c) {
		this.salario=this.salario+(this.salario*c);
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setsalario(double salario) {
		this.salario = salario;
	}
	

	



	
	
}
